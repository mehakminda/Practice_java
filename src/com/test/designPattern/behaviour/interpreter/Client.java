package com.test.designPattern.behaviour.interpreter;

public class Client {
    static void main() {
        System.out.println("##### Interpreter Design Pattern #####");

        Context context = new Context();
        context.setVariables("a",12);
        context.setVariables("b",3);
        context.setVariables("c",4);
        context.setVariables("d",1);
        System.out.println("Context: "+context);

        // Expression: a + b
        AbstractExpression expression1 = new AddNonTerminalExpression(
                new NumberTerminalExpression("a"),
                new NumberTerminalExpression("b"));
        System.out.println("Expression: (a+b) = " + expression1.interpret(context)); // Output: 17

        // Expression: a * b
        AbstractExpression expression2 = new MultiplyNonTerminalExpression(
                new NumberTerminalExpression("a"),
                new NumberTerminalExpression("b")
        );
        System.out.println("Expression: (a*b) = " + expression2.interpret(context)); // Output: 60

        // Complex Expression: (a + b) * c
        AbstractExpression expression3 = new MultiplyNonTerminalExpression(
                new AddNonTerminalExpression(
                        new NumberTerminalExpression("a"),
                        new NumberTerminalExpression("b")
                ),
                new NumberTerminalExpression("c")
        );
        System.out.println("Expression: ((a+b)*c) = " + expression3.interpret(context)); // Output: 51

        // Expression: ((a*b) + (c*d))
        AbstractExpression expression4 = new BinaryNonTerminalExpression(
                new BinaryNonTerminalExpression(
                        new NumberTerminalExpression("a"), new NumberTerminalExpression("b"), '*'),
                new BinaryNonTerminalExpression(
                        new NumberTerminalExpression("c"), new NumberTerminalExpression("d"), '*'),
                '+');
        System.out.println("Expression: ((a*b) + (c*d)) = " + expression4.interpret(context));


        //Expression: ((c*b)*d)
        AbstractExpression abstract1 = new MultiplyNonTerminalExpression(
                new MultiplyNonTerminalExpression(new NumberTerminalExpression("c"),new NumberTerminalExpression("b")),
                new NumberTerminalExpression("d"));

        System.out.println("Expression: (a+b) = " + abstract1.interpret(context));





    }
}
