import org.junit.Before;
import org.junit.Test;
import tools.Sword;
import tools.Weapon;

import static junit.framework.Assert.assertEquals;

public class WeaponTest {

    Weapon weapon;

    @Before
    public void before(){
        weapon = new Sword("Sword of polymorphism", 6);
    }

    @Test
    public void getName() {
        assertEquals("Sword of polymorphism", weapon.getName());
    }

    @Test
    public void getDamage() {
        assertEquals(6, weapon.getDamage());
    }
}
