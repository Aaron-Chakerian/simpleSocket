import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) throws IOException {
        aTestOfSkill client = new aTestOfSkill(new Socket("localhost", 50000));

        client.receive();
        client.send("Hello");
        
        client.close();

    }
}