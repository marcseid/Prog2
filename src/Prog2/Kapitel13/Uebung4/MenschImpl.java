package Prog2.Kapitel13.Uebung4;

public class MenschImpl implements Mensch{
    void essen(){
        System.out.println("Ich esse");
    };
    void schlafen(){
        System.out.println("Ich schlafe");
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

        int zufallszahl = (int) ((Math.random()*100)+1);
        if (zufallszahl <= 25) {
            return Entscheidung.UNENTSCHIEDEN;
        }

        if (s == Situation.GEFAHR_LINKS) {
            return Entscheidung.RECHTS;
        }
        if (s == Situation.GEFAHR_RECHTS) {
            return Entscheidung.LINKS;
        }
        if (s == Situation.GEFAHR_VORNE) {
            return Entscheidung.BREMSEN;
        }
        return null;
    }

    @Override
    public Entscheidung entscheide(Entscheidung e1, Entscheidung e2) {
        return null;
    }
}
