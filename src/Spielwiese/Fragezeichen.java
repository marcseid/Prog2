package Spielwiese;

public class Fragezeichen {

    public static void main (String[] args) {
        int f = 10;
        System.out.println("Fakultät von " + f + " ist " + fac(f));
    }

    public static int fac(int n){ return n <=1 ? 1 : n * fac( n -1 ); }
}
