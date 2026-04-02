package com.test.designPattern.behaviour.composite.filesystem.solution;

import java.util.ArrayList;
import java.util.List;

public class Directory implements  FileSystemComponent{

    String name;
    List<FileSystemComponent> children;

    public Directory(String name) {
        this.name = name;
        this.children = new ArrayList<>();
    }

    public void add(FileSystemComponent child){
        children.add(child);
    }

    public void remove(FileSystemComponent child){
        children.remove(child);
    }

    @Override
    public void ls() {
        System.out.println("Directory name: "+name);
        for(FileSystemComponent fs: children){
            fs.ls();
        }
    }
}
