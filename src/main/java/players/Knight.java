package players;

import tools.Sword;

public class Knight extends Warrior{

    public Knight(String name){
        super(name, 14,  15, new Sword("Sword of Polymorphism", 6));
    }
}
