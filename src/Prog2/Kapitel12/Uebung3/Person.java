package Prog2.Kapitel12.Uebung3;

public class Person {

    String nachname, vorname, id, geburtsdatum;
    int grundgehalt;
    float gehaltsfaktor;
    float gehalt;

    Person (String nachname, String vorname, String id, int grundgehalt, float gehaltsfaktor, String geburtsdatum) {
        this.nachname = nachname;
        this.vorname = vorname;
        this.id = id;
        this.grundgehalt = grundgehalt;
        this.gehaltsfaktor = gehaltsfaktor;
        this.geburtsdatum = geburtsdatum;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGeburtsdatum() {
        return geburtsdatum;
    }

    public void setGeburtsdatum(String geburtsdatum) {
        this.geburtsdatum = geburtsdatum;
    }

    public int getGrundgehalt() {
        return grundgehalt;
    }

    public void setGrundgehalt(int grundgehalt) {
        this.grundgehalt = grundgehalt;
    }

    public float getGehaltsfaktor() {
        return gehaltsfaktor;
    }

    public void setGehaltsfaktor(float gehaltsfaktor) {
        this.gehaltsfaktor = gehaltsfaktor;
    }
    public float getGehalt() {
        return grundgehalt * gehaltsfaktor;
    }
    @Override
    public String toString(){

        return vorname + " " + nachname + " " + grundgehalt + " " + gehaltsfaktor + " " + getGehalt();
    }
}
