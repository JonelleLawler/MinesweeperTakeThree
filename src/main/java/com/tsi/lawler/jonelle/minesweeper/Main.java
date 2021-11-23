package com.tsi.lawler.jonelle.minesweeper;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Board board = new Board(10, 10, 5);
        board.InitBoard();
        Scanner scanner = new Scanner(System.in);
    }
}
