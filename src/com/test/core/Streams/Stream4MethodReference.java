package com.test.core.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream4MethodReference {
    static void main() {

        List<String> list1 = Arrays.asList("jolo", "miley","selena","ellina");
        List<String> uList1=new ArrayList<>();

        //I want all names with upper case in new list

        //method1
        for (String name: list1){
            uList1.add(name.toUpperCase());
        }
        System.out.println(uList1);
        uList1=new ArrayList<>();;


        //methodd2
        uList1 = list1.stream().map(s->s.toUpperCase()).collect(Collectors.toUnmodifiableList()); //or we can use .toList()
        System.out.println(uList1);
        uList1=new ArrayList<>();;

        uList1 = list1.stream().map(String::toLowerCase).collect(Collectors.toUnmodifiableList()); //this is called method reference
        //String::toLowerCase is lamba of  s->s.toUpperCase(),
        //String::toUpperCase, where toUpperCase is the function to be executed, and String is of which class
    }
}
