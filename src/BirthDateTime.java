import java.util.Scanner;

public class BirthDateTime {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int year = 0;
        boolean validYear = false;
        do {
            System.out.print("Enter your birth year (1950-2015): ");
            if (scanner.hasNextInt()) {
                year = scanner.nextInt();
                if (year >= 1950 && year <= 2015) {
                    validYear = true;
                } else {
                    System.out.println("Invalid input. Please enter a year between 1950 and 2015.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.next();
            }
        } while (!validYear);


        int month = 0;
        boolean validMonth = false;
        do {
            System.out.print("Enter your birth month (1-12): ");
            if (scanner.hasNextInt()) {
                month = scanner.nextInt();
                if (month >= 1 && month <= 12) {
                    validMonth = true;
                } else {
                    System.out.println("Invalid input. Please enter a month between 1 and 12.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.next();
            }
        } while (!validMonth);


        int day = 0;
        boolean validDay = false;
        do {
            int maxDays = 31;
            switch (month) {
                case 2:
                    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                        maxDays = 29;
                    } else {
                        maxDays = 28;
                    }
                    break;
                case 4: case 6: case 9: case 11:
                    maxDays = 30;
                    break;
                default:
                    maxDays = 31;
            }

            System.out.print("Enter your birth day (1-" + maxDays + "): ");
            if (scanner.hasNextInt()) {
                day = scanner.nextInt();
                if (day >= 1 && day <= maxDays) {
                    validDay = true;
                } else {
                    System.out.println("Invalid input. Please enter a day between 1 and " + maxDays + ".");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.next();
            }
        } while (!validDay);


        int hour = 0;
        boolean validHour = false;
        do {
            System.out.print("Enter your birth hour (0-23): ");
            if (scanner.hasNextInt()) {
                hour = scanner.nextInt();
                if (hour >= 0 && hour <= 23) {
                    validHour = true;
                } else {
                    System.out.println("Invalid input. Please enter an hour between 0 and 23.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.next();
            }
        } while (!validHour);


        int minute = 0;
        boolean validMinute = false;
        do {
            System.out.print("Enter your birth minute (0-59): ");
            if (scanner.hasNextInt()) {
                minute = scanner.nextInt();
                if (minute >= 0 && minute <= 59) {
                    validMinute = true;
                } else {
                    System.out.println("Invalid input. Please enter a minute between 0 and 59.");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.next();
            }
        } while (!validMinute);


        System.out.printf("Your date and time of birth is: %d-%02d-%02d %02d:%02d%n", year, month, day, hour, minute);
    }
}
