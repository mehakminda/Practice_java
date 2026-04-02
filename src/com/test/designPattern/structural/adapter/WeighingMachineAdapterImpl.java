package com.test.designPattern.structural.adapter;


// Concrete Adapter converts pounds → kg
public class WeighingMachineAdapterImpl implements WeighingMachineAdapter{

    // Adaptee Reference
    ImperialWeighingMachine imperialWeighingMachine;

    public WeighingMachineAdapterImpl(ImperialWeighingMachine imperialWeighingMachine) {
        this.imperialWeighingMachine = imperialWeighingMachine;
    }


    @Override
    public double getWeightInKg() {
        double weightInPound = imperialWeighingMachine.getWeightInPounds();
        // Conversion formula: 1 pound = 0.453592 kg
        return weightInPound * 0.45;

    }
}
