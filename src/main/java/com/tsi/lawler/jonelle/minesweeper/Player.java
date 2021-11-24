package com.tsi.lawler.jonelle.minesweeper;
import java.util.Scanner;

public class Player {
    // Need to make function in a game class to change this later
    GameStates gameStates = GameStates.PLAY;
    int rowInput;
    int colInput;

    GameManager gameManager = new GameManager();

    // For inputs
    Scanner scanner = new Scanner(System.in);

    boolean tileValid;

    public void WelcomeFunction()
    {
        // Do intro
        System.out.println("Welcome to Minesweeper\n");
        // Change game state
        gameStates = GameStates.PLAY;
    }

    public void TakeTurn()
    {
        while(gameStates.equals(GameStates.PLAY)) {
            // Enter tile coordinates
            System.out.println("Enter the row number of the tile you wish to select");
            rowInput = Integer.parseInt(scanner.next());
            System.out.println("Enter the col number of the tile you wish to select");
            colInput = Integer.parseInt(scanner.next());

            // Check tile coordinates
            tileValid = gameManager.CheckTileCoords(rowInput, colInput);

            if(tileValid != true)
            {
                // error message
            }
            else
            {
                // check tile legit 
            }
        }

    }

    public void EndTurn()
    {
        gameStates = GameStates.TURN_OVER;
    }

}
