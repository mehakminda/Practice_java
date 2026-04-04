package com.test.designPattern.behaviour.interpreter;

public class NumberTerminalExpression implements AbstractExpression{
    String stringValue;

    public NumberTerminalExpression(String stringValue) {
        this.stringValue = stringValue;
    }

    @Override
    public int interpret(Context context) {
        return context.getVariable(stringValue);
    }
}
