package org.example.CreationalDesignPatterns.Builder;

/**
 * Description:
 * Author: Harsh Mehta
 * Date: 9/9/24 4:19 PM
 */

import java.util.ArrayList;
import java.util.List;

public class MBAStudentBuilder extends StudentBuilder{

    @Override
    public StudentBuilder setSubjects() {
        List<String> subs = new ArrayList<>();
        subs.add("Micro Economics");
        subs.add("Business Studies");
        subs.add("Operations Management");
        this.subjects = subs;
        return this;
    }
}
