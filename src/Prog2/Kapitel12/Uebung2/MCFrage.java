package Prog2.Kapitel12.Uebung2;

public class MCFrage extends Frage {

    String[] antworten;

    MCFrage(String frage, String[] antworten) {
        super(frage);
        this.antworten = antworten;
    }

    @Override
    public String toString() {
        System.out.println();
        System.out.println(frage);
        System.out.println();
        System.out.println("Antwortmöglichkeiten: ");
        for (int i = 0; i < antworten.length; i++) {
            System.out.println(antworten[i]);
        }
        return null;
    }
}
