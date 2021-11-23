import com.tsi.lawler.jonelle.minesweeper.Board;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


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


}