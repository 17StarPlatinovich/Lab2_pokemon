package Pokemoves;
import ru.ifmo.se.pokemon.*;
public class Headbutt extends PhysicalMove {
    public Headbutt(){
        super(Type.NORMAL, 70, 100);
    }
    protected void applyOppEffects(Pokemon p){
        if(Math.random()<=0.3){
            Effect.flinch(p);
        }
    }
    protected String describe() {
        return("использует Headbutt!");
    }
}
