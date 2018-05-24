package players;

import Interfaces.Attackable;

public abstract class Player implements Attackable {

    private String name;
    private int health;
    private int defence;
    private final int MAX_HEALTH;

    public Player(String name, int health, int defence){
        this.name = name;
        this.health = health;
        this.defence = defence;
        this.MAX_HEALTH = health;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getDefence() {
        return defence;
    }

    public int getMAX_HEALTH() {
        return MAX_HEALTH;
    }

    @Override
    public void takeDamage(int damage) {
        if ( damage > health) {
            health = 0;
        } else {
            health -= damage;
        }
        System.out.println(String.format("%s now has %d health", name, health));
    }

    @Override
    public boolean isDead() {
        return health <= 0;
    }


}
