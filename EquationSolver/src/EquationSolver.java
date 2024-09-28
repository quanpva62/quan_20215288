import java.util.Scanner;

public class EquationSolver {

    public static void solveLinearEquation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Solving linear equation (ax + b = 0)");

        System.out.print("Enter coefficient a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter coefficient b: ");
        double b = scanner.nextDouble();

        if (a == 0) {
            if (b == 0) {
                System.out.println("The equation has infinitely many solutions.");
            } else {
                System.out.println("The equation has no solution.");
            }
        } else {
            double solution = -b / a;
            System.out.println("The solution is x = " + solution);
        }
    }

    public static void solveLinearSystem() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Solving linear system of equations:");

        System.out.println("Equation 1: a11*x1 + a12*x2 = b1");
        System.out.println("Equation 2: a21*x1 + a22*x2 = b2");

        System.out.print("Enter a11: ");
        double a11 = scanner.nextDouble();
        System.out.print("Enter a12: ");
        double a12 = scanner.nextDouble();
        System.out.print("Enter b1: ");
        double b1 = scanner.nextDouble();

        System.out.print("Enter a21: ");
        double a21 = scanner.nextDouble();
        System.out.print("Enter a22: ");
        double a22 = scanner.nextDouble();
        System.out.print("Enter b2: ");
        double b2 = scanner.nextDouble();

        double D = a11 * a22 - a21 * a12;
        double D1 = b1 * a22 - b2 * a12;
        double D2 = a11 * b2 - a21 * b1;

        if (D == 0) {
            if (D1 == 0 && D2 == 0) {
                System.out.println("The system has infinitely many solutions.");
            } else {
                System.out.println("The system has no solution.");
            }
        } else {
            double x1 = D1 / D;
            double x2 = D2 / D;
            System.out.println("The solutions are x1 = " + x1 + " and x2 = " + x2);
        }
    }

    public static void solveQuadraticEquation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Solving quadratic equation (ax^2 + bx + c = 0)");

        System.out.print("Enter coefficient a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter coefficient b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter coefficient c: ");
        double c = scanner.nextDouble();

        if (a == 0) {
            System.out.println("This is not a quadratic equation. Treating it as a linear equation:");
            solveLinearEquation();
        } else {
            double delta = b * b - 4 * a * c;

            if (delta > 0) {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("The equation has two distinct real roots: x1 = " + x1 + ", x2 = " + x2);
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println("The equation has one double root: x = " + x);
            } else {
                System.out.println("The equation has no real roots.");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Solve linear equation (ax + b = 0)");
            System.out.println("2. Solve system of linear equations");
            System.out.println("3. Solve quadratic equation (ax^2 + bx + c = 0)");
            System.out.println("4. Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    solveLinearEquation();
                    break;
                case 2:
                    solveLinearSystem();
                    break;
                case 3:
                    solveQuadraticEquation();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}

