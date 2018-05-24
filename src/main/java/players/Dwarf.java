package players;

import tools.Axe;
import tools.Sword;

public class Dwarf extends Warrior{

    public Dwarf(String name){
        super(name, 11,  18, new Axe("Axe of Listkov", 7));
    }
}
