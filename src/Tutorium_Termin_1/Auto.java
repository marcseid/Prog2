package Tutorium_Termin_1;

import java.io.Serializable;

public class Auto implements Serializable{
    String marke;
    String kennzeichen;
    int PS;

    public Auto (String marke, String kennzeichen, int PS) {
        this.marke = marke;
        this.kennzeichen = kennzeichen;
        this.PS = PS;
    }

    public String getMarke() {
        System.out.println(marke);
        return marke;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    public String getKennzeichen() {
        System.out.println(kennzeichen);
        return kennzeichen;
    }

    public void setKennzeichen(String kennzeichen) {
        this.kennzeichen = kennzeichen;
    }

    public int getPS() {
        System.out.println(PS);
        return PS;
    }

    public void setPS(int PS) {
        this.PS = PS;
    }
}
