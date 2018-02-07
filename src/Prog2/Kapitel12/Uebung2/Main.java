package Prog2.Kapitel12.Uebung2;

public class Main {
    public static void main(String[] args) {

        Frage[] quizbogen = new Frage[6];

        quizbogen[0] = new MCFrage("Wer ist dumm?", new String[] {"A: Ich", "B: Du", "C: Wir beide"});
        quizbogen[1] = new TextFrage("Wo sind wir gerade?");
        quizbogen[2] = new MCFrage("Was ist 1+1?", new String[] {"A: 1", "B: 2", "C: 3", "D: 4"});
        quizbogen[3] = new TextFrage("Wer bin ich?");
        quizbogen[4] = new MCFrage("Was mach ich hier eigentlich", new String[] {"A: Keine Ahnung", "B: Jodel"});
        quizbogen[5] = new TextFrage("Und wenn ja, wie viele?");

        for (Frage f : quizbogen) {
            f.toString();
        }
    }
}
