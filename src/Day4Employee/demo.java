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
public class demo {

    public static void main(String[] args) {   //main method to be ran from

        Context context1 = new Context(new PermanentStaff());  //creating an intance of Context as context1 and an instance of PermanentStaff as new PermanentStaff
        context1.employeeSalaryPayment();

        Context context2 = new Context(new ContractStaff());
        context2.employeeSalaryPayment();

        Context context3 = new Context(new ExternalConsultant());
        context3.employeeSalaryPayment();
    }

}
