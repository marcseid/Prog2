package Tutorium_Termin_1;

public class KeineZahlException extends Exception {
    private Exception exception;

    public KeineZahlException(Exception exception) {
        this.exception = exception;
    }

}
