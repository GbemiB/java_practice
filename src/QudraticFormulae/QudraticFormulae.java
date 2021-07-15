/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QudraticFormulae;

/**
 *
 * @author bellogbemisola
 */
public class QudraticFormulae {

    private double a;
    private double b;  
    private double c;

    // slope
    QudraticFormulae(int i, int i0, int i1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    //  creating constructor with parameters
    public void QuadraticFormulae (double a, double b, double c) {
       this.a = a; //can be a = a;
       this.b = b;
       this.c = c;
}

    // method to initialize a, b and c
    public void clearvalues (){  // this method is trying to initialize a, b and c
       this.a = 0;               // and lets say the declared variables are static i.e private static doube a; private static double b; private static double c 
       this.b = 0;               // then its trying to alter a static value, its allowing to run but warning 
       this.c = 0;
}

    public double calculatex () {
        return (-b + Math.sqrt(Math.pow(b,2)- 4*a*c))/(2*a);

    }
}

// note if you put static in your variables, your method should be static and its constant in the class
// when you tag static before the method, its is class method not an instance method