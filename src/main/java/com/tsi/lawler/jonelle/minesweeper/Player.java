package com.tsi.lawler.jonelle.minesweeper;

public class Player {
    // Need to make function in a game class to change this later
    GameStates gameStates = GameStates.PLAY;
    public void WelcomeFunction()
    {
        // Do intro
        System.out.println("Welcome to Minesweeper\n");
        // Change game state
        gameStates = GameStates.PLAY;
    }

    public void TakeTurn()
    {
        System.out.println("Enter the coordinate (row, column) of the tile you wish to select");
    }

    public void EndTurn()
    {
        gameStates = GameStates.TURN_OVER;
    }

}
