import com.tsi.lawler.jonelle.minesweeper.Board;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


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
    public void TestSetBomb()
    {
        Board testBoard = new Board(h, w,10);
        boolean testBomb = true;
        boolean testBomb2 = false;
        testBoard.SetBomb(1);
        testBomb2 = testBoard.GetBomb();

        assertEquals(testBomb, testBomb2);
    }

}