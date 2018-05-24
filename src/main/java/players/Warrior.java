package players;

import Interfaces.Attackable;
import tools.Axe;
import tools.Weapon;

public abstract class Warrior extends Player {
    private Weapon weapon;

    public Warrior(String name, int health, int defence, Weapon weapon){
        super(name, health, defence);
        this.weapon = weapon;
    }


    public Weapon getWeapon() {
        return weapon;
    }

    public void changeWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void attack(Attackable attackable) {
        weapon.attack(attackable);
    }
}
