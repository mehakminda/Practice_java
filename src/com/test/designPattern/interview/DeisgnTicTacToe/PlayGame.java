package com.test.designPattern.interview.DeisgnTicTacToe;

import com.test.designPattern.interview.DeisgnTicTacToe.model.GameStatus;

public class PlayGame {
    static void main() {

        System.out.println("\n===>>> TicTacToe Game\n");

        TicTacToeGame game = new TicTacToeGame(3);
        game.initializeGame();
        GameStatus status=game.startGame();

        System.out.print("\n===>>> GAME OVER: ");
        switch(status){
            case WIN:
                System.out.print(game.winner.name + " won the game");
                break;
            case DRAW:
                System.out.print(" Its a Draw!");
                break;
            default:
                System.out.print(" Game Ends");
                break;

        }


    }
}
