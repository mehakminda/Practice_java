package com.test.designPattern.behaviour.command.solution;

import com.test.designPattern.behaviour.command.solution.AcConditioner;

//Concrete Command
public class TurnACOffCommand implements ICommand{
    final AcConditioner ac;

    public TurnACOffCommand(AcConditioner ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        ac.turnOff();
    }

    @Override
    public void undo() {
        System.out.print("Undo: Turn Off command. ");
        ac.turnOn();

    }
}
