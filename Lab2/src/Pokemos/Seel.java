package Pokemos;
import ru.ifmo.se.pokemon.*;
import Pokemoves.*;
public class Seel extends Pokemon{
    public Seel(String name, int lvl){
        super(name, lvl);
        setStats(65,45,55,45,70,45);
        setType(Type.WATER);
        setMove(new TakeDown(), new Headbutt(), new IcyWind());
    }
}
