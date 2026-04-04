package com.test.designPattern.structural.bridge.solution;

//Step 4: Refined Abstractions (Concrete LivingThings)
public class Whale extends LivingThings{
    public Whale(BreathingProcess breathingprocess) {
        super(breathingprocess);
    }

    @Override
    public void breathe() {
        System.out.print("Whale: ");
        breathingprocess.breathe(); // Operation implemented by Implementor - defines the "HOW"


    }
}
