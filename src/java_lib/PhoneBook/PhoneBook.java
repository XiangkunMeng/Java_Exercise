package java_lib.PhoneBook;

import java.io.*;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

/**
 * Created by mxk94 on 2017/4/5.
 */
public class PhoneBook {
    public static void main(String[] args) {

        FileOutputStream fos = null;
        FileInputStream fin = null;
        boolean changed = false;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Properties pb = new Properties();
        String name = null, num = null;
        String flag = "-1";
        try {
            fin = new FileInputStream("PhoneBook.dat");
        } catch (FileNotFoundException e) {
            //ignore miss file
        }
        try {
            if (fin != null) {
                pb.load(fin);
                fin.close();
            }
        } catch (IOException e) {
            System.out.println("ERR READING FILE");
        }
        while (!flag.equals(name)) {
            try {
                System.out.println("Enter name:");
                name = br.readLine();
                if (name.equals(flag)) break;
                System.out.println("Enter Phone-number:");
                num = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            pb.setProperty(name, num);
            changed = true;
        }
        if (changed)
            try {
                fos = new FileOutputStream("PhoneBook.dat");
                pb.store(fos, "Telephone Book");
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        do {
            System.out.println("Enter name to find phone-number:");
            try {
                name = br.readLine();
            } catch (IOException e) {
                System.out.println("read name ERR!");
            }
            if (name.equals(flag)) break;
            if(name.equals("listall")){
                Set set = pb.keySet();
                Iterator itr = set.iterator();
                while(itr.hasNext()){
                    name = (String)itr.next();
                    num = pb.getProperty(name);
                    System.out.println(name+"\t:\t"+num);
                }
                continue;
            }
            num = pb.getProperty(name);
            System.out.println("Phone-Number:" + num);
        } while (!name.equals(flag));
    }
}

