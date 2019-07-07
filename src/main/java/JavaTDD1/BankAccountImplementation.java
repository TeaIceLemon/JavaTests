package JavaTDD1;

public class BankAccountImplementation implements BankAccount {
    private int amount;

    public int getAmount() {
        return amount;
    }

    public void deposit(int cash) {
        amount+=cash;
    }

    public void withdraw(int cash) {
        amount -= cash;
        if(amount<-1000){
            throw new IllegalStateException();
        }
    }
}
