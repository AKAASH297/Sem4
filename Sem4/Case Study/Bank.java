import java.util.*;
import java.io.*;
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class BankAccount {
    private String accountHolder;
    private String accountNumber;
    private String accountType;
    private double balance;

    public BankAccount(String accountHolder, String accountNumber, String accountType, double initialBalance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("\nAmount Deposited: " + amount);
        } else {
            System.out.println("\nDeposit can't be Negative!");
        }
    }

    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("\nInsufficient Balance! Available Balance: " + balance);
        }
        balance -= amount;
        System.out.println("\nAmount Withdrawn: " + amount);
    }

    public double getBalance() {
        return balance;
    }

    public String AccountDetails() {
        return "\nAccount Holder: " + accountHolder + "\nAccount Number: " + accountNumber + "\nAccount Type: " + accountType + "\nBalance: " + balance;
    }
}

public class Bank{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.println("Choose Account Type: \n\t1. Savings \n\t2. Current\nChoice: ");
        int choice = s.nextInt();
        s.nextLine();
        String accountType = (choice == 1) ? "Savings" : "Current";
        System.out.print("\nEnter Account Owner Name: ");
        String name = s.nextLine();
        System.out.print("\nEnter Account Number: ");
        String accNumber = s.nextLine();
        System.out.printf("\nEnter First-Time Deposit (initialBalance) ");
        double initialBalance = s.nextDouble();

        BankAccount account = new BankAccount(name, accNumber, accountType, initialBalance);
        System.out.print("\nAccount Created!\n");

        while(true){
            System.out.println("\nChoose Operation: \n\t1. Deposit \n\t2. Withdraw \n\t3. Check Balance \n\t4. Get Account Details\n\t5. Exit\nChoice: ");
            int op = s.nextInt();

            switch (op) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = s.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = s.nextDouble();
                    try {
                        account.withdraw(withdrawAmount);
                    } catch (InsufficientBalanceException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    System.out.println("Current Balance: " + account.getBalance());
                    break;
                case 4:
                    System.out.println(account.AccountDetails());
                    break;
                case 5:
                    System.out.println("Thank you for using the Banking System!");
                    s.close();
                    return;
                default:
                    System.out.println("Invalid Option! Try again.");
            }
        }
    }
}