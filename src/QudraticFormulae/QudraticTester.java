/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QudraticFormulae;

import QudraticFormulae.QudraticFormulae;

/**
 *
 * @author bellogbemisola
 */
public class QudraticTester {
    
    public static void main (String [] args) {
        QudraticFormulae quard = new QudraticFormulae (3,4,5);
       System.out.println("This is the answer: " + quard.calculatex());
   }
}
