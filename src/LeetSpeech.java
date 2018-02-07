import Tutorium_Termin_1.LeetWriter;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class LeetSpeech {

    public static void main(String[] args) throws Exception {

        final String FILE = "leet.txt";

        try (BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
             LeetWriter LW = new LeetWriter(new FileWriter(FILE)))
        {
            System.out.print("Bitte Satz eingeben: ");
            String satz2=br2.readLine();
            System.out.println("Ursprungssatz war: " + satz2);
            LW.write(satz2);
            LW.write("\r \n");
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

}
