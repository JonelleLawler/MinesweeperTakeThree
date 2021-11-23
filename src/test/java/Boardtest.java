import com.tsi.lawler.jonelle.minesweeper.Board;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class Boardtest {

    @Test
    public void TestGetSize()
    {
        int h = 5;
        int w = 5;
        Board testBoard = new Board(h, w, 10);
        int size = testBoard.GetSize();

        assertEquals(h * w, testBoard.GetSize());


    }

}