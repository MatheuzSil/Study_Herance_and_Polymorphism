package Application;

import entities.AbstractClass.Account;
import entities.AbstractClass.BussinesAccount2;
import entities.AbstractClass.SavingsAccount2;
import entities.BankAccount;

import java.util.ArrayList;
import java.util.List;

public class TestAbstract {
    public static void main(String[] args) {

        List <Account> list = new ArrayList<>();

        list.add(new SavingsAccount2(1001, "Alex", 500.0, 0.01));
        list.add(new BussinesAccount2(1002, "Maria", 1000.0, 400.0));


        for (Account account: list) {
            account.deposit(10.0);
        }

        for (Account acc2 : list) {
            System.out.printf("Update balance with more 10$ dollars on this account: %d $%.2f%n",acc2.getAccountNumber(), acc2.getBalance() );
        }

    }
}
