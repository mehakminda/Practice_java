package com.test.designPattern.behaviour.composite.filesystem.problem;

import java.util.ArrayList;
import java.util.List;

public class Directory {
    String dirName;
    List<Object> objList;

    public Directory(String dirName) {
        this.dirName = dirName;
        this.objList = new ArrayList<>();
    }
    public void add(Object obj){
        objList.add(obj);
    }

    public void ls(){
        System.out.println("Directory name: "+dirName);
        for(Object obj: objList){
            if(obj instanceof File){
                ((File) obj).ls();
            }
            else{
                ((Directory) obj).ls();
            }
        }
    }
}
