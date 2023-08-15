import java.util.Scanner;

public class BankingSystemSimulation {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nWelcome to the Banking System Simulation!");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter account holder name: ");
                    String accountHolderName = scanner.nextLine();
                    System.out.print("Enter initial balance: $");
                    double initialBalance = scanner.nextDouble();
                    bank.createAccount(accountHolderName, initialBalance);
                    break;
                case 2:
                    System.out.print("Enter account number: ");
                    int depositAccountNumber = scanner.nextInt();
                    System.out.print("Enter deposit amount: $");
                    double depositAmount = scanner.nextDouble();
                    bank.deposit(depositAccountNumber, depositAmount);
                    break;
                case 3:
                    System.out.print("Enter account number: ");
                    int withdrawAccountNumber = scanner.nextInt();
                    System.out.print("Enter withdrawal amount: $");
                    double withdrawAmount = scanner.nextDouble();
                    bank.withdraw(withdrawAccountNumber, withdrawAmount);
                    break;
                case 4:
                    System.out.print("Enter account number: ");
                    int checkBalanceAccountNumber = scanner.nextInt();
                    bank.getBalance(checkBalanceAccountNumber);
                    break;
                case 5:
                    System.out.println("Program Terminated.");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}