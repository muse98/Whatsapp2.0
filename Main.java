/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.Scanner;
import ExceptionCheck.*;
import Account.Profile;

/**
 *
 * @author sony
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);	
        System.out.println("\t\t****Welcome to Whatsapp Application****\t\t");
        System.out.println("Please start entenring your new account informations: ");
        System.out.println("Enter your Name :");
        String name = sc.next();
        System.out.println("Enter your phone number :");
        String phone = sc.next();
        
        int len = phone.length();
        lengthClass l = new lengthClass(len);
        phoneNumberException lException = new phoneNumberException();
        
        try{
            String sentence = lException.tryNumber(l);
            System.out.println("You entered" + sentence);
        }catch(lengthException e){
            System.err.println(e.getMessage());
        }
        
        System.out.println("Enter something about you :");
        String about = sc.next();
        
        System.out.println("Enter your status :");
        String status = sc.next();
        
        Profile my = new Profile(phone, name, about,status);
	System.out.println(my.toString());
    }

}
