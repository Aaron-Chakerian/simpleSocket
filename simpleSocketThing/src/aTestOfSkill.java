import java.io.*;
import java.net.*;

public class aTestOfSkill {
    private DataOutputStream dout;
    private DataInputStream din;

    public aTestOfSkill(Socket s) throws IOException {
        dout = new DataOutputStream(s.getOutputStream());
        din = new DataInputStream(new BufferedInputStream(s.getInputStream()));
    }

    public void send(String str) throws IOException {
        dout.writeUTF(str);
        dout.flush();
    }

    public String receive() throws IOException {
        String str = "";
        str = din.readUTF();
        return str;

    }

    public void close() throws IOException {
        dout.close();
        din.close();
    }
}
