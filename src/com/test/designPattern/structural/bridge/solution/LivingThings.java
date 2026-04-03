package com.test.designPattern.structural.bridge.solution;


//Step 3: Abstraction for LivingThings
public abstract class LivingThings {
    // Reference to Implementor
    protected BreathingProcess breathingprocess;

    // Bridge connects Animal with Breathing
    public LivingThings(BreathingProcess breathingprocess) {
        this.breathingprocess = breathingprocess;
    }

    // Operation implemented by Implementor
    abstract public void breathe();
}
