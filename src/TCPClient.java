import java.io.FileOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class TCPClient {

    public static void main(String[] args){
        try
        {
            final int PORT = 5000;
            final String HOST = "localhost";
            Socket connectionToServer = new Socket(HOST, PORT);
            OutputStream os = connectionToServer.getOutputStream();
            os.write("Suppe mit dem Löffel löffeln\n".getBytes());
            os.write("Suppe mit dem Löffel löffeln\n".getBytes(StandardCharsets.ISO_8859_1));
            os.write("Suppe mit dem Löffel löffeln\n".getBytes(StandardCharsets.UTF_16));
            os.write("Suppe mit dem Löffel löffeln\n".getBytes(StandardCharsets.UTF_8));
            os.write("Suppe mit dem Löffel löffeln\n".getBytes(StandardCharsets.US_ASCII));
            os.flush();
            os.close();
            connectionToServer.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
