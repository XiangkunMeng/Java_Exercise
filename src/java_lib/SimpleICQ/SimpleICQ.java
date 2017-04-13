package java_lib.SimpleICQ;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by mxk94 on 2017/4/10.
 */
public class SimpleICQ {
    static void client(){
        try {
            System.out.println("Client");
            Socket soc = new Socket(InetAddress.getLocalHost(),521);
            InputStream ins = soc.getInputStream();
            InputStreamReader isr = new InputStreamReader(ins,"UTF-8");
//            OutputStream ops = soc.getOutputStream();
//            ops.write("Client send hello!".getBytes());
            // byte buf[] = new byte[1024];
            int c;
            while ((c=isr.read())!=-1){
                System.out.print((char)c);
            }
            soc.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    static void server() {
        try {
            System.out.println("Server");
            ServerSocket ssoc = new ServerSocket(521);
            Socket soc = ssoc.accept();
            InputStream ips = soc.getInputStream();
//            byte tmp[] = null;
//            ips.read(tmp);
//            System.out.println(tmp);
            OutputStream ops = soc.getOutputStream();
            OutputStreamWriter opsw = new OutputStreamWriter(ops, "UTF-8");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String str = " ";
            ops.write("Start...".getBytes());
            while (!str.equals("quit")) {
                str = br.readLine();
                opsw.write(str, 0, str.length());
                opsw.flush();
            }
            ops.close();
            soc.close();
            ssoc.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        if(args.length == 1){
            client();
        }else
            server();
    }
}
