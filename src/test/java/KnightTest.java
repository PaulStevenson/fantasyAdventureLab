import org.junit.Before;
import org.junit.Test;
import players.Knight;
import tools.Weapon;

import static org.junit.Assert.assertEquals;

public class KnightTest {

    Knight knight;

    @Before
    public void before(){
        knight = new Knight("Daniel");
    }

    @Test
    public void hasName() {
        assertEquals("Daniel", knight.getName());
    }

    @Test
    public void hasHealth(){
        assertEquals(14, knight.getHealth());
    }

    @Test
    public void hasDefence(){
        assertEquals(15, knight.getDefence());
    }

    @Test
    public void hasWeapomn(){
        assertEquals("Sword of Polymorphism", knight.getWeapon().getName());
    }
}
