package com.tsi.lawler.jonelle.minesweeper;

public class Tile {

    // Variables
    public int type;

    public Tile()
    {
        type = 2; // default type is not a mine
    }


    public void SetType(int input)
    {
        if(input == 1)
        {
            type = 1; // bomb
        }
        if(input == 2)
        {
            type = 2; // normal
        }
    };

    public int GetType()
    {
        return type;
    }

}
