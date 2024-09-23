import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    static int getBirthNum(String prompt) {
        InputStreamReader sr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(sr);
        int birthNum = 0;

        try {
            System.out.print(prompt);
            birthNum = Integer.parseInt(br.readLine());
            if (birthNum > 12 || birthNum < 1) {
                throw new Exception("Incorrect range");
            }
            return birthNum;
        } catch (Exception e) {
            if (e.getMessage().equals("Incorrect range")) {
                System.out.println("You entered an incorrect month value: " + birthNum);
            }
            return getBirthNum(prompt);
        }
    }

    public static void main(String[] args) {
        int birthNum = getBirthNum("Enter brith month (int 1-12): ");
        System.out.println("Your brith month is: " + birthNum);
    }
}
