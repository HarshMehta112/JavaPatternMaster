package org.example.CreationalDesignPatterns.Builder;


/**
 * Description:
 * Author: Harsh Mehta
 * Date: 9/9/24 12:36 PM
 */

import org.example.CreationalDesignPatterns.SimpleFactory.SimpleFactory;

/**
 * Ref : https://medium.com/javarevisited/builder-design-pattern-in-java-3b3bfee438d9
 * A Builder Design Pattern is a Creational Design Pattern that lets you construct complex objects step by step.
 *
 * A Builder Pattern solves the issue with a large number of optional parameters and inconsistent
 * states by providing a way to build the object step-by-step and provide a method that will
 * actually return the final Object.
 *
 * Many classes in Java use builder design patterns. For example java.lang.StringBuilder
 * and java.lang.StringBuffer has used the builder pattern for object building.
 *
 *  Steps to implement builder pattern::
 * Create a static nested class as a Builder class and then copy all the fields from the outer class
 * to the Builder class. We should follow the naming convention. For example,
 * if the class name is Employee then the builder class should be named as EmployeeBuilder.
 *
 * The Builder class should have a public constructor with all the required fields as parameters.
 *
 * The Builder class should have methods to set the optional parameters and
 * it should return the same Builder object after setting the optional field.
 *
 * The final step is to provide a build() method in the builder class that
 * will return the object needed by the client program. For this,
 * we need to have a private constructor in the main class whose
 * object needs to be constructed with the builder class as an argument.
 *
 * Cons : 1. we have to defined same variables 2 times one in student class and another is in builder class.
 *        2. build() method should handle partially initialized objects.
 * */

public class Main
{
    public static void main(String[] args)
    {
        Director directorObj1 = new Director(new EngineeringStudentBuilder());

        Director directorObj2 = new Director(new MBAStudentBuilder());

        Student engineerStudent = directorObj1.createStudent();

        Student mbaStudent =directorObj2.createStudent();

        System.out.println(engineerStudent.toString());

        System.out.println(mbaStudent.toString());
    }
}
