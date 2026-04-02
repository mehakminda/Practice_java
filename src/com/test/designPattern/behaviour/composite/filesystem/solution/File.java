package com.test.designPattern.behaviour.composite.filesystem.solution;

public class File implements  FileSystemComponent{

    String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void ls() {
        System.out.println("File name: "+ name);
    }
}
