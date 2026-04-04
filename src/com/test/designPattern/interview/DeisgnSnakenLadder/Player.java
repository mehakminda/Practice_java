package com.test.designPattern.interview.DeisgnSnakenLadder;

public class Player {
    String playerId;
    int currentPosition;

    public Player(String playerId) {
        this.playerId = playerId;
        this.currentPosition = 0;
    }

    public String getPlayerId() {
        return playerId;
    }

    public void setPlayerId(String playerId) {
        this.playerId = playerId;
    }

    public int getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(int currentPosition) {
        this.currentPosition = currentPosition;
    }
}
