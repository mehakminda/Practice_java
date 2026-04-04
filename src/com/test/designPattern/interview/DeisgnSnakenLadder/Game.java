package com.test.designPattern.interview.DeisgnSnakenLadder;

import java.util.Deque;
import java.util.LinkedList;

public class Game {
    Board board;
    Dice dice;
    Deque<Player> playerList = new LinkedList<>();
    Player winner;

    public Game() {
        initializeGame();
    }

    public void initializeGame(){
        board = new Board(10,5,2);
        dice= new Dice(2);
        winner=null;
        addPlayers();
    }

    public void addPlayers(){
        Player player1 = new Player("Player-1");
        Player player2 = new Player("Player-2");
        playerList.add(player1);
        playerList.add(player2);
    }

    public void startGame(){
        while(winner==null){
            //check whose turn is it now
            Player playerTurn= findPlayerTurn();
            System.out.println("Player turn:" + playerTurn.playerId + " current position is: " + playerTurn.currentPosition);

            //roll the dice
            int diceNumber = dice.rollDice();

            //get new position
            int playerNewPosition = playerTurn.currentPosition + diceNumber;
            playerNewPosition = jumpCheck(playerNewPosition);
            playerTurn.currentPosition = playerNewPosition;
            System.out.println("Player turn:" + playerTurn.playerId + " new Position is: " + playerNewPosition);

            //check for winning condition
            if(playerNewPosition >=  board.cells.length * board.cells.length - 1){
                winner =playerTurn;
            }
        }
        System.out.println("\n===> The Winner is:" + winner.playerId);
    }

    private Player findPlayerTurn(){
        Player playerTurn = playerList.removeFirst();
        playerList.addLast(playerTurn);
        return playerTurn;
    }

    private int jumpCheck(int playerPosition){
        if(playerPosition > (board.cells.length * board.cells.length-1))
            return playerPosition;

        Cell cell =  board.getCell(playerPosition);
        if(cell.jump != null && cell.jump.start == playerPosition){
            String jumpBy = cell.jump.start > cell.jump.end ? "Opps! Its a snake" : "Yay! Its a ladder";
            System.out.println("[+] Jump done by: " + jumpBy);
            return cell.jump.end;
        }
        return playerPosition;

    }
}
