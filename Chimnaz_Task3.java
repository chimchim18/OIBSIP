import java.util.*;

public class Chimnaz_Task3{
    private static double balance = 5000.0; 
    private static ArrayList<String> history = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to the ATM system!");

        System.out.print("Enter User ID: ");
        String userId = scanner.nextLine();
        System.out.print("Enter User PIN: ");
        String pin = scanner.nextLine();

        if (userId.equals("admin") && pin.equals("1234")) {
            System.out.println("\nLogin Successful! Access Granted.");
            showMenu();
        } else {
            System.out.println("Invalid credentials. System shutting down.");
        }
    }

    private static void showMenu() {
        while (true) {
            System.out.println("\nATM OPERATIONS");
            System.out.println("1. Transaction history");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Transfer");
            System.out.println("5. Quit");
            System.out.print("Choose an option (1-5): ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    showHistory();
                    break;
                case 2:
                    handleWithdraw();
                    break;
                case 3:
                    handleDeposit();
                    break;
                case 4:
                    handleTransfer();
                    break;
                case 5:
                    System.out.println("Thank you for using our ATM. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static void showHistory() {
        System.out.println("\nTransaction history");
        if (history.isEmpty()) {
            System.out.println("No recent transactions found.");
        } else {
            for (String record : history) {
                System.out.println(record);
            }
        }
        System.out.println("Current balance: $" + balance);
    }

    private static void handleWithdraw() {
        System.out.print("Enter amount to withdraw: $");
        double amount = scanner.nextDouble();
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            history.add("Withdrew: $" + amount);
            System.out.println("Please collect your cash. Balance updated successfully.");
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }

    private static void handleDeposit() {
        System.out.print("Enter amount to deposit: $");
        double amount = scanner.nextDouble();
        if (amount > 0) {
            balance += amount;
            history.add("Deposited: $" + amount);
            System.out.println("Cash deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    private static void handleTransfer() {
        System.out.print("Enter recipient's account number: ");
        scanner.next(); // acc verif
        System.out.print("Enter amount to transfer: $");
        double amount = scanner.nextDouble();

        if (amount > 0 && amount <= balance) {
            balance -= amount;
            history.add("Transferred: $" + amount);
            System.out.println("Transfer successful!");
        } else {
            System.out.println("Transaction failed. Insufficient funds.");
        }
    }
}
