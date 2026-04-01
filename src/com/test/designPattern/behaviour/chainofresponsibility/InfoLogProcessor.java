package com.test.designPattern.behaviour.chainofresponsibility;

public class InfoLogProcessor extends LogProcessor{

    public InfoLogProcessor(int level) {
        this.level =level;
    }

    @Override
    protected void write(String message) {
        System.out.println("DEBUG: "+ message);
    }
}
