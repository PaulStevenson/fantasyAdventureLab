package environments;

import players.Player;
import players.Warrior;


import java.util.Random;

public class Room {

    private Warrior player1;
    private Warrior player2;
    private static final int TIME_DELAY = 1500;

    public Room(Warrior player1, Warrior player2){
        this.player1 = player1;
        this.player2 = player2;
    }

    public void fightToTheDeath() throws InterruptedException {

        System.out.println(String.format("%s is fighting %s: ", player1.getName(), player2.getName()));
        Random rng = new Random();
        while(!player1.isDead() && !player2.isDead()){
            Thread.sleep(TIME_DELAY);
            System.out.println();
            if(rng.nextBoolean()){
                player1.attack(player2);
            }else{
                player2.attack(player1);
            }
        }

        if(player1.isDead()){
            System.out.println(player2.getName() + " Wins!!!");
        }else{
            System.out.println(player1.getName() + " Wins!!!");
        }
    }
}
