package com.test.oops.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

/**
 * ArrayList(List) , Linked List(Queue+List, Priority Queue(Queue)
 */
public class Collection1 {
    public static void main(String[] args) {

        //Every data is stored as Object in collection
        ArrayList list1=new ArrayList();
        list1.add(10);
        list1.add(20);
        System.out.println("List1: "+list1);

        ArrayList list2=new ArrayList();
        list2.add(10); //acts as add(Object o)
        list2.add("Mehak");
        list2.add(true);
        System.out.println("List2: "+list2);

        List list3=new ArrayList();
        list3.add(list2);
        list3.add("lol");
        list3.add(2,"Spring boot");
        System.out.println("List3: "+list3);

        //--------------------------

        LinkedList ll1=new LinkedList();
        ll1.add(10);
        ll1.add("Minda");
        ll1.addFirst(20);
        ll1.add(2,100);
        System.out.println(ll1.get(2));
        ll1.add(10);//adding duplicates
        System.out.println("Linked List1: "+ll1);

        List ll2=new LinkedList(); //only List functions are invoked
        ll2.add(200);
        ll2.add("Jalaj");
        System.out.println("Linked List2: "+ll2);

        LinkedList ll3=new LinkedList(); //both List and Deque functions are invoked
        ll3.add(200);
        ll3.add("Jalaj");
        System.out.println("Linked List3: "+ll3);

        //--------------------------
        PriorityQueue pq=new PriorityQueue(); //uses min heap internally
        pq.add(100);pq.add(50);pq.add(150);
        pq.add(25);pq.add(75);pq.add(125);pq.add(175);

        System.out.println("Priority queue: "+pq);



    }

}
