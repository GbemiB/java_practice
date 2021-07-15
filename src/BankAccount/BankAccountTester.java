/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BankAccount;

/**
 *
 * @author bellogbemisola
 */
public class BankAccountTester {
    public static void main (String[] args) {
    // create a bank account
    BankAccount account1 = new BankAccount ("10234567834", "Ifemide Adeyeye");
    // create another bank account
    BankAccount account2 =  new BankAccount (" 1234432561", "Alade Joy"); 
    
    // make deposit into the first account by calling deposit method
    account1.deposit(1000);
    
    //make deposit into the second account by calling deposit method
    account2.deposit(2000);
    
    //set the interestRate using interestRate
    BankAccount.setintrestRate(10);
    
    //add interest to accounts using add interest method
    account1.addintrest();
    account2.addintrest();
    
    //display account details
    System.out.println("Account number:" + account1.getAccNum());
    System.out.println("Account name:" + account1.getAcctName());
    System.out.println("intrest rate:" + BankAccount.getintrestRate());
    System.out.println("Current account:" + account1.getBalance());
    System.out.println();
    System.out.println("Account number:" + account2.getAccNum());
    System.out.println("Account name:" + account2.getAcctName());
    System.out.println("intrest rate:" + BankAccount.getintrestRate());
    System.out.println("Current account:" + account2.getBalance());
    }
}
