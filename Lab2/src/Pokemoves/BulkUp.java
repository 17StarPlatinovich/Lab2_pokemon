package Pokemoves;
import ru.ifmo.se.pokemon.*;
public class BulkUp extends StatusMove{
    public BulkUp(){
        super(Type.FIGHTING, 0, 0);
    }
    protected int stageRaised = 1;
    @Override
    protected void applySelfEffects(Pokemon p) {
        if(stageRaised<=6){
            stageRaised+=1;
            p.setMod(Stat.ATTACK, stageRaised);
            p.setMod(Stat.DEFENSE, stageRaised);
        }
    }
    protected String describe() {
        return("использует Bulk Up!");
    }
}
