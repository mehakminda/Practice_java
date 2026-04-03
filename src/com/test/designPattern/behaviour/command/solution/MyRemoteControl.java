package com.test.designPattern.behaviour.command.solution;

import java.util.Stack;

//Invoker
public class MyRemoteControl {
    ICommand command;

    Stack<ICommand> commandHistory;

    MyRemoteControl(){
        commandHistory = new Stack<>();
    }
    public void setCommand(ICommand command){
        this.command =command;


    }
    public void pressButton(){
        command.execute();
        commandHistory.push(command);
    }
    public void undo(){
        if(!commandHistory.isEmpty()){
            ICommand lastCommand = commandHistory.pop();
            lastCommand.undo();
        }
    }
}
