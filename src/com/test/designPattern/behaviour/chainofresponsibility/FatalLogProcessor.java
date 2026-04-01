package com.test.designPattern.behaviour.chainofresponsibility;

public class FatalLogProcessor extends LogProcessor {

    public FatalLogProcessor(int level) {
        this.level =level;
    }

    @Override
    protected void write(String message) {
        System.out.println("DEBUG: "+ message);
    }
}
