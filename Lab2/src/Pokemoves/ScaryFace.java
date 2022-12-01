package Pokemoves;
import ru.ifmo.se.pokemon.*;
public class ScaryFace extends StatusMove{
    public ScaryFace(){
        super(Type.NORMAL, 0, 100);
    }
    protected int stageLowered = -1;
    @Override
    protected void applyOppEffects(Pokemon p){
        if(stageLowered>=-6){
            stageLowered -= 2;
            p.setMod(Stat.SPEED, stageLowered);
        }
    }
    @Override
    protected String describe() {
        return("использует Scary Face!");
    }
}
