/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employee;

import Employee.Employee;

/**
 *
 * @author bellogbemisola
 */
public class EmployeePT extends Employee {  //EmployeePT inherits Employee properties of num and nam

    // create variable
    private double hourlyPay;

    public EmployeePT(String num, String nam, double hrPay) {  //constructor for EmployeePT will include the parameters of Employee (num and nam) and the new parameter (hourlypay)
      super(num, nam);  //Super means the super class and num and nam which is inherited from Employee (Superclass)
        hourlyPay = hrPay;
    }

    public double gethourlyPay() {
        return hourlyPay;
    }

    public void sethourlyPay(double hourlyPay) {
        this.hourlyPay = hourlyPay;
    }

    // method calcWeeklyPay
    public double calcWeeklyPay(int noOfhr) {   //it takes in noOfhr and return as described below 
        return noOfhr * hourlyPay;
    }

    boolean getHourlyPay() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
