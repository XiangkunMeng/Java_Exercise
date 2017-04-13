package test_1;

/**
 * Created by mxk94 on 2017/3/18.
 */
public class ArrayCopyDemo {
    public static void main(String args[]) {
        int[] a = {1, 2, 3};
        int[] b = new int[6];
        for (int i = 0; i < 3; i++) b[i] = a[i];
        a = b;
        a[3] = 4;
        a[4] = 5;
        a[5] = 6;
        for (int i = 0; i < 6; i++) System.out.println(a[i]+ " ");
    }
}
