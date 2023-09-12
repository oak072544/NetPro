import java.net.*;
public class JavaIP{
    public static void main(String[] args) {
        try {
            if (args.length!= 1) {
                throw new ArrayIndexOutOfBoundsException();
            }
            InetAddress ad = InetAddress.getByName(args[0]);
            System.out.println("Host = " + ad.getHostName());
            System.out.println("IP = " + ad.getHostAddress());
        } 
        catch (UnknownHostException e) {
            // TODO: handle exception
            System.out.println("Error: unknown host or IP address");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            // TODO: handle exception
            System.out.println("Usage : java javaIP <hostname/IP>");
        }
        catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}