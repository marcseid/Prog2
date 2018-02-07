package Prog2.Kapitel12.Uebung1;

public abstract class Person {

    final String NAME;

    Person (String name) {
        this.NAME = name;
    }

    abstract void printJob();

    String getName() {
        return NAME;
    }
}
