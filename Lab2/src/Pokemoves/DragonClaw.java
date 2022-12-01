package Pokemoves;
import ru.ifmo.se.pokemon.*;
public class DragonClaw extends PhysicalMove {
    public DragonClaw(){
        super(Type.DRAGON, 80, 100);
    }
    @Override
    protected void applyOppDamage(Pokemon p, double damage){
        super.applyOppDamage(p, 80);
    }
    protected String describe() {
        return("использует Dragon Claw!");
    }
}
