package com.test.designPattern.behaviour.interpreter;

import java.util.HashMap;
import java.util.Map;

public class Context {
    private final Map<String, Integer> variables = new HashMap<>();


    public void setVariables(String name, int value){
        variables.put(name,value);
    }
    public int getVariable(String name){
       return variables.get(name);
    }

    @Override
    public String toString() {
        return variables.toString();
    }
}
