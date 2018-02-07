package Tutorium_Termin_1;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class AutoImport {
    public static void main(String[] args) {
        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {
            boolean eof = false;
            fis = new FileInputStream("obj.data");
            ois = new ObjectInputStream(fis);
            while (!eof) {
                try {
                    Object o = ois.readObject();
                    Auto a1 = (Auto) o;
                    a1.getMarke();
                    a1.getKennzeichen();
                    a1.getPS();
                } catch (EOFException e) {
                    eof = true;
                }
            }
            ois.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}