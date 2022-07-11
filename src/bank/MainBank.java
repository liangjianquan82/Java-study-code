package bank;

public class MainBank {
    public static void main(String[] args) {
        BankA a =new BankA();
        BankB b =new BankB();
        BankC c =new BankC();

        a.setBalance(100);
        a.getBalance();
        b.setBalance(150);
        b.getBalance();
        c.setBalance(200);
        c.getBalance();


    }
}
