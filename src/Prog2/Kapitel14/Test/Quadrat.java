package Prog2.Kapitel14.Test;

public class Quadrat extends Rechteck {
    public Quadrat(double seitenlaenge) {
        this.laenge = seitenlaenge;
    }
    public double getBreite() {
        return laenge;
    }
    public static void main(String[] args)
    {
        Rechteck r = new Quadrat(5);
        r.setLaenge(5);
        r.setBreite(4);
        System.out.println("Der Flächeninhalt ist: " +
                r.getBreite() * r.getLaenge());
    }
}
