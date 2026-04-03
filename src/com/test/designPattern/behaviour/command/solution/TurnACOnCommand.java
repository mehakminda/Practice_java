package com.test.designPattern.behaviour.command.solution;

import com.test.designPattern.behaviour.command.solution.AcConditioner;

//Concrete Command
public class TurnACOnCommand implements  ICommand{
    final AcConditioner ac;

    public TurnACOnCommand(AcConditioner ac) {
        this.ac = ac;
    }
    @Override
    public void execute() {
        ac.turnOn();
    }

    @Override
    public void undo() {
        System.out.print("Undo: Turn On command. ");
        ac.turnOff();
    }
}
