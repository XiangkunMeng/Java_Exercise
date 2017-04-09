package java_lib.ArrayCopyDemo;

/**
 * Created by mxk94 on 2017/3/23.
 */
public class ArrayCopyDemo {
    public static void main(String[] args) {
        byte arr_a[] = {66,67,68,69,98,99};
        byte arr_b[] = new byte[7];
        System.arraycopy(arr_a,0,arr_b,0,3);
        System.out.println("a = "+ new String(arr_a));
        System.out.println("b = "+ new String(arr_b));
        System.out.println(System.getProperty("user.name"));
    }
}
