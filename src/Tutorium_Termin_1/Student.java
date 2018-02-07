package Tutorium_Termin_1;

public class Student extends Person implements Vorlesung{

    public int matrikelNummer;

    @Override
    public void gebePersonenDatenAus() {
        System.out.println(name + " " + nachname + " " + geburtsdatum);
    }

    @Override
    public void aktuelleVorlesung() {
        System.out.println("Der faule Student macht doch nix");
    }
}
