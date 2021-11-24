package com.tsi.lawler.jonelle.minesweeper;

import java.sql.Time;

public class GameManager {

    Player player;
    Board board;
    GameStates currentState;

    public void GameManager()
    {
        this.player = new Player();
        this.board = new Board(10, 10, 5);
        currentState = GameStates.INTRO;
    }

    public void SetCurrentState(GameStates state)
    {
        currentState = state;
    }

    public GameStates GetCurrentState()
    {
        return currentState;
    }
    public void run(Time deltaTime)
    {
        switch(currentState)
        {
            case INTRO:
                player.WelcomeFunction();
                break;
            case PLAY:
                break;
            case TAKING_TURN:
                player.TakeTurn();
                break;
            case TURN_OVER:
                break;
            case GAME_OVER:
                break;

        }
    }

    public boolean CheckTileCoords(int row, int col)
    {
        return true;

    }
}
