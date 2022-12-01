package Pokemoves;
import ru.ifmo.se.pokemon.*;
public class TakeDown extends PhysicalMove {
    public TakeDown(){
        super(Type.ICE, 90, 85);
    }
    @Override
    protected void applySelfDamage(Pokemon att, double d) {
        super.applySelfDamage(att, d/4);
    }
    @Override
    protected String describe(){
        return ("использует Take Down!");
    }
}