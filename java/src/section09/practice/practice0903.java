package section09.practice;

class BankAccount {
    String accounterHolder;
    int balance;

    BankAccount(String accounterHolder, int balance) {
        this.accounterHolder = accounterHolder;
        this.balance = balance;
    }
}

class SwapAccounts {
    void swap(BankAccount a, BankAccount b) {
        int temp = a.balance;
        a.balance = b.balance;
        b.balance = temp;
        System.out.printf("swapBalance : a = %d, b = %d\n", a.balance, b.balance);
    }
}

class SwapBalance {
    void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.printf("swapBalance : a = %d, b = %d\n", a, b);
    }
}

public class practice0903 {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("김일남", 10000);
        BankAccount account2 = new BankAccount("김이남", 5000);
        SwapBalance sb = new SwapBalance();
        SwapAccounts sa = new SwapAccounts();

        System.out.printf("swap() 호출 전: %s=%d, %s=%d\n", account1.accounterHolder, account1.balance,
                account2.accounterHolder, account2.balance);

        sb.swap(account1.balance, account2.balance);

        System.out.printf("swap() 호출 후: %s=%d, %s=%d\n", account1.accounterHolder, account1.balance,
                account2.accounterHolder, account2.balance);

        System.out.println();

        System.out.printf("swap() 호출 전: %s=%d, %s=%d\n", account1.accounterHolder, account1.balance,
                account2.accounterHolder, account2.balance);

        sa.swap(account1, account2);

        System.out.printf("swap() 호출 후: %s=%d, %s=%d\n", account1.accounterHolder, account1.balance,
                account2.accounterHolder, account2.balance);

    }
}