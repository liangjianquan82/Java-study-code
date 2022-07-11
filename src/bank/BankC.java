package bank;

public class BankC extends Bank{
    int balance = 0;
    public void setBalance(int balance) {
        this.balance = balance;
    }
    @Override
    public void getBalance() {
        System.out.println("$"+balance+" are deposited in banks C");
    }
}
