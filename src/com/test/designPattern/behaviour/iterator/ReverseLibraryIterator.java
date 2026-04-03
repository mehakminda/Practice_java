package com.test.designPattern.behaviour.iterator;

import java.util.List;

// Concrete Iterator - for Library
public class ReverseLibraryIterator implements Iterator<Book> {

    public final List<Book> books;
    int position ;

    public ReverseLibraryIterator(List<Book> books) {
        this.books = books;
        position = books.size()-1;
    }

    @Override
    public boolean hasnext() {
        return position >= 0 && books.get(position) != null;
    }

    @Override
    public Book next() {
        if(!hasnext()) return null;
        return books.get(position--); // Return current book and move backward
    }
}
