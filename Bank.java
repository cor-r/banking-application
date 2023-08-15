import java.util.HashMap;
import java.util.Map;

class Bank {
    private Map<Integer, Account> accounts;
    private int accountNumberCounter;

    public Bank() {
        this.accounts = new HashMap<>();
        this.accountNumberCounter = 1000;
    }

    /**
     * Creates an account with holder name and starting balance.
     * @param accountHolderName
     * @param initialBalance
     */
    public void createAccount(String accountHolderName, double initialBalance) {
        int accountNumber = accountNumberCounter++;
        Account account = new Account(accountNumber, accountHolderName, initialBalance);
        accounts.put(accountNumber, account);
        System.out.println("Account created successfully. Account Number: " + accountNumber);
    }

    /**
     * Deposits given amount from given account number.
     * @param accountNumber
     * @param amount
     */
    public void deposit(int accountNumber, double amount) {
        Account account = accounts.get(accountNumber);
        if (account != null) {
            account.deposit(amount);
            System.out.println("Deposit successful. Current Balance: $" + account.getBalance());
        } else {
            System.out.println("Account not found.");
        }
    }

    /**
     * Withdraws given amount from given account number.
     * @param accountNumber
     * @param amount
     */
    public void withdraw(int accountNumber, double amount) {
        Account account = accounts.get(accountNumber);
        if (account != null) {
            if (account.getBalance() >= amount) {
                account.withdraw(amount);
                System.out.println("Withdrawal successful. Current Balance: $" + account.getBalance());
            } else {
                System.out.println("Insufficient balance.");
            }
        } else {
            System.out.println("Account not found.");
        }
    }

    /**
     * Retrieves the current balance of a given account.
     * @param accountNumber
     */
    public void getBalance(int accountNumber) {
        Account account = accounts.get(accountNumber);
        if (account != null) {
            System.out.println("Account Balance: $" + account.getBalance());
        } else {
            System.out.println("Account not found.");
        }
    }
}

class Account {
    private int accountNumber;
    private String accountHolderName;
    private double balance;

    public Account(int accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }
}


