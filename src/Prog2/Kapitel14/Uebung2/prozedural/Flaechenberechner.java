package Prog2.Kapitel14.Uebung2.prozedural;

public class Flaechenberechner {
    double berechneFlaeche(Object o) {
        if (o.getClass() == Kreis.class) {
            return (Math.pow(((Kreis)o).durchmesser, 2.0) * Math.PI) / 4.0;
        }
        if (o.getClass() == Quadrat.class) {
            return Math.pow(((Quadrat)o).seitenlaenge, 2.0);
        }
        if (o.getClass() == Rechteck.class) {
            return ((Rechteck)o).laenge * ((Rechteck)o).breite;
        }
        return -1;
    }
    double berechneUmfang(Object o) {
        if (o.getClass() == Kreis.class) {
            return ((Kreis) o).durchmesser * Math.PI;
        }
        if (o.getClass() == Quadrat.class) {
            return ((Quadrat) o).seitenlaenge * 4;
        }
        if (o.getClass() == Rechteck.class) {
            return ((Rechteck) o).laenge * 2 + ((Rechteck) o).breite * 2;
        }
        return -1;
    }
}
