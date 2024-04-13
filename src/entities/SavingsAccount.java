package entities;

public final class SavingsAccount extends BankAccount{

    private double interestRate ;

    public SavingsAccount(){
        super();
    }

    public SavingsAccount(Integer number, String holder, double balance, double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public SavingsAccount(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void upDateBalance(){
        balance += balance * interestRate;
    }

    @Override
    public void withDraw(double amount){
        balance -= amount;
    }


}
