package Pokemos;
import Pokemoves.*;
import ru.ifmo.se.pokemon.*;
public class Dialga extends Pokemon {
    public Dialga(String name, int lvl){
        super(name, lvl);
        setStats(100,120,120,150,100,90);
        setType(Type.STEEL);
        setMove(new DragonClaw(), new Flamethrower(), new ScaryFace(), new BulkUp());
    }
}
