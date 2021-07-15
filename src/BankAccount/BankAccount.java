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
public class BankAccount {
    
    private String accNum;
    private String accName;
    private double balance;
    private static double intrestRate; //making intrestRate static
    
    
    // creating a constructor and defining it with 2 parameters)
    public BankAccount (String num, String name) {
    
         accNum = num;  //it the same thing as this.accName = num
         accName = name;
         balance = 0;
    }
    
    public String getAcctName() {  //getter for AccName
         return accName;
    }

    public String getAccNum() {  //getter for AccNum
         return accNum;
    }

    public double getBalance() {  //getter for balance
        return balance;
    }
   
    
    //creating a method with a paramter
    public void deposit(double amt) { // no return thus, void
        balance = balance + amt;
    }
    // creating a static method 
    public static void setintrestRate(double rate){  // making intrest rate static 
        intrestRate = rate;
    }
    
    // getter for intrestRate
    public static double getintrestRate() {  //getter for intrestRate
        return intrestRate;
    }
    
    //method to add intrest
    public void addintrest() {
        balance = balance + (balance * intrestRate)/100;
    }
    
    public boolean withdraw (double amt) {
        if (amt > balance){
           return false;
        
        } else {
           balance = balance - amt;
           return true;
        }
     }
}
