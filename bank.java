

class BankAccount {
    private double balance; // 1. Data is HIDDEN - can't access directly

    // 2. Public method to deposit - controls how data changes
    public void deposit(double amount) {
        if(amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        }
    }

    // 3. Public method to withdraw - has safety rules
    public void withdraw(double amount) {
        if(amount <= balance && amount > 0) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount");
        }
    }
    
    // 4. Getter to see balance safely
    public double getBalance() {
        return balance;
    }
}

public class bank { // Save as BankMain.java
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(500);   // Works
        account.withdraw(200);  // Works
        // account.balance = 1000000; // ERROR! private, can't access
        System.out.println("Current Balance: " + account.getBalance());
    }
}