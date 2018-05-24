import org.junit.Before;
import org.junit.Test;
import players.Dwarf;
import players.Knight;

import static org.junit.Assert.assertEquals;

public class DwarfTest {

    Dwarf dwarf;

    @Before
    public void before(){
        dwarf = new Dwarf("Paul");
    }

    @Test
    public void hasName() {
        assertEquals("Paul", dwarf.getName());
    }

    @Test
    public void hasHealth(){
        assertEquals(11, dwarf.getHealth());
    }

    @Test
    public void hasDefence(){
        assertEquals(18, dwarf.getDefence());
    }

    @Test
    public void hasWeapomn(){
        assertEquals("Axe of Listkov", dwarf.getWeapon().getName());
    }
}
