package Pokemos;
import Pokemoves.*;
public class Clefable extends Clefairy{
    public Clefable(String name, int lvl){
        super(name, lvl);
        setStats(95, 70, 73, 85, 90, 60);
        addMove(new DisarmingVoice());
    }
}
