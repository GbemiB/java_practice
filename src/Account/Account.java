/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Account;

/**
 *
 * @author bellogbemisola
 */
public class Account {   //THIS IS A PRACTICE ON ENCAPSULATION USING SETTERS AND GETTERS

    private String AccountNO;
    private String Accountname;
    private String BrachCode;
    private double AccountBalance;

   //constructor
    public Account() {
    }

    // constructor overload 
    public Account(String AccountNO, String Accountname, String BrachCode, double AccountBalance) {

        this.AccountNO = AccountNO;      // means this.AccountNO (from the string declaration) is the same AccountNo
        this.Accountname = Accountname;
        this.BrachCode = BrachCode;
        this.AccountBalance = AccountBalance;
    }

    //creating a method for withdrawal. its void because of no return type 
    public void Withdrawal() {
        System.out.println("Withdrawal...");
    }


    public String getAccountNO() {
        return AccountNO;
    }

    public void setAccountNO(String AccountNO) {
        this.AccountNO = AccountNO;
    }

    public String getAccountname() {
        return Accountname;
    }

    public void setAccountname(String Accountname) {
        this.Accountname = Accountname;
    }

    public String getBrachCode() {
        return BrachCode;
    }

    public void setBrachCode(String BrachCode) {
        this.BrachCode = BrachCode;
    }

    public double getAccountBalance() {
        return AccountBalance;
    }

    public void setAccountBalance(double AccountBalance) {
        this.AccountBalance = AccountBalance;
    }
}
