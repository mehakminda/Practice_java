package com.test.core.collection;

import com.sun.source.tree.Tree;

import java.util.*;

public class Collection3 {
    static void main() {
        //Set : TreeSet
        TreeSet set1=new TreeSet(); //uses natural sorting order of compareTo()
        set1.add("A");
        set1.add("a");
        set1.add("B");
        set1.add("Z");
        set1.add("L");

        System.out.println(set1);

        /*TreeSet set2=new TreeSet();
        set1.add(new StringBuffer("A")); //we got class cast exception
        set1.add(new StringBuffer("a"));
        set1.add(new StringBuffer("B"));
        set1.add(new StringBuffer("Z"));
        set1.add(new StringBuffer("L"));

        System.out.println(set2);
        */

        System.out.println("A".compareTo("Z"));
        System.out.println("a".compareTo("A"));
        System.out.println("A".compareTo("A"));

        TreeSet set3 =new TreeSet(new MyComparator1());
        set3.add(10);
        set3.add(20);
        System.out.println(set3);

        TreeSet set4 =new TreeSet(new MyComparator2());
        set4.add("Mehak Minda");
        set4.add("Daniel Radcliffe");
        set4.add("Emma Watson");
        System.out.println(set4);

       /* TreeSet set5=new TreeSet(new MyComparator2());
        set5.add(new StringBuffer("Apple"));
        set5.add(new StringBuffer("arrow"));
        set5.add(new StringBuffer("Zoo"));
        set5.add(new StringBuffer("Lio"));

        System.out.println(set5);*/

        //Trying method from navigableSet
        TreeSet set6=new TreeSet();
        set6.addAll(List.of(1,2,4,6,7,3,8,7,5));
        System.out.println(set6); //[1, 2, 3, 4, 5, 6, 7, 8]
        System.out.println(set6.floor(5)); // 5
        System.out.println(set6.lower(5)); // 4
        System.out.println(set6.ceiling(5)); // 5
        System.out.println(set6.higher(5)); // 6
        System.out.println(set6.pollFirst()); // 1
        System.out.println(set6.pollLast()); // 8 , also element removed
        System.out.println(set6.descendingSet()); //[7, 6, 5, 4, 3, 2]
        System.out.println(set6); //[2, 3, 4, 5, 6, 7]

    }

}
class MyComparator1 implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Integer i1 = (Integer) o1;
        Integer i2 = (Integer) o2;
        if(i1<i2) return -1;
        else if(i1>i2) return 1;
        else return 0;
    }
}

class MyComparator2 implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        String i1 = o1.toString();
        String i2 = (String) o2;
        return i2.compareTo(i1);//desc order
        //return -i2.compareTo(i1);//asc order
    }
}
