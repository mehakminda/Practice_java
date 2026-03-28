package com.test.designPattern.interview.DeisgnTicTacToe.model;

public class Player {
    public String name;
    public PlayingPiece playingPiece;

    public Player(String name, PlayingPiece playingPiece ) {
        this.playingPiece = playingPiece;
        this.name = name;
    }
}
