package com.test.designPattern.interview.DeisgnSnakenLadder;

import java.util.concurrent.ThreadLocalRandom;

public class Dice {
    int diceCount;
    int min=1;
    int max=6;

    public Dice(int diceCount) {
        this.diceCount = diceCount;
    }

    int rollDice(){
        int totalSum=0;
        for(int i=1;i<=diceCount;i++){
            totalSum += ThreadLocalRandom.current().nextInt(min,max+1);
        }
        return totalSum;
    }
}
