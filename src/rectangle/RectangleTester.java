/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangle;

import java.util.Scanner;

/**
 *
 * @author bellogbemisola
 */
public class RectangleTester {
    
   public static void main(String[] args) {
       
     
       Rectangle computeArea = new Rectangle  ( 2.342, 4.566); // setting values for lenth and height thus the computeArea can be printed
       Rectangle computePerimeter = new Rectangle ( 2.345, 2.345); // setting values for lenth and height thus the computePeriemter can be printed
       
     
       System.out.println("This is the computed area: " + computeArea.computeArea());
       System.out.println("This is the computed perimeter: " + computePerimeter.computePerimeter()); 
       
       
       // resetting height and length using setter. NB: You have to reset after the initail print statement
       computeArea.setHeight(4.56);
       computeArea.setlenth(10.9);
       
       System.out.println("This is the computed area: " + computeArea.computeArea());
       System.out.println("This is the computed perimeter: " + computePerimeter.computePerimeter());
       
       System.out.println("This is the computed perimeter: " + computeArea.getHeight());
      
    } 
    
}
