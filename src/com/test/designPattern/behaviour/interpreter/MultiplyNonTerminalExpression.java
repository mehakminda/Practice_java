package com.test.designPattern.behaviour.interpreter;

public class MultiplyNonTerminalExpression implements AbstractExpression{
    private final AbstractExpression leftExpression;
    private final AbstractExpression rightExpression;

    public MultiplyNonTerminalExpression(AbstractExpression leftExpression, AbstractExpression rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }


    @Override
    public int interpret(Context context) {
        return leftExpression.interpret(context) * rightExpression.interpret(context);
    }
}
