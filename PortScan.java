import java.io.*;
import java.net.*;

public class PortScan {
    public static void main(String[] args) {
        if (args.length!=1){
            System.out.println("Usage: java PortScan <hostname/IP>");
        }
        for(int i = 70; i <=100; i++) {
            try {
            
                Socket socket = new Socket(args[0], i);
                socket.close();
                System.out.println( "Port = " + i +" Open");
            
            //Socket socket = new Socket(args[0], 80);
            } 
            catch (Exception e) {
            }
        }
    }
}
