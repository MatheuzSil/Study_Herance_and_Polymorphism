package entities.AbstractClass;

public abstract class Account {
    private Integer AccountNumber;
    private String holder;
    private Double balance;

    public Account(Integer accountNumber, String holder, Double balance) {
        AccountNumber = accountNumber;
        this.holder = holder;
        this.balance = balance;
    }

    public Integer getAccountNumber(){
        return AccountNumber;
    }

    public void setAccountNumber(Integer accountNumber) {
        AccountNumber = accountNumber;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
}
