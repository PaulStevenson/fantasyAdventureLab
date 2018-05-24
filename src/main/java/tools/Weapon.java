package tools;

import Interfaces.Attackable;
import Interfaces.IAttack;

public abstract class Weapon implements IAttack {

    private String name;
    private int damage;

    public Weapon( String name, int damage){
        this.name = name;
        this. damage = damage;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    @Override
    public void attack(Attackable attackable){
        attackable.takeDamage(damage);

    }
}
