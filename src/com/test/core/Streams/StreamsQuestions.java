package com.test.core.Streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamsQuestions {
    static void main() {
        //Wap using streams to filter even numbers from a list.

        List<Integer> list1 = Arrays.asList(1,2,3,4,5,6,7,8,9);

        list1.stream().filter(i->i%2==0).forEach(x -> System.out.print(x +" "));
        System.out.println();

        //Wap to add 5 to each element in a list using streams.
        list1.stream().map(i->i+5).forEach(x -> System.out.print(x +" "));
        System.out.println();

        // Suppose we have a list of fruits, construct a map using streams where key represent each element of array ,and value represents
        // it's number of occurrences. Use tree map and sort in desc and asc order.
        List<String> list2= Arrays.asList("Banana", "apple", "apple", "Mango");
        //Map<String,Integer> map =list2.stream().collect(Collectors.toMap(Function.identity(),String::length,(a,b) ->a));
        //Map<String,Integer> map =list2.stream().collect(Collectors.toMap(Function.identity(),String::length,(a,b) ->a,TreeMap ::new));


        //Map<String,Integer> map =list2.stream().collect(Collectors.toMap(Function.identity(),String::length,(a,b) ->a,TreeMap ::new));//asc {Banana=6, Mango=5, apple=5}
        Comparator<String> comp=(i1,i2)-> -i1.compareTo(i2);
       // Map<String,Integer> map =list2.stream().collect(Collectors.toMap(Function.identity(),String::length,(a,b) ->a, () -> new TreeMap<>(comp))); //{apple=5, Mango=5, Banana=6}

        // Count occurrences of each word in a list
        //Map<String, Long> map = list2.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        Map<String, Long> map = list2.stream().collect(Collectors.groupingBy(Function.identity(), ()-> new TreeMap<>(comp),Collectors.counting())); //{apple=2, Mango=1, Banana=1}
        System.out.println(map);

        list2.stream().distinct().toList().forEach(s-> System.out.print(s+" "));
        System.out.println();



        // I have student object which list marks. I have array of students.
        // Construct a list which contains average marks of each student.
        StudentTest std1=new StudentTest("Ram",List.of(10,20,30));
        StudentTest std2=new StudentTest("Sita",List.of(20,30,40));
        StudentTest std3=new StudentTest("Arun",List.of(30,40,50));
        List<StudentTest> studentList= List.of(std1,std2,std3);

        studentList.stream().map(StudentTest::getMarks).map(s->{
            int avg=0;
            for (int i:s) avg+=i;
            return avg/s.size();
        }).toList().forEach(t-> System.out.print(t + " "));
        System.out.println();


        // We have a list of elementa of type string, it can be null. Convert into comma seperated value of string.
        LinkedList<String> list5= new LinkedList<String>();
        list5.add("Mehak");
        list5.add("Minda");
        list5.add(null);
        list5.add("Manish");
        list5.stream();



        // List of numbers, find sum of odd numbers.
        System.out.println(list1.stream().filter(i->i%2!=0).reduce(0,(a,b)->a+b));
    }
}

class StudentTest{
    String name;
    List<Integer> marks;

    public StudentTest(String name,List<Integer> marks) {
        this.name = name;
        this.marks = marks;
    }

    public List<Integer> getMarks() {
        return marks;
    }
}