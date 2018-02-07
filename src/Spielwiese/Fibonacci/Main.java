package Spielwiese.Fibonacci;

import com.sun.org.apache.xpath.internal.SourceTree;

public class Main {

//    static int n = 92; //Die wievielte Zahl man will
    static int n = 90;
    static int alt = 1;
    static int ganzAlt = 0;


    public static void main(String[] args) {
        for (int i = 0; i <= n; i++)
             System.out.println(fibonacciArray(i));
    }

    static long fibonacciArray(int n) {
        if (n == 0) return 0;
        else if (n == 1) return 1;
        long ergebnis;

        long[] fZahlen = new long[n + 1];
        fZahlen[0] = 0;
        fZahlen[1] = 1;

        for (int i = 2; i < fZahlen.length; i++) {
            fZahlen[i] = fZahlen[i - 1] + fZahlen[i - 2];
        }
        ergebnis = fZahlen[n];
        return ergebnis;
    }
    static long fibonacciRek (int n) {
        if (n <= 0) return 0;
        else if (n == 1) return 1;
        else
            return fibonacciRek(n-2)+fibonacciRek(n-1);
    }
}
