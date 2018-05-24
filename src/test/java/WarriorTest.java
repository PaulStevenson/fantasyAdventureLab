import org.junit.Before;
import org.junit.Test;
import players.Knight;
import players.Warrior;
import tools.Axe;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class WarriorTest {

    Warrior warrior;

    @Before
    public void before(){
        warrior = new Knight("Daniel");
    }

    @Test
    public void hasWeapon() {
        assertNotNull(warrior.getWeapon());
    }

    @Test
    public void canChangeWeapon(){
        warrior.changeWeapon(new Axe("Axe of Listkov", 7));
        assertTrue(warrior.getWeapon() instanceof Axe);
    }

    @Test
    public void canAttack(){
        warrior.attack(warrior);
        assertEquals(8, warrior.getHealth());
    }
}
