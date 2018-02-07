import java.io.FileOutputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class UTF8 {
    public static void main(String[] args){
        try
        {
            final String file = "filename.txt";
            OutputStream os = new FileOutputStream(file);
            os.write("Suppe mit dem Löffel löffeln\n".getBytes());
            os.write("Suppe mit dem Löffel löffeln\n".getBytes(StandardCharsets.ISO_8859_1));
            os.write("Suppe mit dem Löffel löffeln\n".getBytes(StandardCharsets.UTF_16));
            os.write("Suppe mit dem Löffel löffeln\n".getBytes(StandardCharsets.UTF_8));
            os.write("Suppe mit dem Löffel löffeln\n".getBytes(StandardCharsets.US_ASCII));
            os.flush();
            os.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
