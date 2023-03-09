import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) {
        
        
        try {
            
            Socket s = new Socket("localhost", 50000);
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            DataInputStream din = new DataInputStream(s.getInputStream());

            dout.writeUTF("Hello");

            String str = (String) din.readUTF();
            System.out.println("message= " + str);

            dout.writeUTF("BYE");
            
            str = (String) din.readUTF();
            System.out.println("message= " + str);


            dout.flush();
            dout.close();
            s.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}