package section08;

class BankAccount {
    int balance;

    public BankAccount() {
        this.balance = 0;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public void withdraw(int amount) {
        balance -= amount;
    }

    public void printBalance() {
        System.out.println("잔액 : " + balance);
    }
}

public class BankOOP {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        account1.deposit(1000);
        account1.printBalance();
        account1.deposit(1000);
        account1.printBalance();

        BankAccount account2 = new BankAccount();
        account2.deposit(15000);
        account2.printBalance();
        account2.deposit(15000);
        account2.printBalance();

        BankAccount account3 = new BankAccount();
        account3.deposit(1000);
        account3.printBalance();
        account3.deposit(500);
        account3.printBalance();
    }
}
