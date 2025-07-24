import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n---------------------- WELCOME TO MY SIMPLE CALCULATOR ----------------------\n");

            System.out.print("Enter two numbers separated by spaces: ");
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            System.out.println("\n-----------------------------------------------------------------------------");
            System.out.println("Press 1 for Addition (+) >>>");
            System.out.println("Press 2 for Subtraction (-) >>>");
            System.out.println("Press 3 for Multiplication (*) >>>");
            System.out.println("Press 4 for Division-Quotient (/) >>>");
            System.out.println("Press 5 for D-Remainder (%) >>>");
            System.out.println("Press 6 for Power (^) >>>");
            System.out.print("\nSelect any Operation : ");
            int op = scanner.nextInt();

            System.out.print("\nYour Answer is : ");

            switch (op) {
                case 1:
                    System.out.println(a + b);
                    break;
                case 2:
                    System.out.println(a - b);
                    break;
                case 3:
                    System.out.println(a * b);
                    break;
                case 4:
                    if (b != 0) {
                        System.out.println(a / b);
                    } else {
                        System.out.println("Error: Division by zero!");
                    }
                    break;
                case 5:
                    if (b != 0) {
                        System.out.println(a % b);
                    } else {
                        System.out.println("Error: Division by zero!");
                    }
                    break;
                case 6:
                    System.out.println(Math.pow(a, b));
                    break;
                default:
                    System.out.println("Operation not Found...! Please Try Again...");
            }

            System.out.println("\n-----------------------------------------------------------------------------");
            System.out.println("Press 1 for Continue >>>");
            System.out.println("Press 0 for End >>>");
            System.out.print("\nDo you want to Continue? (1/0) : ");
            choice = scanner.nextInt();

        } while (choice == 1);

        System.out.println("\nThank You for using this Calculator...!");
