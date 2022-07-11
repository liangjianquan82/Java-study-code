package bank;

public class BankA extends Bank {
    public void setBalance(int balance) {
        this.balance = balance;
    }

    int balance = 0;
    @Override
    public void getBalance() {
        System.out.println("$"+balance+" are deposited in banks A");
    }
}
