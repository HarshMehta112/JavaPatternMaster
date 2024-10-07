package org.example.CreationalDesignPatterns.SimpleFactory;

/**
 * Description:
 * Author: Harsh Mehta
 * Date: 9/9/24 4:18 PM
 */

public class Director {

    StudentBuilder studentBuilder;

    Director(StudentBuilder studentBuilder){
        this.studentBuilder = studentBuilder;
    }

    public Student createStudent(){

        if(studentBuilder instanceof EngineeringStudentBuilder){
            return createEngineeringStudent();
        }
        else if(studentBuilder instanceof MBAStudentBuilder){
            return createMBAStudent();
        }
        return null;
    }


    private Student createEngineeringStudent(){

        return studentBuilder.setRollNumber(1).setAge(22).setName("Harsh").build();
    }

    private Student createMBAStudent(){

        return studentBuilder.setRollNumber(2).setAge(24).setName("Mehta").setFatherName("FatherName").setMotherName("MotherName").setSubjects().build();

    }
}
