package com.tsi.lawler.jonelle.minesweeper;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        // Going to clear this out and put into game class
        Board board = new Board(10, 10, 10);
        board.InitBoard();
        Scanner scanner = new Scanner(System.in);
        Player player = new Player();
    }
}
