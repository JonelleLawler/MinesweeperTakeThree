import com.tsi.lawler.jonelle.minesweeper.Tile;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class TileTest {

    @Test
    public void TestTileType()
    {
        Tile testTile = new Tile();
        testTile.SetType(1);

        int testValue = testTile.GetType();
        assertEquals(testValue, 1);
    }

    @Test
    public void TestConstructor()
    {
        Tile testTile = new Tile();
        assertEquals(testTile.type, 2);
    }


}
