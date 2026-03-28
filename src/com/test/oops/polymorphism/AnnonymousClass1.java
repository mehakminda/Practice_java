package com.test.oops.polymorphism;

class Book {
    private String title;
    public Book(String title) {
        this.title = title;
    }
    public String description() {
        return "Book: " + title;
    }
    public String description22() {
        return "Book: " + title;
    }
}


public class AnnonymousClass1 {
    public static void main(String[] args) {
        Book myBook = new Book("Design Patterns") {
            @Override
            public String description() {
                return "Famous GoF book.";
            }
        };
        System.out.println(myBook.description());
    }
}
