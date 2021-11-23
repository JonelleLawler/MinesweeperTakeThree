package com.tsi.lawler.jonelle.minesweeper;

import java.util.Random;

public class Board {
    // Variables
    private int[][] coords;
    private boolean[][] board;
    private int height;
    private int width;
    private int bombs;
    private boolean endGame;
    boolean isBomb;
    int bombCount;


    // Board constructor
    public Board(int h, int w, int b) {
        this.height = h;
        this.width = w;
        this.bombs = b;
        this.coords = new int[0][0];
        this.board = new boolean[this.height][this.width];
        this.bombCount = 0; // 0 whenever game resets
    }


    // Set up the board

    public void InitBoard() {
        for (int r = 0; r < this.height; r++) {
            for (int c = 0; c < this.width; c++)
            {
               Random rand = new Random(this.width % 1);
                if(rand.equals(1) || rand.equals(2) || rand.equals(8))
                {
                    System.out.print("*");
                }
                else {
                    System.out.print(" X ");
                }
            }
            System.out.println();
        }
    }



    // get size of board
    public int GetSize()
    {
        return this.height * this.width;
    }


    public void SetBomb(int num)
    {
        if(num == 1)
        {
            isBomb = true;
        }
        else
        {
            isBomb = false;
        }
    }

    public boolean GetBomb()
    {
        return isBomb;
    }
    public void SetBombCount()
    {
        bombCount = bombCount + 1;
    }

}
