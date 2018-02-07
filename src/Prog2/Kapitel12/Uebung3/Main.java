package Prog2.Kapitel12.Uebung3;

public class Main {

    public static void main(String[] args) {
        Abteilungsleiter marco = new Abteilungsleiter("Seidel", "Marco", "80ms01", 5000, "16.07.1981");
        Person daniel = new Abteilungsleiter("Schmitt", "Daniel", "80ds02", 5000, "27.08.1990");
        Person nils = new Angestellter("Nils", "Rudolf", "80nr03", 2500, "keine Ahnung");
        Person jojo = new Angestellter("Johannes", "Rhode", "80jr04", 2500, "keine Ahnung");
        Person torsten = new Angestellter("Torsten", "Dietrich", "80td05", 2500, "keine Ahnung");
        Person felix = new Angestellter("Felix", "Breitenbach", "80fb06", 2500, "03.10.1987");

        Abteilung a1 = new Abteilung(marco, new Angestellter[]{(Angestellter)torsten, (Angestellter)felix});
        Abteilung a2 = new Abteilung((Abteilungsleiter)daniel, new Angestellter[]{(Angestellter)nils, (Angestellter)jojo});

        Unternehmen dollackAG = new Unternehmen(new Abteilung[]{a1, a2});

        System.out.println(marco.toString());
        System.out.println(daniel.toString());
        System.out.println(nils.toString());
        System.out.println(jojo.toString());
        System.out.println(torsten.toString());
        System.out.println(felix.toString());
        marco.befoerdern((Angestellter)felix);
        System.out.println(felix.toString());
        marco.befoerdern((Angestellter)felix);
        System.out.println(felix.toString());

        System.out.println(dollackAG);

        Person[] personen = {marco, daniel, nils, jojo, torsten, felix};
        for (Person p : personen) {
            System.out.println(p.toString());
        }
    }
}
