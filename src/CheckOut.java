import java.util.Scanner;

public class CheckOut {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalCost = 0.0;

        boolean moreItems = true;
        while (moreItems) {

            System.out.print("Enter the price of your item ($0.50 - $10.00): ");
            double price = 0.0;
            boolean validPrice = false;
            do {
                if (scanner.hasNextDouble()) {
                    price = scanner.nextDouble();
                    if (price >= 0.50 && price <= 10.00) {
                        validPrice = true;
                    } else {
                        System.out.println("Invalid input. Please enter a price between $0.50 and $10.00.");
                    }
                } else {
                    System.out.println("Invalid input. Please enter a valid number.");
                    scanner.next();
                }
            } while (!validPrice);

            totalCost += price;


            System.out.print("Do you have more items? (Y/N): ");
            boolean validResponse = false;
            do {
                String response = scanner.next().trim().toUpperCase();
                if (response.equals("Y")) {
                    moreItems = true;
                    validResponse = true;
                } else if (response.equals("N")) {
                    moreItems = false;
                    validResponse = true;
                } else {
                    System.out.println("Invalid input. Please enter 'Y' for yes or 'N' for no.");
                }
            } while (!validResponse);
        }


        System.out.printf("The total cost of your items is: $%.2f%n", totalCost);
    }
}
