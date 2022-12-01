package Pokemos;
import Pokemoves.*;
public class Dewgong extends Seel{
    public Dewgong(String name, int lvl){
        super(name, lvl);
        setStats(90, 70, 80, 70, 95, 70);
        addMove(new FrostBreath());
    }
}
