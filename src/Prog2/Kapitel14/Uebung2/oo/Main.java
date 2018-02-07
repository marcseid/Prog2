package Prog2.Kapitel14.Uebung2.oo;

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle(10);
        Square s = new Square(5);
        Rectangle r = new Rectangle(5, 10);

        System.out.println(c.calculateArea());
        System.out.println(c.calculateCircumference());
        System.out.println(s.calculateArea());
        System.out.println(s.calculateCircumference());
        System.out.println(r.calculateArea());
        System.out.println(r.calculateCircumference());
    }
}
