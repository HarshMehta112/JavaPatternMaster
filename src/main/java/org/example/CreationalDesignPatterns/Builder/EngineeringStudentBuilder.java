package org.example.CreationalDesignPatterns.Builder;

/**
 * Description:
 * Author: Harsh Mehta
 * Date: 9/9/24 4:18 PM
 */

import java.util.ArrayList;
import java.util.List;

public class EngineeringStudentBuilder extends StudentBuilder{

    @Override
    public StudentBuilder setSubjects() {
        List<String> subs = new ArrayList<>();
        subs.add("DSA");
        subs.add("OS");
        subs.add("Computer Architecture");
        this.subjects = subs;
        return this;
    }


}
