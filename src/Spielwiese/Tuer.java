package Spielwiese;

public class Tuer {

    boolean offen = false;

    public Tuer() {
        boolean offen = false;
    }

    public Tuer(boolean offen) {
        this.offen = offen;
    }

    public boolean isOffen() {
        return offen;
    }

    public void setOffen(boolean offen) {
        this.offen = offen;
    }
    public void switchOffen(boolean offen) {
        if (offen == false) this.offen = true;
        else this.offen = false;
    }
}
