import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(50000);
            Socket s = ss.accept();// establishes connection
            DataInputStream din = new DataInputStream(s.getInputStream());
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            
            String str = (String) din.readUTF();
            System.out.println("message= " + str);
            
            dout.writeUTF("Gday");

            str = (String) din.readUTF();
            System.out.println("message= " + str);
            
            dout.writeUTF("BYEEEE");

            
            ss.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
