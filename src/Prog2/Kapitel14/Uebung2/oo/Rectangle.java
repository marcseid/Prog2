package Prog2.Kapitel14.Uebung2.oo;

public class Rectangle implements Shape {

    double laenge;
    double breite;

    public Rectangle(double laenge, double breite) {
        this.laenge = laenge;
        this.breite = breite;
    }

    @Override
    public double calculateArea() {
        return laenge * breite;
    }

    @Override
    public double calculateCircumference() {
        return 2 * laenge + 2 * breite;
    }
}
