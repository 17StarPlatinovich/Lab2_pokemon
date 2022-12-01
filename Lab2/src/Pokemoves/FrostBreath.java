package Pokemoves;
import ru.ifmo.se.pokemon.*;
public class FrostBreath extends SpecialMove{
    public FrostBreath(){
        super(Type.ICE, 60, 90);
    }
    @Override
    protected void applyOppDamage(Pokemon def, double damage){
        super.applyOppDamage(def, damage*1.5);
    }
    @Override
    protected String describe() {
        return("использует Frost Breath!");
    }
}
