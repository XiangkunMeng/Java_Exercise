package java_lib.WhoIsDemo;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

/**
 * Created by mxk94 on 2017/4/9.
 */
public class WhoIsDemo {
    public static void main(String args[]) throws Exception {
        int c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Socket s = new Socket("whois.cnnic.cn", 43);
        InputStream in = s.getInputStream();
        OutputStream out = s.getOutputStream();
        InputStreamReader isr = new InputStreamReader(in,"UTF-8");
        String domain_name;
        if (args.length == 0){
            System.out.println("Please Enter Domain name:");
            domain_name=br.readLine() + "\n";
        }else
            domain_name = new String(args[0]+"\n");
        System.out.println("Start Query:" + domain_name);
        byte buf[] = domain_name.getBytes();
        out.write(buf);
        while ((c = isr.read()) != -1) {
            System.out.print((char) c);
        }
        System.out.println("\nQuery End");
        s.close();
    }
}
