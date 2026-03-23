package com.test.designPattern.Interview.designTicTacToe;

import com.test.designPattern.Interview.designTicTacToe.model.*;

import java.util.*;

public class TicTacToeGame {

    Deque<Player> players;
    Board gameBoard;
    Player winner;

    public void initializeGame() {

        // Creating 2 Players
        players = new LinkedList<>();
        PlayingPieceX crossPiece = new PlayingPieceX();
        Player player1 = new Player("Player1", crossPiece);

        PlayingPieceO noughtsPiece = new PlayingPieceO();
        Player player2 = new Player("Player2", noughtsPiece);

        players.add(player1);
        players.add(player2);

        // Initialize Board of size 3
        gameBoard = new Board(3);

    }

    public GameStatus startGame() {
        boolean noWinner = true;
        while (noWinner) {
            // Remove the player whose turn it is and also put the player in the list back
            Player currentPlayer = players.removeFirst();

            // Get the free space from the board
            gameBoard.printBoard();
            List<Pair<Integer, Integer>> freeSpaces = gameBoard.getFreeCells();
            if (freeSpaces.isEmpty()) {
                noWinner = false;
                continue;
            }

            // Read the user input
            System.out.print("Player: " + currentPlayer.name + " - Please enter [row, column]: ");
            Scanner inputScanner = new Scanner(System.in);
            String s = inputScanner.nextLine();

            String[] values = s.split(",");
            int inputRow = Integer.parseInt(values[0].trim());
            int inputColumn = Integer.parseInt(values[1].trim());

            // Place the piece in the board
            boolean validMove = gameBoard.addPiece(inputRow, inputColumn, currentPlayer.getPlayingPiece());
            if (!validMove) {
                // Invalid Move: Player can not insert the piece into this cell, player has to choose another cell
                System.out.println("Incorrect position chosen, try again !!");
                players.addFirst(currentPlayer); // Add the player back in the queue in front
                continue;
            }

            players.addLast(currentPlayer); // Add the player to the end of the queue

            // Check if the valid move is a winning move or not
            boolean isWinner = checkForWinner(inputRow, inputColumn, currentPlayer.playingPiece.pieceType);
            if (isWinner) {
                gameBoard.printBoard();
                winner = currentPlayer;
                return GameStatus.WIN;
            }

        }
        return GameStatus.DRAW;
    }

    public boolean checkForWinner(int row, int column, PieceType pieceType) {

        boolean rowMatch = true;
        boolean columnMatch = true;
        boolean diagonalMatch = true;
        boolean antidiagonalMatch = true;

        int n = gameBoard.size;

        // check row
        for (int i = 0; i < n; i++) {
            if (gameBoard.board[row][i] == null || gameBoard.board[row][i].pieceType != pieceType) {
                rowMatch = false;
                break;
            }
        }

        // column match
        for (int i = 0; i < n; i++) {
            if (gameBoard.board[i][column] == null || gameBoard.board[i][column].pieceType != pieceType) {
                columnMatch = false;
                break;
            }
        }

        // check diagonally
        for (int i = 0,  j=0; i < n; i++,j++) {
            if (gameBoard.board[i][j] == null || gameBoard.board[i][j].pieceType != pieceType) {
                diagonalMatch = false;
                break;
            }
        }

        //check anti-diagonally
        for (int i = 0,  j=n-1; i < n; i++,j--) {
            if (gameBoard.board[i][j] == null || gameBoard.board[i][j].pieceType != pieceType) {
                antidiagonalMatch = false;
                break;
            }
        }

        return rowMatch || columnMatch || diagonalMatch || antidiagonalMatch;
    }

}
