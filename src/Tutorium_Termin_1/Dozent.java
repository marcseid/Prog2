package Tutorium_Termin_1;

public class Dozent extends Person implements Gehalt, Vorlesung{

    public int dozentenNummer;

    @Override
    public void gebePersonenDatenAus() {
        System.out.println(name + " " + nachname + " " + geburtsdatum);
    }

    @Override
    public void monatlichesGehalt() {
        System.out.println("1. Mio Yen");
    }

    @Override
    public void aktuelleVorlesung() {
        System.out.println("Info für Dummies");
    }
}
