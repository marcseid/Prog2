package Prog2.Kapitel13.Uebung1;

public class LaeuferImpl extends AbstractFigur implements Laeufer
{
  public LaeuferImpl(int x, int y)
  {
    super(x, y);
  }

  public Brett gibErlaubteFelder()
  {
    Brett brett = new Brett();
    //TODO: Erg�nzen Sie den Algorithmus zur Bestimmung der Felder
    for (int i = 1; i <= 8; i++)
    {
        if (x + i <= 8) {
            if (y + i <= 8) {
                brett.markiereFeld(x + i, y + i);}
            if (y - 1 > 0) {
                brett.markiereFeld(x + i, y - i);
            }
        }
        if (x - i > 0) {
            if (y + i <= 8) {
                brett.markiereFeld(x - i, y + i);}
            if (y - 1 > 0) {
                brett.markiereFeld(x - i, y - i);
            }
        }
    }
    return brett;
  }
  
  public static void main(String[] args)
  {
    LaeuferImpl l = new LaeuferImpl(4,5);
    Brett brett = l.gibErlaubteFelder();
    for (int j = 1; j <= 8; j++)
    {
      for (int i = 1; i <= 8; i++)
      {
        if (brett.gibFeld(i, j)) System.out.print(" x ");
        else System.out.print(" o ");
      }
      System.out.println();
    }
  }
}
