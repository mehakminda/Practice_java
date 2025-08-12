package com.test.oops.collection;


import java.util.*;

/**
 * Traversing collection
 *
 */
public class Collection2 {
    public static void main(String[] args) {

        List list1=new ArrayList();
        list1.add(100);
        list1.add(200);
        list1.add(300);
        list1.add(400);

        System.out.println(list1);

        //create 1 iterator object, each starts reading from the beginning.
        Iterator itr=list1.iterator();
        boolean status= itr.hasNext();
        if(status) System.out.println(itr.next());

        System.out.println("---------------------Iterator----------------------");
        Iterator itr1=list1.iterator();
        boolean status1= itr1.hasNext();
        if(status1) System.out.println(itr1.next());

        while(itr1.hasNext()){
            System.out.println(itr1.next());
        }
        System.out.println("---------------------ListIterator----------------------");

        ListIterator litr= list1.listIterator();
        while(litr.hasNext()){
            System.out.println(litr.next());
        }
        //at this point the list iterator(litr) is point the nth index of our Arraylist

        System.out.println("\nPrint the list elements in reverse order:");
        ListIterator litr2= list1.listIterator(list1.size()); // litr2==litr
        while(litr2.hasPrevious()){
            System.out.println(litr2.previous());
        }

        System.out.println("-------------------------------------------");

        ArrayDeque ad= new ArrayDeque();
        ad.add(10); ad.add(15); ad.add(20); ad.add(25); ad.add(3);
        System.out.println(ad);

        ArrayList list2= new ArrayList();
        list2.add(ad);
        System.out.println(list2);

        ListIterator litr3=list2.listIterator();
        while (litr3.hasNext()){
            System.out.println(litr3.next());
        }

        Iterator adItr = ad.iterator();


    }
}
