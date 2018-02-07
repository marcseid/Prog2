package Tutorium_Termin_1;

public class Hausmeister extends Person implements Gehalt{

    Hausmeister(String name, String nachname, String geburtsdatum){
        this.name = name;
        this.nachname = nachname;
        this.geburtsdatum = geburtsdatum;
    }

    public int angestelltenNummer;

    @Override
    public void gebePersonenDatenAus() {
        System.out.println(name + " " + nachname + " " + geburtsdatum);
    }

    @Override
    public void monatlichesGehalt() {
        System.out.println("8,50€");
    }
}
