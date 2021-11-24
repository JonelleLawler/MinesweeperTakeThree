import com.tsi.lawler.jonelle.minesweeper.Board;
import org.junit.Test;

import static org.junit.Assert.*;


public class Boardtest {

    // Public
    int h = 5;
    int w = 5;

    @Test
    public void TestGetSize()
    {

        Board testBoard = new Board(h, w,10);
        int size = testBoard.GetSize();

        assertEquals(h * w, testBoard.GetSize());
    }


    @Test
    public void TestArray()
    {
        Board testBoard = new Board(5, 5 , 10);
        testBoard.InitTileArr();
        for(int i = 0; i < 5; i++)
        {
            for(int j = 0; j < 5; j++)
            {
                assertNotNull(testBoard.coords[i][j]);
            }
        }
    }

    @Test
    public void TestCheckLeftNeighbour()
    {
        Board testBoard = new Board(5, 5, 2);
        assertNotEquals(testBoard.checkLeftNeighbour(3, 3), 3);
    }

    @Test
    public void TestCheckRightNeighbour()
    {
        Board testBoard = new Board(5, 5, 2);
        assertNotEquals(testBoard.checkLeftNeighbour(3, 3), 3);
    }

    @Test
    public void TestCheckUpwardsNeighbour()
    {
        Board testBoard = new Board(5, 5, 2);
        assertNotEquals(testBoard.checkLeftNeighbour(3, 3), 3);
    }

    @Test
    public void TestCheckDownwardsNeighbour()
    {
        Board testBoard = new Board(5, 5, 2);
        assertNotEquals(testBoard.checkLeftNeighbour(3, 3), 3);
    }

    @Test
    public void TestBombCountThroughGame(){
        Board testBoard = new Board(15, 15, 2);
        assertNotEquals(0, testBoard.GetBombCount());

    }

    @Test
    public void TestSetBombCount()
    {
        Board testBoard = new Board(15, 15, 5);
        int initialBombCount = testBoard.GetBombCount();
        testBoard.SetBombCount();
        assertNotEquals(testBoard.GetBombCount(), initialBombCount);
    }



    @Test
    public void TestBoardConstructor()
    {
        Board testBoard = new Board(10, 10, 2);
        assertEquals(10, testBoard.height );
        assertEquals(10, testBoard.width);
        assertEquals(2, testBoard.bombs);
    }



}