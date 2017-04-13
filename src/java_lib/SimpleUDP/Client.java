package java_lib.SimpleUDP;

import java.io.IOException;
import java.net.*;

/**
 * Created by mxk94 on 2017/4/11.
 */
public class Client {
    public static void main(String[] args) {
        try {
            byte buf[] = new byte[1024];
            DatagramSocket dgs = new DatagramSocket(521, InetAddress.getLocalHost());
            DatagramPacket dgp = new DatagramPacket(buf,buf.length);
            while(true) {
                dgs.receive(dgp);
                System.out.println(new String(dgp.getData(),0,dgp.getLength()));
            }

        } catch (SocketException e) {
            e.printStackTrace();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
