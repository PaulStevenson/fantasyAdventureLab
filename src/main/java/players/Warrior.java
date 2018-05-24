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
        System.out.println(String.format("%s attacks %s for %d damage", getName(), attackable.getName(), weapon.getDamage()));
        weapon.attack(attackable);
    }
}
