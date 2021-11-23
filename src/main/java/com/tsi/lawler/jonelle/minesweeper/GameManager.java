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

    public void run(Time deltaTime)
    {
        switch(currentState)
        {

        }
    }
}
