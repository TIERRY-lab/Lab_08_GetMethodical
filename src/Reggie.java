import java.util.Scanner;
import java.util.regex.Pattern;

public class Reggie {
    private static Scanner scanner = new Scanner(System.in);

    public static String getRegExString(String prompt, String pattern) {
        String input;
        while (true) {
            System.out.println(prompt);
            input = scanner.nextLine();
            if (Pattern.matches(pattern, input)) {
                break;
            } else {
                System.out.println("Invalid input. Please try again.");
            }
        }
        return input;
    }

    public static void main(String[] args) {

        System.out.println("Testing SSN:");
        String ssn = getRegExString("Enter a valid SSN (###-##-####):", "^\\d{3}-\\d{2}-\\d{4}$");
        System.out.println("You entered a valid SSN: " + ssn);

        System.out.println("Testing UC Student M Number:");
        String mNumber = getRegExString("Enter a valid M number (M##### or m#####):", "^(M|m)\\d{5}$");
        System.out.println("You entered a valid M number: " + mNumber);

        System.out.println("Testing Menu Choice:");
        String menuChoice = getRegExString("Enter a menu choice (O/S/V/Q):", "^[OoSsVvQq]$");
        System.out.println("You selected: " + menuChoice);
    }
}
