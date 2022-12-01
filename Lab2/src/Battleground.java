import ru.ifmo.se.pokemon.*;
import Pokemos.*;

class Battleground {
    public static void main(String[] args){
        Battle b = new Battle();
        Dialga dialga = new Dialga("Cимпл", 2);
        Seel seel = new Seel("Перфыч", 1);
        Dewgong dewgong = new Dewgong("Джейм", 3);
        Cleffa cleffa = new Cleffa("Широ", 2);
        Clefairy clefairy = new Clefairy("Монеси", 1);
        Clefable clefable = new Clefable("Аксиль",3);
        b.addAlly(dialga);
        b.addAlly(seel);
        b.addAlly(dewgong);
        b.addFoe(cleffa);
        b.addFoe(clefairy);
        b.addFoe(clefable);
        b.go();
    }
}
