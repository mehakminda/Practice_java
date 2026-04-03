package com.test.designPattern.structural.bridge.problem;

import com.test.designPattern.behaviour.iterator.Library;

public class Tree extends LivingThings {
    @Override
    public void breathe() {

        System.out.println("Tree: Breathes through leaves; Lives on land; Respiratory system: Leaves");
        System.out.println("Breathing Process: Inhales Carbon Dioxide and Exhales Oxygen as a result of photosynthesis.");
    }

}
