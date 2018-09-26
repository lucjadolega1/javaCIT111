/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codingproject;
import java.util.Scanner;
/**
 *
 * @author lucja
 */
public class JavaFirstProject {
    public static void main(String[] args){
        System.out.println("Should I buy a new car?");
        // Main question
        Scanner keyboardReader = new Scanner(System.in);
        int response1;
        int response2;
        int response3;
        // value of response 1
        int compScore = 0;
        // compatability score: based on the user's response to questions 
        System.out.println("Do I have enough money? ( 0 = no, 20 = yes)" );
        // Question 1 
        response1 = keyboardReader.nextInt();
        if(response1 == 20){
            compScore = compScore + 20;
            System.out.println("Yay, good news");
        } else { 
            System.out.println("Oops");
        } // close if/else blocks
       
        // value of response 2
        System.out.println("Do I really need a new car? ( 0 = no, 20 = yes)" );
        // Question 2 
        response2 = keyboardReader.nextInt();
        if(response2 == 0){
            compScore = compScore + 0;
            System.out.println("Okk!");
        } else {
            System.out.println("Eh, maybe the old one is good");
        } // close if/else blocks
      
        // value of response 3
        System.out.println("Am I gonna enjoy it? ( 0 = no, 20 = yes)" );
        // Question 3
        response3 = keyboardReader.nextInt();
        if(response3 == 20){
            compScore = compScore + 20;
            System.out.println("Yaaay!Of course you're gonna enjoy it");
        } else {
            System.out.println("I think you would enjoy buying new car");
        } // close if/else blocks
        
        if(compScore > 30 ){
            System.out.println("Good news, you should buy a new car");
        } else {
            System.out.println("You should not buy a new car");
        // final score 
        } // close if/else blocks
    } // close main
} // close class
