import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TCPServer {
    public static void main(String[] args) {
        try {
            final int PORT = 5000;
            ServerSocket ss = new ServerSocket(PORT);
            Socket connection = ss.accept();
            InputStream is = connection.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            System.out.println(Charset.defaultCharset() + ": " + br.readLine());
            System.out.println(StandardCharsets.ISO_8859_1 + ": " + br.readLine());
            System.out.println(StandardCharsets.UTF_16 + ": " + br.readLine());
            System.out.println(StandardCharsets.UTF_8 + ": " + br.readLine());
            System.out.println(StandardCharsets.US_ASCII + ": " + br.readLine());
            is.close();
            connection.close();
            ss.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
