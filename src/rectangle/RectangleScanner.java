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
public class RectangleScanner {
    
    public static void main (String [] args) {
    
    Scanner input = new Scanner(System.in);
    
    double Length, Height;
    
   
    System.out.print("Enter the lenth of rectangle");
    Length = input.nextDouble();
    
    
    System.out.print("Enter the height of rectangle");
    Height = input.nextDouble();
    
    Rectangle recNew = new Rectangle (Length, Height);
    
   
    System.out.println("The Rectangele Area is:  " + recNew.computeArea());
    System.out.println("The Rectangele Perimeter is:  " + recNew.computePerimeter());
    
    
    }

}
