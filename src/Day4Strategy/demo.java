/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day4Strategy;

import javax.naming.Context;

/**
 *
 * @author bellogbemisola
 */
public class demo {

    public static void main(String[] args) {
        
        Context context1 = new Context(new strategy1());
        context1.executeTheStrategy();
    
   }
}
