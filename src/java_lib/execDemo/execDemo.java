package java_lib.execDemo;

import java.io.IOException;

/**
 * Created by mxk94 on 2017/3/23.
 */
public class execDemo {
    public static void main(String[] args) {
        Runtime rt = Runtime.getRuntime();
        Process pc = null;
        try {
            pc = rt.exec("notepad");
            pc.waitFor();
        }catch (IOException e){
            System.out.println("Executing Notepad Bad!(IOException)");
        } catch (InterruptedException e) {
            System.out.println("Executing Notepad Bad!(InterruptedException)");
        }
        System.out.println("Notepad return : " + pc.exitValue());
        System.out.println(System.currentTimeMillis());
    }
}
