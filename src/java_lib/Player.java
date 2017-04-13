package java_lib;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class Player {

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new FileOutputStream("playertext.txt"),true);
        String line = null;
        while ((line = br.readLine()) != null) {
            if (line.equals("-1"))
                break;
            pw.print(line.toUpperCase());
        }
        pw.close();
    }

}