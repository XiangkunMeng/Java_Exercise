package java_lib;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by mxk94 on 2017/3/22.
 */
public class Number_class {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String str_num;
        Number num = null;
        try {
            num = Integer.parseInt(br.readLine());
            System.out.println(num);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(" yichang ");
        }
        Number num_bt = num.byteValue();
        Number num_int = num.intValue();
        Number num_f = num.floatValue();
        System.out.println("num: " + num + "\nnum_bt: " + num_bt + "\nnum_int: " + num_int);
        System.out.println("num_f: " + num_f);
        float sum_f = num_f.floatValue() + num_int.intValue();
        System.out.println("sum_f：" + sum_f);
    }
}
