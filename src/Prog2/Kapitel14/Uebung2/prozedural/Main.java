package Prog2.Kapitel14.Uebung2.prozedural;

public class Main {
    public static void main(String[] args) {

        Flaechenberechner f = new Flaechenberechner();
        Kreis k = new Kreis(10);
        Quadrat q = new Quadrat(5);
        Rechteck r = new Rechteck(5, 10);

        System.out.println(f.berechneFlaeche(k));
        System.out.println(f.berechneUmfang(k));
        System.out.println(f.berechneFlaeche(q));
        System.out.println(f.berechneUmfang(q));
        System.out.println(f.berechneFlaeche(r));
        System.out.println(f.berechneUmfang(r));
    }
}
