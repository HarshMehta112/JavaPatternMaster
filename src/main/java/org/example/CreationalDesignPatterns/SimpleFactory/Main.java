package org.example.CreationalDesignPatterns.SimpleFactory;


/**
 * Description:
 * Author: Harsh Mehta
 * Date: 9/9/24 12:36 PM
 */

/**
 * Ref : https://stackoverflow.com/questions/66911480/simple-factory-vs-factory-method-why-use-factory-method-at-all
 * The main idea behind the Simple Factory pattern is to create objects without having
 * to specify the exact class of the object that will be created.
 *
 * Factory Patterns are about encapsulating object creation.
 *
 * Example of simple factory pattern is java.text.NumberFormat class has getInstance method.
 **/

public class Main
{
    public static void main(String[] args)
    {
        Director directorObj1 = new Director(SimpleFactory.createStudentObjectUsingCategory("Engineer"));

        Director directorObj2 = new Director(SimpleFactory.createStudentObjectUsingCategory("MBA"));

        Student engineerStudent = directorObj1.createStudent();

        Student mbaStudent =directorObj2.createStudent();

        System.out.println(engineerStudent.toString());

        System.out.println(mbaStudent.toString());

    }
}
