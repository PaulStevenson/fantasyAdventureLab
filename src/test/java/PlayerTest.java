import org.junit.Before;
import org.junit.Test;
import players.Knight;
import players.Player;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PlayerTest {
    Player player;

    @Before
    public void setup(){
        player = new Knight("Daniel");
    }

    @Test
    public void hasName(){
        assertEquals("Daniel", player.getName());
    }

    @Test
    public void hasHealth(){
        assertEquals(14, player.getHealth());
    }

    @Test
    public void hasDefence(){
        assertEquals(15, player.getDefence());
    }

    @Test
    public void hasMaxHealth(){
        assertEquals(14, player.getMAX_HEALTH());
    }

    @Test
    public void canTakeDamage(){
        player.takeDamage(6);
        assertEquals(8, player.getHealth() );
    }

    @Test
    public void healthCantGoBelowZero(){
        player.takeDamage(40);
        assertEquals(0, player.getHealth() );
    }

    @Test
    public void isDeadTrue(){
        player.takeDamage(14);
        assertTrue(player.isDead());
    }

    @Test
    public void isDeadFalse(){
        assertFalse(player.isDead());
    }
}
