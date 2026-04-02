package com.test.designPattern.behaviour.composite.calculator;

public class Expression implements ArthematicExpression{

    OperationType operationType;
    ArthematicExpression leftExpression;
    ArthematicExpression rightExpression;

    public Expression(OperationType operationType, ArthematicExpression leftExpression, ArthematicExpression rightExpression) {
        this.operationType = operationType;
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    @Override
    public int evaluate() {
        if(operationType.equals(OperationType.ADD)){
            return leftExpression.evaluate() + rightExpression.evaluate();
        }
        else if (operationType.equals(OperationType.SUBTRACT)) {
            return leftExpression.evaluate() - rightExpression.evaluate();
        }
        else if(operationType.equals(OperationType.MULTIPLY)){
            return leftExpression.evaluate() * rightExpression.evaluate();
        }
        else{
            return leftExpression.evaluate() / rightExpression.evaluate();
        }
    }
}
