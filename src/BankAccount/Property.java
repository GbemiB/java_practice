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
public class Property {
    
    private static String BANK_CODE = "056"; // These bank codes, Name and currency code can be made final cos they wont change
    private static String BANK_NAME = "ECOBANK"; // private as access modifier in this static can't ba accesed outside this class
    private static String CURRENCY_CODE = "NGG"; // to access this static outside the class, you should use public 
                                                 // using static and making it private actually defeats it purpose if you want to access it outside the class
            // because you will need getter and setter to acesss it outside the class
            public static void main (String [] args){
            System.out.println(" " + Property.BANK_CODE);
            
     }
    
}
