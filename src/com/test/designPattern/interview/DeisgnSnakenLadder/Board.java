package com.test.designPattern.interview.DeisgnSnakenLadder;

import java.util.concurrent.ThreadLocalRandom;

public class Board {
    Cell[][] cells;

    public Board(int boadSize, int numberOfSnakes, int numberOfLadders) {
        initialcell(boadSize);
        addSnakesLadders(cells, numberOfSnakes, numberOfLadders);
    }
    void initialcell(int boadSize){
        this.cells = new Cell[boadSize][boadSize];
        for(int i = 0 ; i < boadSize ; i++){
            for(int j = 0; j < boadSize; j++){
                Cell cellObj= new Cell();
                cells[i][j] =cellObj;
            }
        }
    }
    private void addSnakesLadders(Cell[][] cells, int numberOfSnakes, int numberOfLadders) {
        while(numberOfSnakes > 0){
            int snakeHead = ThreadLocalRandom.current().nextInt(1, cells.length * cells.length - 1);
            int snakeTail = ThreadLocalRandom.current().nextInt(1, cells.length * cells.length - 1);
            if(snakeHead <= snakeTail){
                continue;
            }
            Jump snakeObj = new Jump();
            snakeObj.start = snakeHead;
            snakeObj.end = snakeTail;


            Cell cell = getCell(snakeHead);
            cell.jump = snakeObj;

            numberOfSnakes--;

        }
        while(numberOfLadders > 0){
            int ladderHead = ThreadLocalRandom.current().nextInt(1, cells.length * cells.length - 1);
            int ladderTail = ThreadLocalRandom.current().nextInt(1, cells.length * cells.length - 1);
            if(ladderHead >= ladderTail){
                continue;
            }
            Jump ladderObj  =new Jump();
            ladderObj .start = ladderHead;
            ladderObj .end = ladderTail;

            Cell cell = getCell(ladderHead);
            cell.jump = ladderObj;

            numberOfLadders--;

        }
    }


    Cell getCell(int playerPosition) { //converting 1D position into 2d position
        int boardRow = playerPosition / cells.length;
        int boardColumn = (playerPosition % cells.length);
        return cells[boardRow][boardColumn];
    }

}
