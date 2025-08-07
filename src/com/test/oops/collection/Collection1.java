package com.test.oops.collection;

import java.util.*;

/**
 * ArrayList(List) , Linked List(Queue+List) , Priority Queue(Queue)
 */
public class Collection1 {
    public static void main(String[] args) {

        //Every data is stored as Object in collection

        //--------------------------ArrayList--------------
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

        //--------------------------LinkedList--------------

        LinkedList ll1=new LinkedList();
        ll1.add(10);
        ll1.add("Minda");
        ll1.addFirst(20);
        ll1.add(2,100);
        System.out.println(ll1.get(2));
        ll1.add(10);//adding duplicates
        System.out.println("Linked List1: "+ll1);

        List ll2=new LinkedList(); //only 'List' functions are invoked (as per polymorphism)
        ll2.add(200);
        ll2.add("Jalaj");
        System.out.println("Linked List2: "+ll2);
        System.out.println(ll2.getFirst()); //from deque

        LinkedList ll3=new LinkedList(); //both 'List' and 'Deque' functions are invoked
        ll3.add(200);
        ll3.add("Jalaj");
        ll3.add(80);
        ll3.add("Minda");
        System.out.println("Linked List3: "+ll3);
        System.out.println(ll3.contains(200));
        System.out.println(ll3.get(1));
        System.out.println(ll3.getFirst()); //from deque
        System.out.println(ll3.getLast());//from deque
        System.out.println("Peek first: "+ ll3.peekFirst()); //from deque
        System.out.println("Linked List3: after peek :"+ll3);
        System.out.println("Poll First: "+ll3.pollFirst());
        System.out.println("Linked List3: after poll :"+ll3);
        ll3.offer(124);
        ll3.offerFirst(44);
        System.out.println("Linked List3: after offer:  "+ll3);

        //offer(might or might not be added) and add method(compulsorily added)

        ll3.push(300);
        System.out.println("Linked List3: after push:  "+ll3);
        System.out.println(ll3.pop());
        System.out.println("Linked List3: after pop:  "+ll3);

        //--------------------------PriorityQueue-------------

        PriorityQueue pq=new PriorityQueue(); //uses min heap internally
        pq.add(100);pq.add(50);pq.add(150);
        pq.add(25);pq.add(75);pq.add(125);pq.add(175);

        System.out.println("Priority queue: "+pq); // insertion order not maintained



        //-------------------------- ArrayDeque-------------

        ArrayDeque ad=new ArrayDeque(); //double ended queue
        //insertion/deletion can be performed from both rear and front end
        ad.add(100);
        ad.addFirst(200);


        //-------------------------- TreeSet-------------

        TreeSet tset=new TreeSet(); //Sorted Set interfacce
        tset.add(100);tset.add(50);tset.add(150); tset.add(150);
        tset.add(25);tset.add(75);tset.add(125);tset.add(175);

        System.out.println("TreeSet: "+tset); //sorted results uses Balanced binary search tree in in-order traversal
        System.out.println(tset.ceiling(140));//150
        System.out.println(tset.higher(140));//150

        System.out.println(tset.ceiling(150));//150 (first check itself, if not present then next highest)
        System.out.println(tset.ceiling(150));//175 (always next highest)

        System.out.println(tset.floor(150)); //150
        System.out.println(tset.floor(140)); //125

        System.out.println(tset.lower(150)); //125


        //--------------------------HashSet-------------

        HashSet hs=new HashSet(); //Uses Hashing : Hash function to store data in hash table
        hs.add(100); hs.add("java"); hs.add(100);
        hs.add("Koyal"); hs.add(10);hs.add(20);

        System.out.println(hs); // order of insertion is maintained
        System.out.println(hs.contains(10)); //On(1) all because of hash functions

        //--------------------------LinkedHashSet-------------

        LinkedHashSet hs1=new LinkedHashSet(); //Set Interface
        hs1.add(100); hs1.add("java"); hs1.add(100);
        hs1.add("Koyal"); hs1.add(10);hs1.add(20);

        System.out.println(hs1);
        System.out.println(hs1.contains(10)); // order of insertion is maintained


    }

}
