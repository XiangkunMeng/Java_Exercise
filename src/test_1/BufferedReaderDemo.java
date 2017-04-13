package test_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by mxk94 on 2017/3/20.
 */
public class BufferedReaderDemo {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char c = (char)-1;
        System.out.println(c);
        do {
            try {
                c = (char)br.read();
            }
            catch (IOException e){
                e.printStackTrace();
            }
            System.out.println(c);
        }while(c != 'q');
    }
}
