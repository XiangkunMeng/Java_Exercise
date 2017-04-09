package java_lib.FileDemo;

import java.io.File;
import java.io.FilenameFilter;

/**
 * Created by mxk94 on 2017/4/7.
 */
class myfilter implements FilenameFilter{
    String key;
    public myfilter(String key){
        this.key = key;
    }

    @Override
    public boolean accept(File f,String name) {
       return  name.endsWith(key);
    }

}
public class FileDemo {
    public static void main(String[] args) {
        String filename = ".";
        File f = new File(filename);
        String[] list = f.list(new myfilter(".txt"));
        for (int i = 0; i < list.length; i++) {
            File f1 = new File(f,list[i]);
            if (f1.exists()) {
                if (f1.isFile())
                    System.out.println(list[i] + " is File");
                else if (f1.isDirectory())
                    System.out.println(list[i] + " is Dir");
                else
                    System.out.println(list[i] + " not file and not dir!");
            }else
                System.out.println(list[i] + " Do Not Exist");
        }
    }
}
