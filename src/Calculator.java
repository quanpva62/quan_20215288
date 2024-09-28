import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        String strNum1 = scanner.nextLine();
        double num1 = Double.parseDouble(strNum1);  // Chuyển từ chuỗi sang số double

        System.out.print("Enter the second number: ");
        String strNum2 = scanner.nextLine();
        double num2 = Double.parseDouble(strNum2);  // Chuyển từ chuỗi sang số double

        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);

        if (num2 != 0) {
            double quotient = num1 / num2;
            System.out.println("Quotient: " + quotient);
        } else {
            System.out.println("Cannot divide by zero!");
        }

        scanner.close();
    }
}
