import com.tsi.lawler.jonelle.minesweeper.GameManager;
import com.tsi.lawler.jonelle.minesweeper.GameStates;
import org.junit.Test;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertEquals;
public class GameManagerTest {

    @Test
    public void TestSetState()
    {

        GameManager gameManager = new GameManager();
        GameStates initialState = gameManager.GetCurrentState();
        gameManager.SetCurrentState(GameStates.PLAY);
        GameStates newState = gameManager.GetCurrentState();
        assertNotEquals(initialState, newState);
    }

    @Test
    public void TestGetTileType()
    {
        GameManager gameManager = new GameManager();
        assertEquals(gameManager.CheckTileCoords(1, 2), true);
        // this will change when check tile coords is done just want to see if coverage goes up as coverage is
        // much higher on checker in IntelliJ than it is on SonarCloud
    }

}
