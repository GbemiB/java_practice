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
public class BankAccountTesterPP {
    //main method
    public static void main(String[] args){
    
    //create a new staff document
    BankAccountPP Account1st = new BankAccountPP ("2345763884", "Elis Luke");
    BankAccountPP Account2nd = new BankAccountPP ("2345723884", "Hvaen John");
    
    
    // owner of account1st saved 2500 for the month
    Account1st.TotalMonthSavings(2500);
    Account2nd.TotalMonthSavings(1500);
    
    BankAccountPP.setSalaryIncrement(2);
    Account1st.setCurrentSalary(10000);
    Account2nd.setCurrentSalary(20000);

    System.out.println("Account number:" + Account1st.getAccountName());
    System.out.println("Account name:" + Account1st.getAccountNumber());
    System.out.println("Salary increment:" + BankAccountPP.getSalaryIncrement());
    
    System.out.println();
    System.out.println("Account number:" + Account2nd.getAccountName());
    System.out.println("Account name:" + Account2nd.getAccountNumber());
    
    }
}
