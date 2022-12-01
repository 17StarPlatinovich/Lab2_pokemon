package Pokemoves;
import ru.ifmo.se.pokemon.*;
import static java.lang.Double.MAX_VALUE;
public class DisarmingVoice extends SpecialMove{
    public DisarmingVoice(){
        super(Type.FAIRY, 40, MAX_VALUE);
    }
    @Override
    protected void applyOppDamage(Pokemon p, double damage){
        super.applyOppDamage(p, 40);
        }
    @Override
    protected String describe() {
        return("использует Disarming Voice!");
    }
}
