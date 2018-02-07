package Prog2.Kapitel12.Uebung2;

public class TextFrage extends Frage {

    TextFrage(String frage) {
        super(frage);
    }

    @Override
    public String toString() {
        System.out.println();
        System.out.println(frage);
        System.out.println();
        System.out.println("Antwort: ");
        System.out.println();
        System.out.println();
        return null;
    }
}
