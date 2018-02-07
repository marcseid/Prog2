package Prog2.Kapitel14.Uebung2.oo;

public class Square implements Shape {

    double seitenlaenge;

    public Square(double seitenlaenge) {
        this.seitenlaenge = seitenlaenge;
    }

    @Override
    public double calculateArea() {
        return Math.pow(seitenlaenge, 2.0);
    }

    @Override
    public double calculateCircumference() {
        return seitenlaenge * 4;
    }
}
