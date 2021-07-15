/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OverloadingContructor;

/**
 *
 * @author bellogbemisola
 */
public class Overloadingmethod {
    
    static int max(int A, int B){
       if (A>B) {
           return A;
       } else {
           return B;
       }
    }
    
    static int max(int A, int B, int C){
       
       int biggest = A; 
       if (B > biggest) {
           return biggest = B;
       }
       if (C > biggest) {
           return biggest = C;
       }
       return biggest;
    }

}
