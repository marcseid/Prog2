package Prog2.Kapitel12.Uebung1;

public class Student extends Person {

    Student(String name) {
        super(name);
    }

    @Override
    void printJob() {
        System.out.println("Der Student säuft");
    }

}
