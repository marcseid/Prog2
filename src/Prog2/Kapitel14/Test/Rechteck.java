package Prog2.Kapitel14.Test;

public class Rechteck {
    double laenge;
    double breite;
    public Rechteck() {
    }
    public Rechteck(double laenge, double breite) {
        this.laenge = laenge;
        this.breite = breite;
    }
    public double getLaenge() {
        return laenge;
    }
    public double getBreite() {
        return breite;
    }
    public void setLaenge(double laenge) {
        this.laenge = laenge;
    }
    public void setBreite(double breite) {
        this.breite = breite;
    }
}