import com.tsi.lawler.jonelle.minesweeper.GameManager;
import com.tsi.lawler.jonelle.minesweeper.GameStates;
import org.junit.Test;

import static org.junit.Assert.assertNotEquals;
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

}
