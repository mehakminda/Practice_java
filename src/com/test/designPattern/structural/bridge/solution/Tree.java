package com.test.designPattern.structural.bridge.solution;

//Step 4: Refined Abstractions (Concrete LivingThings)
public class Tree extends LivingThings{
    public Tree(BreathingProcess breathingprocess) {
        super(breathingprocess);
    }

    @Override
    public void breathe() {
        System.out.print("Tree: ");
        breathingprocess.breathe(); // Operation implemented by Implementor - defines the "HOW"

    }
}
