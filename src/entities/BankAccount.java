package entities;

public class BankAccount {

    private Integer number;
    private String holder;
    protected double balance;

    public BankAccount(Integer number, String holder, double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    public BankAccount(){

    }



    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public void withDraw(double amount){
        balance -= amount + 5;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public double getBalance() {
        return balance;
    }


}
