package java_lib.SimpleUDP;

import java.io.IOException;
import java.net.*;

/**
 * Created by mxk94 on 2017/4/11.
 */
public class Server {
    public static void main(String[] args) {
        try {
            int pos = 0;
            byte buf[] = new byte[1024];
            DatagramSocket dgs = new DatagramSocket();
            while (true){
                int c = System.in.read();
                switch (c){
                    case -1:
                        System.out.println("Server Quit");
                        return;
                    case '\r':
                        break;
                    case '\n':
                        dgs.send(new DatagramPacket(buf,0,pos,InetAddress.getLocalHost(),521));
                        pos = 0;
                        break;
                    default:
                        buf[pos++] = (byte) c;
                }
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
