package test_1;

import java.io.*;

public class ShowFile {

    public static void main(String[] args) {
        FileInputStream fin;
        try {
            fin = new FileInputStream(args[0]);

            int c;
            //int i = 20;
            try {
                do {
                    System.out.print((char) (c = fin.read()) + "\t");
                } while (c != -1);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            System.out.println("File \"" + args[0] + "\" Not Find");
        }
    }
}
