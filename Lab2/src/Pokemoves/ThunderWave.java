package Pokemoves;
import ru.ifmo.se.pokemon.*;
public class ThunderWave extends SpecialMove{
    public ThunderWave(){
        super(Type.ELECTRIC, 0, 90);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        if(Math.random()<=0.25){
            Effect.paralyze(p);
        }
    }
    @Override
    protected String describe() {
        return("использует Thunder Wave!");
    }
}
