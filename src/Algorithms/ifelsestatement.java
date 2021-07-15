/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithms;

import java.util.Objects;

/**
 *
 * @author bellogbemisola
 */
public class ifelsestatement {  //constructors


    public static void main(String[] args) {
        String username = "Gbemi";
        String usernameInDb = "GBEMI";

        if (Objects.equals(username, usernameInDb)) {
            System.out.println("User credential is valid, go to home page");
        } else {
            System.out.println("Invalid credential, remain in login");
        }

    }
}

 
    

