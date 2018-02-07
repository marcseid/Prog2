import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class
WebImageToDisk {
    public static void main(String[] args) throws IOException {
        InputStream is = null;
        FileOutputStream fos = null;
        HttpURLConnection connection = null;
        try {
            URL url = new URL("http://static1.squarespace.com/static/518f5d62e4b075248d6a3f90/t/519bef92e4b02745db13b165/1369173914913/eol.jpg");
            connection = (HttpURLConnection) url.openConnection();
            is = connection.getInputStream();
            byte[] b = new byte[4096];
            fos = new FileOutputStream("c://temp//pic.jpg");
            int n = 0;
            while (n != -1) {
                n = is.read(b);
                if (n != -1) fos.write(b, 0, n);
                // System.out.println(n); //Wie viele bytes werden im Stream auf ein Mal gespeichert
            }
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                }
            }
            if (is != null) {
                try {
                    is.close();
                } catch (IOException e) {
                }
            }
            if (connection != null)
                connection.disconnect();
        }
    }
}