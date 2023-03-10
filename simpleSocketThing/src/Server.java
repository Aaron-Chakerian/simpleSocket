import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) throws IOException{

            ServerSocket ss = new ServerSocket(50000) ;
            Socket s = ss.accept();// establishes connection
            aTestOfSkill server = new aTestOfSkill(s);
            
            
            System.out.println(server.receive());
            server.send("Hello there");
            server.receive();
            ss.close();
            s.close();

    }
}
