package Pokemos;
import Pokemoves.*;
public class Clefairy extends Cleffa{
    public Clefairy(String name, int lvl){
        super(name, lvl);
        setStats(70, 45, 48, 60, 65, 35);
        addMove(new Growl());
    }
}
