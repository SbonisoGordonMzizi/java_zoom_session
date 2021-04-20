package com.tech.worldbank;

import com.tech.worldbank.BankAccount;

public class Main{
    public static void main(String[] args){
        BankAccount account1 = new BankAccount("Sboniso Gordon Mzizi","gordonmzizi@gmail.com","0663515711");
        BankAccount account2 = new BankAccount("Andile innocent Mzizi","andile@gmail.com","0812222789");

        account1.deposite(12000.0);
        account2.deposite(21400.0);

        System.out.println(account1.getAccountBalance());
        System.out.println(account1.getAccountBalance());

        account1.withdraw(1001.00);
        account1.accountHolderBankDetails();
        account2.accountHolderBankDetails();

    }
}