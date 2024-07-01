package org.example.LiskovSubstitutionPrinciple;

/**
 * Description:
 * Author: Harsh Mehta
 * Date: 7/1/24 9:59 AM
 */

/**
 * Liskov's Principle definition : States that the objects of the super class should be able to be
 * replaced with the objects of the subclass without affecting correctness of the program
 * or we can say without changing the behaviour of the superclass.
 */


public class Main{
    public static void main(String[] args) {
        // violate LSP because color of green object is blue
//        Green green = new Blue();

        Green green = new Green();
        //gives green
        green.getColour();
        //output: Blue when we violate the LSP
    }
}