import java.net.*;
import java.io.*;

public class Server {
    public static void main(String[] args) {
        ServerSocket servSocket = null;
        try {
            servSocket = new ServerSocket(10000);
        } catch (Exception e) { e.printStackTrace(); }

        while(true) {
            try {
                Socket s = servSocket.accept();
                
                BufferedReader br = new BufferedReader(
                                    new InputStreamReader(
                                    s.getInputStream()));
                PrintWriter pw = new PrintWriter(s.getOutputStream());
                String msg = br.readLine();

                pw.println("Welcome");
                pw.flush();
                br.close();
                pw.close();
                s.close();
            } catch (Exception e) {}
        }
    }
}
