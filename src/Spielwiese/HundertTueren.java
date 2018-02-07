package Spielwiese;

public class HundertTueren {
    public static void main(String[] args) {
        Tuer[] hundertTueren = new Tuer[100];
        for (int i = 0; i < hundertTueren.length; i++) {
            hundertTueren[i] = new Tuer();
        }
        for (int i = 1; i < hundertTueren.length; i++) {
            for (int j = i - 1; j < hundertTueren.length; j = j + i) {
                hundertTueren[j].switchOffen(hundertTueren[j].isOffen());
                System.out.println(j + " " +  hundertTueren[j].isOffen());
                }
        }
        int offen = 0;
        int zu = 0;
        for (int i = 0; i < hundertTueren.length; i++) {
            if (hundertTueren[i].isOffen() == false)
                zu++;
                else offen++;
        }
        System.out.println("Offen: " + offen + " und zu: " + zu);
    }
}
