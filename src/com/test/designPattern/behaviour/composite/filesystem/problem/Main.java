package com.test.designPattern.behaviour.composite.filesystem.problem;

public class Main {
    static void main() {
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


    }
}
