package entities.AbstractClass;

public class BussinesAccount2 extends Account {
    private Double loanLimit;

    public BussinesAccount2(Integer accountNumber, String holder, Double amount, Double loanLimit) {
        super(accountNumber, holder, amount);
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }
}
