package com.test.designPattern.behaviour.command.solution;

import com.test.designPattern.behaviour.command.solution.AcConditioner;

//Concrete Command
public class SetACTemperatureCommand implements ICommand{
    final AcConditioner ac;
    int previousTemp;
    final int newTemp;

    public SetACTemperatureCommand(AcConditioner ac, int newTemp) {
        this.ac = ac;
        this.newTemp =newTemp;
    }

    @Override
    public void execute() {
        previousTemp = ac.getTemperature();
        ac.setTemperature(newTemp);
    }

    @Override
    public void undo() {
        System.out.println("Undo: set temperature command");
        ac.setTemperature(previousTemp);
    }
}
