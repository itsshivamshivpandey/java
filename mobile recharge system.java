// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.Scanner;

public class MobileRechargeSystem {
    private static double balance = 50.0; // Starting mobile balance (in ₹)

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("📱 Welcome to Mobile Recharge System");

        do {
            System.out.println("\nSelect an option:");
            System.out.println("1. Check Balance");
            System.out.println("2. Recharge");
            System.out.println("3. Use for Data/Call");
            System.out.println("4. Exit");
            System.out.print("Your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    recharge(scanner);
                    break;
                case 3:
                    useBalance(scanner);
                    break;
                case 4:
                    System.out.println("Thank you! Visit again.");
                    break;
                default:
                    System.out.println("Invalid option. Choose 1 to 4.");
            }

        } while (choice != 4);

        scanner.close();
    }

    static void checkBalance() {
        System.out.printf("💰 Current Balance: ₹%.2f%n", balance);
    }

    static void recharge(Scanner scanner) {
        System.out.print("Enter recharge amount (₹): ");
        double amount = scanner.nextDouble();
        if (amount > 0) {
            balance += amount;
            System.out.printf("✅ ₹%.2f recharged successfully!%n", amount);
        } else {
            System.out.println("❌ Invalid recharge amount.");
        }
    }

    static void useBalance(Scanner scanner) {
        System.out.print("Enter amount to use (data/call): ₹");
        double usage = scanner.nextDouble();
        if (usage <= 0) {
            System.out.println("❌ Invalid usage amount.");
        } else if (usage > balance) {
            System.out.println("⚠ Insufficient balance.");
        } else {
            balance -= usage;
            System.out.printf("📶 ₹%.2f used for data/call. Remaining: ₹%.2f%n", usage, balance);
        }
    }
}

