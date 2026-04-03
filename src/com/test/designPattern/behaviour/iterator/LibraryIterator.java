package com.test.designPattern.behaviour.iterator;

import java.util.List;

// Concrete Iterator - for Library
public class LibraryIterator implements Iterator<Book>{

    public final List<Book> books;
    private int position = 0;

    public LibraryIterator(List<Book> books) {
        this.books = books;
    }


    @Override
    public boolean hasnext() {
        return position < books.size();
    }

    @Override
    public Book next() {
        return books.get(position++);
    }

}
