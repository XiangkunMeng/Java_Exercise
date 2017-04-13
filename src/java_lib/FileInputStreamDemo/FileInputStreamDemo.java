package java_lib.FileInputStreamDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by mxk94 on 2017/4/7.
 */
public class FileInputStreamDemo {
    public static void main(String[] args) throws Exception {
        File targ_file = new File("G:\\EclipseJavaWorkspace\\helloworld\\src\\java_lib\\FileInputStreamDemo\\FileInputStreamDemo.java");
        if (targ_file.isDirectory()) {
            String filelist[] = targ_file.list();
            for (int i = 0; i < filelist.length; i++) {
                System.out.println(filelist[i]);
            }
        } else if (targ_file.isFile()) {
            InputStream f = new FileInputStream(targ_file);
            int size;
            System.out.println("Total Avaliable Byte : " + (size = f.available()));
            int n = size / 4;
            System.out.println("First " + n + "Byte Ready to read...");
            for (int i = 0; i < n; i++) {
                System.out.print((char) f.read());
            }
            System.out.println();
            System.out.println("Total Avaliable Byte : " + (size = f.available()));
            n = size / 4;
            byte buf[] = new byte[n];
            if (f.read(buf, 0, n) == n) {
                System.out.println(new String(buf, 0, n));
            } else
                System.out.println("Can't Read Enough Byte");
            f.close();
        } else
            System.out.println("未知错误");

    }
}
