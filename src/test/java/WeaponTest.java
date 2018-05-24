import org.junit.Before;
import org.junit.Test;
import players.Knight;
import players.Player;
import tools.Sword;
import tools.Weapon;

import static junit.framework.Assert.assertEquals;

public class WeaponTest {

    Weapon weapon;
    Player player;

    @Before
    public void before(){
        weapon = new Sword("Sword of polymorphism", 6);
        player = new Knight("Daniel");
    }

    @Test
    public void getName() {
        assertEquals("Sword of polymorphism", weapon.getName());
    }

    @Test
    public void getDamage() {
        assertEquals(6, weapon.getDamage());
    }

    @Test
    public void canAttack(){
        weapon.attack(player);
        assertEquals(8, player.getHealth());

    }
}
