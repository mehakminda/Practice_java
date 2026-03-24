package com.test.designPattern.Interview.designTicTacToe.model;


import java.util.ArrayList;
import java.util.List;

public class Board {
    public int size;
    public PlayingPiece[][] board;
    public Board(int size){
        this.size=size;
        board=new PlayingPiece[size][size];
    }
    public boolean addPiece(int row, int column, PlayingPiece playingPiece){
        if(board[row][column]!=null){
            return false;
        }
        board[row][column]=playingPiece;
        return true;
    }
    public List<Pair<Integer,Integer>> getFreeCells(){
        List<Pair<Integer,Integer>> freeCells=new ArrayList<>();
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(board[i][j]==null){
                    Pair<Integer,Integer> rowColumn=new Pair<>(i,j);
                    freeCells.add(rowColumn);
                }
            }
        }
        return freeCells;
    }
    public void printBoard(){
        for(int i=0;i<size;i++) {
            for (int j = 0; j < size; j++) {
                if(board[i][j] !=null) {
                    System.out.print(board[i][j].pieceType.name()+ "  ");
                }
                else{
                    System.out.print("    ");
                }
                System.out.print(" | ");
            }
            System.out.println();
        }
    }
}
/**
 * what is different between in output of : currentPlayer.playingPiece, currentPlayer.playingPiece.pieceType, currentPlayer.getPlayingPiece()
 *
 * currentPlayer.playingPiece — the PlayingPiece object reference (declared type: PlayingPiece, runtime type: PlayingPieceX or PlayingPieceO).
 * Printing it calls its toString() (none provided), so you get the default Object string (runtime class name + @ + hex-hash).
 *
 * currentPlayer.getPlayingPiece() — exactly the same object as above (just returned via the getter). No difference in value; the only difference is field access vs method call.
 *
 * currentPlayer.playingPiece.pieceType — the enum value (type PieceType) — prints as X or O because enums’ toString() returns their name.
 */