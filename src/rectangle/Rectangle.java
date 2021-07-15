/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangle;

/**
 *
 * @author bellogbemisola
 */
public class Rectangle {  

    /**
     * @param args the command line arguments
     */
    
    private double length; // ENCAPSULATION USING PRIVATE
    private double height;

    // create constructor 
    public Rectangle (double length, double height){
    this.length = 'L';
    this.height = 'H';
    }

    // Another constructor to compute Area
    public double computeArea () {
     return length * height;
    }
    
    // Another constructor to compute Area
    public double computePerimeter() {
      return 2 * (length * height);
    }
    
    
    // getting setters and getters cos the declare variables are private: encapuslated
    public double getcomputeArea(){
        return length * height;
    }

    public double getcomputePerimeter(){
        return 2 * (length * height);
    }

    public double getLength() {
        return length;
    }

    public double getHeight() {
        return height;
    }
    
    public double setcomputeArea(){
        return length * height;
    }
    
    public double setcomputePerimeter(){
        return 2 * (length * height);
    }

    public void setlenth(double length) {
        this.length = length;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
}      
            
            
    
    
