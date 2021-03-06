/*
 * Copyright (C) 2017 Eric Darsow
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


package objects_forteacher;

import objects1_donuts.Donut;

public class DonutLand_NoComments {
    
    public static void main(String[] args){
        final int firstBiteSize = 12;

        Donut firstDonut;
        firstDonut = new Donut();
        
        firstDonut.name = "Chloe";
        firstDonut.simulateEating(firstBiteSize);
        
        
//        System.out.println("When first created, " + firstDonut.name + "'s\n" 
//                + "percent remaining is " + firstDonut.getPercRemaining());
//        printDivider();
//        
//        System.out.println("Calling simulateEating and passing in\n" +
//                "a bite size of " + firstBiteSize);
//        printDivider();
        
        firstDonut.simulateEating(firstBiteSize);
        
        System.out.println("After being eaten, " + firstDonut.name + "'s\n" 
                + "percent remaining is " + firstDonut.getPercRemaining());
        
    } // close main
    
    private static void printDivider(){
        System.out.println(".....................................");
    }
} // close class
