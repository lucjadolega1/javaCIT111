/*
 * Copyright (C) 2018 delores
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package components.comp1_languageCore.lc3_controlOfFlow.friends;

/**
 * Class to demonstrate implementation of if/else logic in context of an
 * activity that creates a chain of logic to assess friend compatability
 * 
 * @author delores the javabot
 */
public class FriendsNestedIf {
    
    public static void main(String[] args) {
        // hard-coded response to question 1 and 2
        final int RESPONSE_HOCKEY = 1;
        final int RESPONSE_WOODWORKING = 1;
        // compatability score: this variable will be adjusted based on
        // the user's response to questions
        int compScore = 0;
        
        System.out.println("Q1/2: Do you enjoy hockey? (0 = no, 1 = yes)");
        
        // Begin outer if/else system
        if(RESPONSE_HOCKEY == 1){
            compScore = compScore + 10; 
            System.out.println("Great! How 'bout those Pens?");
            
            // Second question and if/else is nested inside the outer one
            
            System.out.println("Q2/2: Have you ever made something out of wood? (0 = no, 1 = yes)");
            if(RESPONSE_WOODWORKING == 1){
                System.out.println("Excellent!");
                compScore = compScore + 45;
            } else {
                System.out.println("Not good--wood is good!");
                compScore = compScore - 30;
            } // end INNER if/else blocks
        } else {
            System.out.println("...you must like it if you tried!");
        } // end OUTER if/else blocks
        
        // final check of compatibility score
        if(compScore > 30){
            System.out.println("Great, we might be friends!");
        } else {
            System.out.println("Yikes, according to my decision tree, "
                    + "we probably wouldn't make good friends.");
        } // end of if/else blocks
    } // close main
} //close class
