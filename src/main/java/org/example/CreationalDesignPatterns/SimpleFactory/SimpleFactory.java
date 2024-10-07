package org.example.CreationalDesignPatterns.SimpleFactory;

/**
 * Description:
 * Author: Harsh Mehta
 * Date: 9/9/24 9:34 PM
 */
public class SimpleFactory
{
    public static StudentBuilder createStudentObjectUsingCategory(String type)
    {
        switch (type)
        {
            case "Engineer":
                return new EngineeringStudentBuilder();

            case "MBA":
                return new MBAStudentBuilder();

            default:
                throw new IllegalArgumentException("Illegal Student category.");
        }
    }
}
