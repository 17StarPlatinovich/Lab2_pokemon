package Pokemoves;
import ru.ifmo.se.pokemon.*;
public class IcyWind extends SpecialMove {
    public IcyWind(){
        super(Type.ICE, 55, 95);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        if (Math.random() <= 0.9960) {
            p.setMod(Stat.SPEED, -1);
        }

    }
    protected String describe() {
        return("использует Icy Wind!");
    }
}
