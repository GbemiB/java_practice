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
public class BankAccountPP {

    private double currentSalary;
    private String accountName;
    private String accountNumber;
    private static double salaryIncrement;
    private double totalMonthSavings;
    private double amountSaved;

    public BankAccountPP(String accountName, String accountNumber){
        this.accountName = accountName;
        this.accountNumber = accountNumber;
   }

    public double getCurrentSalary() {
        return currentSalary;
    }

    public void setCurrentSalary(double currentSalary) {
        this.currentSalary = currentSalary;
    }

    public String getAccountName() { return accountName; }

    public void setAccountName(String accountName) { this.accountName = accountName; }

    public String getAccountNumber() { return accountNumber; }

    public void setAccountNumber(String accountNumber) { this.accountNumber = accountNumber; }

    public static double getSalaryIncrement() { return salaryIncrement; }

    public static void setSalaryIncrement(double salaryIncrement) { BankAccountPP.salaryIncrement = salaryIncrement; }


    public void TotalMonthSavings(double amountSaved) { totalMonthSavings = totalMonthSavings + amountSaved; }

    public static void SalaryIncrement(double increase){  
        salaryIncrement = increase;
    }

    public void currentSalary(){  
        currentSalary = totalMonthSavings + (currentSalary * salaryIncrement) ;
    }

    public double getTotalMonthSavings() { return totalMonthSavings; }

    public double getAmountSaved() {
        return amountSaved;
    }

    public void setTotalMonthSavings(double totalMonthSavings) {
        this.totalMonthSavings = totalMonthSavings;
    }

    public void setAmountSaved(double AmountSaved) {
        this.amountSaved = AmountSaved;
    }
       
    public void getcurrentSalary() {
        this.currentSalary = currentSalary;
    }



}

    


