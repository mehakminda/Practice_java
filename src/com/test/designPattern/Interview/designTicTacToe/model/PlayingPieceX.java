package com.test.designPattern.Interview.designTicTacToe.model;

public class PlayingPieceX  extends PlayingPiece{
    public PlayingPieceX() {
        super(PieceType.X);
    }
}

/**
 * Why do we have super here? Our constructor is no args and super class constructor is 1 args constructor
 *
 * Java requires that when you construct an object, a superclass constructor runs first. Every constructor either:
 * explicitly calls a superclass constructor (using super(...)) as its first statement, or
 * if it doesn't, the compiler implicitly inserts super() (a call to the no-arg superclass constructor) for you.
 * Because PlayingPiece has only a constructor that takes a PieceType and no no-arg constructor exists, there is no super() available to be implicitly inserted. Therefore the subclass constructor must explicitly call one of the superclass constructors — in this case super(PieceType.O).
 * If you omit the explicit super(...), the code will not compile. Typical compiler errors:
 */
