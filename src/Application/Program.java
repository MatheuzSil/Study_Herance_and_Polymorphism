package Application;

import entities.BankAccount;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {
    public static void main(String[] args) {

        BankAccount account = new BankAccount(1, "Matheus", 1000.0 ) ;
        account.withDraw(200);
        System.out.println(account.getBalance());

        BusinessAccount bacc = new BusinessAccount(1002, "Alex", 2000, 1000);

        BankAccount account1 = bacc;
        BankAccount account2 = new BusinessAccount(12, "Kelvin", 200, 800);

        BankAccount account3 = new SavingsAccount(11,"bob",1000.0, 0.01);
        account3.withDraw(200);
        System.out.println(account3.getBalance());

        BankAccount account6 = new BusinessAccount(11, "mike", 1000.0, 200.0);
        account6.withDraw(200);
        System.out.println(account6.getBalance());

        BusinessAccount account4 = (BusinessAccount) account2;

//        if (account3 instanceof BusinessAccount){
//            BusinessAccount account5 = (BusinessAccount) account3;
//            System.out.println("Loan!");
//        } else if (account3 instanceof SavingnsAccount) {
//            SavingnsAccount account5 = (SavingnsAccount) account3;
//            System.out.println("Update!");
//        }
    }
}