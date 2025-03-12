import java.util.Scanner;

public class prettyHeader {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter the message to center in the pretty header:");
        String msg = scanner.nextLine();


        final int WIDTH = 60;


        for (int i = 0; i < WIDTH; i++) {
            System.out.print("*");
        }
        System.out.println();


        int messageLength = msg.length();
        int padding = (WIDTH - 6 - messageLength) / 2;


        System.out.print("***");
        for (int i = 0; i < padding; i++) {
            System.out.print(" ");
        }
        System.out.print(msg);
        for (int i = 0; i < padding; i++) {
            System.out.print(" ");
        }
        if ((WIDTH - 6 - messageLength) % 2 != 0) { // Handle odd spacing
            System.out.print(" ");
        }
        System.out.println("***");


        for (int i = 0; i < WIDTH; i++) {
            System.out.print("*");
        }
        System.out.println();

        scanner.close();
    }
}
