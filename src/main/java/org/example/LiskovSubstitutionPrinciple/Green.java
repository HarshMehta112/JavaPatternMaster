package org.example.LiskovSubstitutionPrinciple;


public class Green implements ColourInterface {
    @Override
    public void getColour() {
        System.out.println("Green");
    }
}
