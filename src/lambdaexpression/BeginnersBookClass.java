/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambdaexpression;

/**
 *
 * @author bellogbemisola
 */
public class BeginnersBookClass {   // using lamda expression, you don't need to implement the interface 

    public static void main(String args[]) { // lambda expression
        MyFunctionalInterface sum = (a, b) -> a + b;
        System.out.println("Result: " + sum.addMethod(12, 100));
    }
}
