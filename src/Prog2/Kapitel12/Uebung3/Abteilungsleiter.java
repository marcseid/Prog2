package Prog2.Kapitel12.Uebung3;

public class Abteilungsleiter extends Person{
    Abteilungsleiter(String nachname, String vorname, String id, int grundgehalt, String geburtsdatum) {
        super(nachname, vorname, id, grundgehalt, 2, geburtsdatum);
    }
    void befoerdern(Angestellter a) {
        a.setGehaltsfaktor((float) (a.getGehaltsfaktor()*1.1));
    }

}
