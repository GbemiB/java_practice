/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithms;

import java.util.Scanner;

/**
 *
 * @author bellogbemisola
 */
public class Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[] t = new double[7];
        double[] t2 = readT(t);
        displayT(t2);
    }

    static double[] readT(double[] tmp) {  //tmp picks the value of t cos the readT has been used to pass it to tmp

        try{

        Scanner input = new Scanner(System.in);

        // method 1
        for (int i = 0; i < tmp.length; i++) {
            System.out.println("Enter Temperature for day: " + (i + 1));
            tmp[i] = input.nextDouble();
        }

        } catch (Exception ex){
            System.out.println("check enter a double value");
        }
        return tmp;

    }

    static void displayT(double[] t2) {
        int i;
        for (i = 0; i < t2.length; i++) {
            System.out.println("Enter Temperature for day: " + t2[i]);
        }
    }
}

// method 2
/* for (int i = 1; i <= tmp.length; i++)
        
            {
        System.out.println("Enter Temperature for day: " + i);
        
        tmp[i] = input.nextDouble();
   
            }
            
        } */
