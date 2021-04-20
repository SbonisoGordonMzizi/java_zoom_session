package com.tech.worldbank;

import java.util.Random;

//Create a new class for a bank account
public class BankAccount{
    //Create fields for the account number, balance,customer name,email and phone number
    private int accountNumber =  0; // random Generated 12 digits
    private Double accountBalance = 0.00;
    private String accountHolderName;
    private String accountHolderEmail;
    private String accountHolderPhoneNumber;

    {
        
        int min = 100000;
        int max = 999999;
        Random rand = new Random();
        int randomNum = rand.nextInt((max - min) + 1) + min;
        this.accountNumber = randomNum;
    }

    //Create constractor for accountNumber,accountHolder* fields initializer
    public BankAccount(String accountHolderName, String accountHolderEmail, String accountHolderPhoneNumber){
        this.accountHolderName = accountHolderName;
        this.accountHolderEmail = accountHolderEmail;
        this.accountHolderPhoneNumber = accountHolderPhoneNumber;
    }

    //Create Setter methods for all fields
    

    //Create getter methods for all fields
    public String getAccountHolderName(){
        return this.accountHolderName;
    }
    public String getAccountHolderEmail(){
        return this.accountHolderEmail;
    }
    public String getAccountHolderPhoneNumber(){
        return this.accountHolderPhoneNumber;
    }
    public double getAccountBalance(){
        return this.accountBalance;
    }

    //Create two methods
    // 1) To allow the customer to deposite funds
    // 2) To allow the customer to withdraw
    // do not allow withdraw in backaccount have insufficient funds
    // deposite

    public void deposite(double depositeAmount){
                this.accountBalance += depositeAmount;
                System.out.println("New Balance :"+getAccountBalance());
    }    

    //withdraw 
    public void withdraw(double withdrawAmount){
        if((this.accountBalance - withdrawAmount) < 0){
            System.out.println("No Enough fouds");

        }else{
            this.accountBalance -= withdrawAmount;
            System.out.println("withDrawed : R"+withdrawAmount);
            System.out.println("Your Balance : R"+getAccountBalance());
        }
    }
    
    //accout Honder Bank details
    public void accountHolderBankDetails(){
        System.out.println("\t__________ Hard Bank __________");
        System.out.println("AccountHolder :: "+this.accountHolderName+"\t"+"AccountNumber  :: "+accountNumber);
        System.out.println("Contact Number :: "+this.accountHolderPhoneNumber+"\t"+"Balance :: "+this.accountBalance);
    }
}
