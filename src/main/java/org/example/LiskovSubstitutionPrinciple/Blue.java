package org.example.LiskovSubstitutionPrinciple;

public class Blue implements ColourInterface
{
    @Override
    public void getColour()
    {
        System.out.println("Blue");
    }
}
