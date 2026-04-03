package com.test.designPattern.creational.builder.solution;


import java.util.ArrayList;
import java.util.List;

// Step 3: Concrete Builder for Engineering Students
public class EngineeringStudentBuilder extends StudentBuilder{

    // Engineering-specific methods
    @Override
    public StudentBuilder setSubjects() {
        List<String> enggSubjectsList = new ArrayList<>();
        enggSubjectsList.add("Operating Systems");
        enggSubjectsList.add("Computer Architetcure");
        enggSubjectsList.add("DBMS");
        enggSubjectsList.add("Data Structure");
        this.subjects=enggSubjectsList;
        return this;
    }
}
