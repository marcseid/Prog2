package Prog2.Kapitel13.Uebung4;

import com.sun.org.apache.xpath.internal.SourceTree;

public class Cyborg implements Mensch, Roboter {

    Mensch mensch;
    Roboter roboter;

    public Cyborg ()
    {
        super();
        mensch = new MenschImpl();
        roboter = new RoboterImpl();
    }

    @Override
    public void arbeiten() {
        System.out.println("Ich arbeite");
    }

    @Override
    public void autofahren() {
        System.out.println("Ich fahre Auto");
    }

    @Override
    public Entscheidung entscheide(Situation s) {
        return null;
    }

    @Override
    public Entscheidung entscheide(Entscheidung entscheidungMensch, Entscheidung entscheidungRoboter) {
        int zufallszahl = (int) ((Math.random() * 100) + 1);
        if (entscheidungMensch == entscheidungRoboter) {
            return entscheidungMensch;
        }
            else if (zufallszahl % 2 == 0) {
                return entscheidungMensch; }
                else {
                return entscheidungRoboter;
            }
        }

    public static void main(String[] args) {
        Whatever[] test = {new RoboterImpl(), new MenschImpl(), new Cyborg(), new RoboterImpl(), new MenschImpl(), new Cyborg()};
/*        for (Whatever w : test) {
            System.out.println(w.entscheide(Situation.GEFAHR_LINKS));
            System.out.println(w.entscheide(Situation.GEFAHR_RECHTS));
            System.out.println(w.entscheide(Situation.GEFAHR_VORNE));
        }*/
        System.out.println();
        System.out.println(test[2].entscheide(Entscheidung.BREMSEN, Entscheidung.UNENTSCHIEDEN));
        System.out.println(test[2].entscheide(Entscheidung.LINKS, Entscheidung.UNENTSCHIEDEN));
        System.out.println(test[2].entscheide(Entscheidung.RECHTS, Entscheidung.UNENTSCHIEDEN));
        System.out.println(test[2].entscheide(Entscheidung.BREMSEN, Entscheidung.BREMSEN));
        System.out.println(test[2].entscheide(Entscheidung.LINKS, Entscheidung.LINKS));
        System.out.println(test[2].entscheide(Entscheidung.RECHTS, Entscheidung.RECHTS));
    }
}
