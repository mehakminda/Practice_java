package com.test.designPattern.behaviour.iterator;

import java.util.List;

public class LibraryIteratorDemo {
    static void main() {
        System.out.println("\n###### Iterator Design Pattern ######");

        Library library = getLibrary();

        //Forward Iteration
        Iterator<Book> itr1= library.createIterator();
        System.out.println("\n==> Forward iteration:");
        while(itr1.hasnext()) System.out.println(itr1.next());

        //Reverse Iteration
        System.out.println("\n==> Reverse iteration:");
        Iterator<Book> itr2= library.createReverseIterator();
        while(itr2.hasnext()) System.out.println(itr2.next());

    }
    public static Library getLibrary(){
        List<Book> books = List.of(
                new Book("To Kill a Mockingbird", "Harper Lee", "978-0-74-7356-5"),
                new Book("The Great Gatsby", "F. Scott Fitzgerald", "778-0-24-7156-5"),
                new Book("The Catcher in the Rye", "J.D. Salinger", "333-0-28-7446-8"),
                new Book("The Hobbit", "J.R.R. Tolkien", "783-0-14-1951-8"),
                new Book("Rich Dad Poor Dad", "Robert Kiyosaki", "183-0-12-1491-8"),
                new Book("Pride and Prejudice", "Jane Austen", "289-0-12-1678-8")
        );

        Library library =new Library(books);
        return library;


    }
}
