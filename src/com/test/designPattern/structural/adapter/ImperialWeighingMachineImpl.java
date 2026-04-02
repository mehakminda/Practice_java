package com.test.designPattern.structural.adapter;

public class ImperialWeighingMachineImpl implements ImperialWeighingMachine{

    double weightInPounds ;

    public ImperialWeighingMachineImpl(double weightInPounds ) {
        this.weightInPounds  = weightInPounds ;
    }

    @Override
    public double getWeightInPounds() {
        return weightInPounds ;
    }
}
