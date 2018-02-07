package Prog2.Kapitel12.Uebung1;

public class Professor extends Person {

    Professor(String name) {
        super(name);
    }

    @Override
    void printJob() {
        System.out.println("Der Professor professiert");
    }
}
