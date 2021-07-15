/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Account;
import Account.Account;

import java.util.ArrayList; //import your arraylist to be able to use it
import java.util.List;

/**
 *
 * @author bellogbemisola
 */
public class AccountTester {  //THIS IS TESTER FOR ACCOUNT.JAVA

    public static void main (String []args){
        List<Account> accounts = new ArrayList();
        //adding these accounts to the Account array List
        accounts.add(new Account("1123", "Luke", "001", 1100.00));
        accounts.add(new Account("1123", "lake", "003", 1700.00));
        accounts.add(new Account("1123", "tupee", "004", 1900.00));
        accounts.add(new Account("1123", "fukel", "001", 1000.00));

        for(Account acct: accounts){       // acct is like the i, a variable, it keep picking and looping 
        System.out.println("Account no " + acct.getAccountNO());  //your output will be AccountNO and Accountname in list of the four accounts added
        System.out.println("Account no " + acct.getAccountname()); //the output picks and display just AccountNO and Accountname from the four parameters in brackets
        }
    }
}
