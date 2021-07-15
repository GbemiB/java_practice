/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day4Employee;



/**
 *
 * @author bellogbemisola
 */
public class Context {
    
    private Employee employee; 
    
    public Context (Employee employee) {
         this.employee = employee;
    }
         
         public void employeeSalaryPayment() {
             this.employee.salarypayment();
         
         }       
    }



