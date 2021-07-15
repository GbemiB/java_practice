/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employee;

import Employee.EmployeePT;

import java.util.Scanner;

/**
 *
 * @author bellogbemisola
 */
public class EmployeePTTest {
    public static void main(String[] args) {
        String number;
        String name;
        double pay;
        double hours;
        EmployeePT employee;
        try {
            Scanner KeyStr = new Scanner(System.in);

            System.out.println("employee number is : ");
            number = KeyStr.nextLine();

            System.out.println("name is : ");
            name = KeyStr.nextLine();

            System.out.println("pay is : ");
            pay = KeyStr.nextDouble();

            System.out.println("Hr worked is : ");
            hours = KeyStr.nextDouble();


            employee = new EmployeePT(number, name, pay);  //intant creation cont'd
            System.out.println(employee.getName());  // getting functions of the new instance created
            System.out.println(employee.getNumber());
            System.out.println(employee.getHourlyPay());
        }
        catch (Exception employeeexe){
            System.out.println("Please enter valid inputs");
        }finally {
            System.out.println("exception occurred");
        }
    }
}
