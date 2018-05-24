import environments.Room;
import players.Dwarf;
import players.Knight;

public class Runner {
    public static void main(String[] args) throws InterruptedException {
        Knight knight = new Knight("Daniel");
        Dwarf dwarf = new Dwarf("Paul");

        Room room = new Room(knight, dwarf);
        room.fightToTheDeath();
    }
}
