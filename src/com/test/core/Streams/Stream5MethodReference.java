package com.test.core.Streams;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream5MethodReference {
    static void main() {
        List<Student> list1= Arrays.asList(
                new Student("Mehak",100),
                new Student("Chinu",300),
                new Student("Ellina",200)
        );

        List<String> uName = new ArrayList<>();

        uName=list1.stream().map(Student::getName).map(String::toLowerCase).toList();
        System.out.println(uName);

        //find students with highest marks

        int highest= list1.stream().reduce((s1,s2)->s1.getMarks() > s2.getMarks()? s1:s2).get().getMarks();
        System.out.println(highest);


    }
}

class Student{
    String name; int marks;
    public Student(String name, int marks){
        this.name=name;
        this.marks=marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}
