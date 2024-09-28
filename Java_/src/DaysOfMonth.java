import java.util.Scanner;

public class DaysOfMonth {
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            }
            return true;
        }
        return false;
    }

    public static int getDaysInMonth(String month, int year) {
        switch (month.toLowerCase()) {
            case "january": case "1":
                return 31;
            case "february": case "2":
                return isLeapYear(year) ? 29 : 28;
            case "march": case "3":
                return 31;
            case "april": case "4":
                return 30;
            case "may": case "5":
                return 31;
            case "june": case "6":
                return 30;
            case "july": case "7":
                return 31;
            case "august": case "8":
                return 31;
            case "september": case "9":
                return 30;
            case "october": case "10":
                return 31;
            case "november": case "11":
                return 30;
            case "december": case "12":
                return 31;
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month;
        int year;

        while (true) {
            System.out.print("Enter the month (name, abbreviation, or number): ");
            month = scanner.nextLine();

            System.out.print("Enter the year (4-digit non-negative number): ");
            year = scanner.nextInt();
            scanner.nextLine();

            if (year >= 0 && getDaysInMonth(month, year) != -1) {
                break;
            } else {
                System.out.println("Invalid month or year. Please try again.");
            }
        }

        int days = getDaysInMonth(month, year);
        System.out.println("Number of days in " + month + " " + year + ": " + days);

        scanner.close();
    }
}
