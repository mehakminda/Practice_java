package com.test.designPattern.behaviour.iterator;


//Aggregate interface
public interface BookCollection {
    Iterator<Book> createIterator();
    Iterator<Book> createReverseIterator();
}
