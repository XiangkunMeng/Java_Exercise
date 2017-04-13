package java_lib.StringTokenizerDemo;

import java.util.StringTokenizer;

/**
 * Created by mxk94 on 2017/4/6.
 */
public class StringTokenizerDemo {
    public static void main(String[] args) {
        String in = "孟祥坤:18835934360;";
        StringTokenizer strt = new StringTokenizer(in,":;");
        while(strt.hasMoreTokens()){
            String key = strt.nextToken();
            String val = strt.nextToken();
            System.out.println(key+"'s Number is "+val);
        }
    }
}
