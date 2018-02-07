package Prog2.Kapitel14.Uebung2.oo;

public class Circle implements Shape {

    double durchmesser;
    double radius = durchmesser / 2.0;

    public Circle(double durchmesser) {
        this.durchmesser = durchmesser;
    }

    @Override
    public double calculateArea() {
        return (Math.pow(durchmesser, 2.0) * Math.PI) / 4.0;
    }

    @Override
    public double calculateCircumference() {
        return durchmesser * Math.PI;
    }
}
