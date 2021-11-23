package com.tsi.lawler.jonelle.minesweeper;

public class Board {
    // Variables
    private Tile[][] coords;
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
        this.coords = new Tile[this.height][this.width];
        this.board = new boolean[this.height][this.width];
        this.bombCount = 0; // 0 whenever game resets
        InitTileArr();
    }

    public void InitTileArr()
    {
        for(int i = 0; i < this.height; i++)
        {
            for(int j = 0; j < this.width; j++)
            {
                coords[i][j] = new Tile();
            }
        }
    }

    // Set up the board

    public void InitBoard() {
       // InitTiles();
        for (int r = 0; r < this.height; r++) {
            for (int c = 0; c < this.width; c++)
            {
                int randomNum = (int) (Math.random() * (this.width));

                // BOMB = TRUE
               if(randomNum == 7)
                {
                    // set tile type and output
                   this.coords[r][c].SetType(1);
                    System.out.print(" * ");
                }
               // BOMB = TRUE
                else if(randomNum == 9)
                {
                    // set tile type and output
                   this.coords[r][c].SetType(1);
                    System.out.print(" * ");
                }
                // BOMB = FALSE
                else
                {
                    // set tile type and output
                    this.coords[r][c].SetType(2);
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
