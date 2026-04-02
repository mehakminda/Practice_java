package com.test.designPattern.behaviour.composite.filesystem.solution;

public class Client {
    public static void main() {
        System.out.println("======= Composite Design Pattern ======");


        File file1= new File("file1");
        File file2= new File("file2");
        File file21= new File("file21");

        Directory main =new Directory("Main");
        Directory dir1 = new Directory("Folder1");
        Directory dir2 = new Directory("Folder2");
        Directory dir3 = new Directory("Folder3");

        main.add(file1);
        main.add(dir1);

        dir1.add(file2);
        dir1.add(file21);
        dir1.add(dir2);

        dir2.add(dir3);

        main.ls();
        System.out.println("----------");
        dir1.ls();
        System.out.println("----------");
        dir2.ls();



        System.out.println("-----------------------------------");
        // Create files
        File receipt = new File("receipt.pdf");
        File invoice = new File("invoice.pdf");
        File torrentLinks = new File("torrentLinks.txt");
        File tomCruise = new File("tomCruise.jpg");
        File dumbAndDumber = new File("DumbAndDumber.mp4");
        File hangoverI = new File("HangoverI.mp4");

        // Create directories
        Directory moviesDirectory = new Directory("Movies");
        Directory comedyMovieDirectory = new Directory("ComedyMovies");

        // Build the tree structure hierarchically
        moviesDirectory.add(receipt);
        moviesDirectory.add(invoice);
        moviesDirectory.add(torrentLinks);
        moviesDirectory.add(tomCruise);
        moviesDirectory.add(comedyMovieDirectory);
        comedyMovieDirectory.add(dumbAndDumber);
        comedyMovieDirectory.add(hangoverI);

        // Display full structure
        moviesDirectory.ls();

    }
}
