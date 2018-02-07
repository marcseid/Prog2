package Tutorium_Termin_1;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class AutoMain {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        Auto A1 = new Auto ("Opel", "WÜ-AB 123", 75);
        Auto A2 = new Auto ("Renault", "MSP-MS 208", 224);

        try {
            fos = new FileOutputStream("obj.data");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(A1);
            oos.writeObject(A2);
            oos.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
