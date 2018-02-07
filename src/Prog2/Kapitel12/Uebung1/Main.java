package Prog2.Kapitel12.Uebung1;

public class Main {

    public static void main(String[] args) {
        Person[] personen = new Person[10];

        for (int i = 0; i < personen.length; i++) {
            if (i % 2 == 0) personen[i] = new Student("Localhorst");
                else personen[i] = new Professor("Ritali");
        }

        for (Person p : personen) {
            p.printJob();
            System.out.println(p.getName());
        }
    }
}
