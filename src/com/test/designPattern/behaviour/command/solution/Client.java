package com.test.designPattern.behaviour.command.solution;

import com.test.designPattern.behaviour.command.solution.AcConditioner;

public class Client {
    static void main() {
        AcConditioner ac =new AcConditioner();

        MyRemoteControl remoteObj = new MyRemoteControl();
        remoteObj.setCommand(new TurnACOnCommand(ac));
        remoteObj.pressButton();

        remoteObj.setCommand(new SetACTemperatureCommand(ac,25));
        remoteObj.pressButton();

        remoteObj.setCommand(new SetACTemperatureCommand(ac, 35));
        remoteObj.pressButton();

        remoteObj.setCommand(new TurnACOffCommand(ac));
        remoteObj.pressButton();

        remoteObj.undo(); // Undo: Turn Off command => AC is now on

        remoteObj.undo(); // temperature is 25

        remoteObj.undo(); // temperature is 0

        remoteObj.undo(); // Undo: Turn On command => AC is now off





    }
}
