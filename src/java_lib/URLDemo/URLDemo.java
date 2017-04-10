package java_lib.URLDemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

/**
 * Created by mxk94 on 2017/4/10.
 */
public class URLDemo {
    public static void main(String[] args) {
        try {
//            URL xkenmon = new URL("http","xkenmon.cn","/index.html");
            String url_str;
            URL url = null;
            if(args.length == 0){
                System.out.println("Please Enter URL:");
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                url_str = br.readLine();
            }else {
                url_str = new String(args[0]);
            }
            url = new URL(url_str);
            int c;
            URLConnection urlc = url.openConnection();
            System.out.println("Date: " + new Date(urlc.getDate()));
            System.out.println("Content type: " + urlc.getContentType());
            System.out.println("Expirse: " + urlc.getExpiration());
            System.out.println("Last-Modified: " + new Date(urlc.getLastModified()));
            int len = urlc.getContentLength();
            if(len != 0){
                System.out.println("\n------------Content--------------\n");
                InputStreamReader isr = new InputStreamReader(urlc.getInputStream(),"UTF-8");
                while((c=isr.read())!=-1){
                    System.out.print((char)c);
                }
                System.out.println("\n\n----------Content End------------\n");
                isr.close();
            }
            else
                System.out.println("No Content!");
        } catch (MalformedURLException e) {
            System.out.println("ERR : URL Forme ERR!");
            e.printStackTrace();
            System.exit(0);
        } catch (IOException e) {
            System.out.println("ERR : Connect URL ERR!");
            e.printStackTrace();
            System.exit(0);
        }
    }
}
