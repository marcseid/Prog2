package Prog2.Kapitel12.Uebung4;

public class MySimpleChangeCalculator extends SimpleChangeCalculator {

    public static void main(String[]args){
        MySimpleChangeCalculator mscc = new MySimpleChangeCalculator();

        //mscc.test();
        mscc.myTest(1, 70);
        mscc.myTest(3, 88);

        mscc.myTest(5, 55);
        mscc.myTest(7, 77);
    }

    @Override
    public int[] getChange(int euros, int cent)
    {
        int zweieuro = euros / 2;
        euros = euros % 2;
        int eineuro = euros;
        int fuenfzigcent = cent / 50;
        cent = cent % 50;
        int zwanzigcent = cent / 20;
        cent = cent % 20;
        int zehngcent = cent / 10;
        cent = cent % 10;
        int fuenfcent = cent / 5;
        cent = cent % 5;
        int zweicent = cent / 2;
        cent = cent % 2;
        int eincent = cent;

        return new int[] {
                eincent,
                zweicent,
                fuenfcent,
                zehngcent,
                zwanzigcent,
                fuenfzigcent,
                eineuro,
                zweieuro
        };
    }
    void myTest(int euro, int cent){

        int[] result = getChange(euro,cent);
        int j = 0;

        System.out.println("\nBei "+euro+","+cent+" gibt der Automat folgende Muenzen zurueck:");
        for (int i=0; i < Coin.availableCoins.length; i++)
        {
            System.out.println(result[i] + " x " + Coin.availableCoins[i].getName());
            j += result[i];
        }
        System.out.println("Anzahl der Münzen: " + j);}
}
