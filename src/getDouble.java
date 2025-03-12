import java.util.Scanner;

public class getDouble {

    /**
     * Method to safely get a double value from the user.
     * @param pipe - Scanner object to read input
     * @param prompt - Prompt message to display to the user
     * @return - A valid double value input by the user
     */
    public static double getDouble(Scanner pipe, String prompt) {
        double result = 0.0;
        boolean valid = false;

        do {
            System.out.print(prompt + ": ");
            if (pipe.hasNextDouble()) {
                result = pipe.nextDouble();
                pipe.nextLine();
                valid = true;
            } else {

                String trash = pipe.nextLine(); // Read and discard the invalid input
                System.out.println("Invalid input: " + trash + ". Please enter a valid double value.");
            }
        } while (!valid);

        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // Create a Scanner object


        double userInput = getDouble(in, "Enter any double value");
        System.out.println("You entered: " + userInput);

        in.close();
    }
}
