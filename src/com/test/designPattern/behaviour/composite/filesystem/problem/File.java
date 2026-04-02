package com.test.designPattern.behaviour.composite.filesystem.problem;

public class File {
    String fileName;

    public File(String fileName) {
        this.fileName = fileName;
    }
    public void ls(){
        if(fileName !=null){
            System.out.println("File name: "+ fileName);
        }
    }
}
