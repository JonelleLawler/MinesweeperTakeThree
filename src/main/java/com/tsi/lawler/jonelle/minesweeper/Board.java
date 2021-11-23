package com.tsi.lawler.jonelle.minesweeper;

public class Board {
    // Variables
    private int[][] coords;
    private boolean[][] board;
    private int height;
    private int width;
    private int bombs;
    private boolean endGame;


    // Board constructor
    public Board(int h, int w, int b) {
        this.height = h;
        this.width = w;
        this.bombs = b;
        this.coords = new int[0][0];
        this.board = new boolean[this.height][this.width];
        placeBombs();
    }


    // Set up the board
    public void InitBoard() {
        for (int r = 0; r < this.height; r++) {
            for (int c = 0; c < this.width; c++)
            {
                System.out.print(" X ");
            }
            System.out.println();
        }

    }

    //places the bombs on the board
    public void placeBombs()
    {
        int r = 0;
        int c = 0;

        for(int i = 0; i < this.bombs; i++)
        {
            // Base random number on board size
            r = (int)(Math.random() * this.height);
            c = (int)(Math.random() * this.width);
        }

    }

    // Check adjacent tiles
    public int checkAdjacent(int y, int x) {
        int sum = 0;
        for (int r = -1; r <= 1; r++) {
            if (y + r >= 0 && y + r <= this.height - 1) {
                for (int c = -1; c <= 1; c++) {
                    if (x + c >= 0 && x + c <= this.width - 1 && (c != 0 || r != 0)) {
                        if (coords[y + r][x + c] == -1) sum++;
                    }
                }
            }
        }
        return sum;
    }

    // get size of board
    public int GetSize()
    {
        return this.height * this.width;
    }

}
