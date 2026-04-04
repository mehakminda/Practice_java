package com.test.designPattern.structural.bridge.solution;

//Step 4: Refined Abstractions (Concrete LivingThings)
public class Dog extends LivingThings{

    public Dog(BreathingProcess breathingprocess) {
        super(breathingprocess);
    }

    @Override
    public void breathe() {
        System.out.print("Dog: ");
        breathingprocess.breathe(); // Operation implemented by Implementor - defines the "HOW"
    }
}
