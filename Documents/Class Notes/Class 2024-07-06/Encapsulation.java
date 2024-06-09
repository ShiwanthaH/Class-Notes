class BankAccount {
    private String accNumber;
    private String accHolderName;
    private double balance;

    public BankAccount(String accNumber, String accHolderName, double balance) {
        this.accNumber = accNumber;
        this.accHolderName = accHolderName;
        this.balance = balance;
    }

    // get or set

    public String getAccNumber() {
        return accNumber;
    }

    public String getAccHolderName() {
        return accHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccHolerName(String accHolderName) {
        this.accHolderName = accHolderName;
    }

    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("Amount deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
            System.out.println("Amount withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }
 
}

public class Encapsulation {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("123456789", "John Doe", 1000.0);

        System.out.println("Account Number: " + myAccount.getAccNumber());
        System.out.println("Account Holder Name: " + myAccount.getAccHolderName());
        System.out.println("Account Balance: " + myAccount.getBalance());

        myAccount.setAccHolerName("Jane Doe");

        System.out.println("Account Holder Name: " + myAccount.getAccHolderName());

        myAccount.deposit(500.0);
        System.out.println("Account Balance: " + myAccount.getBalance());

        myAccount.withdraw(200.0);
        System.out.println("Account Balance: " + myAccount.getBalance());

        myAccount.withdraw(2000.0);
        System.out.println("Account Balance: " + myAccount.getBalance());
    }
}
