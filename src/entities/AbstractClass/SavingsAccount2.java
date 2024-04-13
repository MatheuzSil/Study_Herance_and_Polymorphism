package entities.AbstractClass;

public class SavingsAccount2 extends Account{
    private Double interestRate;

    public SavingsAccount2(Integer accountNumber, String holder, Double balance, Double interestRate) {
        super(accountNumber,holder, balance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public void upDateBalance(){
        double updateBalance = getBalance() * interestRate;
        setBalance(updateBalance);
    }

}
