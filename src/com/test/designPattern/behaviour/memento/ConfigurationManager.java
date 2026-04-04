package com.test.designPattern.behaviour.memento;

import java.util.Stack;

// Caretaker class - manages mementos
public class ConfigurationManager {
    private final Stack<ConfigurationMemento> history = new Stack<>();



    public void saveState(ApplicationConfiguration appConfig){
        ConfigurationMemento memento = appConfig.save(); // creates a memento with current state
        history.push(memento); // stores the memento in the history
        System.out.println("[+] State saved. History size: " + history.size());
        System.out.println(history.size() == 1 ? "[+] Default State: " + memento : "[+] Current State: " + memento);

    }
    public void undo(ApplicationConfiguration appConfig){
        if(history.size() >1){
            history.pop(); // removes and returns the last saved state
            ConfigurationMemento memento = history.peek(); // returns the previous state to be restored
            appConfig.restore(memento); // restores the application configuration to the previous saved state
            System.out.println("[+] Undo performed. History size: " + history.size());
            System.out.println(history.size() == 1 ? "[+] Default State: " + memento : "[+] Current State: " + memento);
        }
        else{
            System.out.println("Current state is the only state");
            System.out.println("[+] No more states to undo!");
            System.out.println("[+] Default State: " + history.peek());

        }

    }
}
