package com.test.designPattern.Interview.designTicTacToe;

import com.test.designPattern.Interview.designTicTacToe.model.GameStatus;

public class PlayGame {
    public static void main(String[] args) {
        System.out.println("     TicTacTowGame   ");
        TicTacToeGame game=new TicTacToeGame();
        game.initializeGame();
        GameStatus status=game.startGame();
        System.out.print("\n===>>> GAME OVER: ");
        switch(status){
            case WIN:
                System.out.println(game.winner.name + " won the game");
                break;
            case DRAW:
                System.out.println("Its a Draw");
                break;
            default:
                System.out.println(" Game Ends");
                break;
        }

    }
}
