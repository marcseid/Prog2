package Prog2.Kapitel13.Uebung4;

public class RoboterImpl implements Roboter{
    void aufladen(){
        System.out.println("Bin laden");
    };
    void warten(){
        System.out.println("Ich warte");
    };

    @Override
    public void arbeiten() {
        System.out.println("Ich arbeite");
    }

    @Override
    public void autofahren() {
        System.out.println("Ich fahre Auto");
    }

    @Override
    public Entscheidung entscheide(Situation s){
        if (s == Situation.GEFAHR_LINKS) {
            return Entscheidung.RECHTS;
        }
        else if (s == Situation.GEFAHR_RECHTS) {
            return Entscheidung.LINKS;
        }
        else if (s == Situation.GEFAHR_VORNE) {
            return Entscheidung.BREMSEN;
        }
        return null;
    }

    @Override
    public Entscheidung entscheide(Entscheidung e1, Entscheidung e2) {
        return null;
    }
}
