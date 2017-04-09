package java_lib.ArraysDemo;

import java.util.Arrays;

/**
 * Created by mxk94 on 2017/3/30.
 */
public class ArraysDemo {
    public static void main(String[] args) {
        int[] arr_int = new int[10];
        Arrays.fill(arr_int, 8);
        for (int i = 0; i < arr_int.length; i++) {
            System.out.print(arr_int[i] + "\t");
        }
        System.out.println();
        System.out.println("8 at " + Arrays.binarySearch(arr_int, 8));
        Arrays.fill(arr_int, 2, 4, 3);
        for (int i = 0; i < arr_int.length; i++) {
            System.out.print(arr_int[i] + "\t");
        }
        System.out.println();
        Arrays.sort(arr_int);
        arr_int[4] = 5;
        for (int i = 0; i < arr_int.length; i++) {
            System.out.print(arr_int[i] + "\t");
        }
        System.out.println("8 at " + Arrays.binarySearch(arr_int, 8));
        System.out.println("3 at " + Arrays.binarySearch(arr_int, 3));
        for (int i = 0; i < arr_int.length; i++) {
            System.out.print(arr_int[i] + "\t");
        }


        System.out.println();
        int a[]=new int []{1,2,3,4,5,6,7,21,123};
        Arrays.sort(a);
        for(int i = 0;i<a.length;i++){
            System.out.print(a[i]+"\t");
        }
        System.out.println(Arrays.binarySearch(a,1,5,8));

        int b[] = new int[] {1, 3, 4, 6, 8, 9};
        int x1 = Arrays.binarySearch(b, 5);
        int x2 = Arrays.binarySearch(b, 4);
        int x3 = Arrays.binarySearch(b, 0);
        int x4 = Arrays.binarySearch(b, 10);
        System.out.println("x1:" + x1 + ", x2:" + x2);
        System.out.println("x3:" + x3 + ", x4:" + x4);

//        ⑴.binarySearch(object[ ], object key);
//        1.不存在时由1开始计数；
//        2.存在时由0开始计数。

//        (2)binarySearch(object[ ], int fromIndex, int endIndex, object key);
//        如果要搜索的元素key在指定的范围内，则返回搜索键的索引；否则返回-1或者"-"(插入点)。
//        eg：
//        1.该搜索键在范围内，但不在数组中，由1开始计数；
//        2.该搜索键在范围内，且在数组中，由0开始计数；
//        3.该搜索键不在范围内，且小于范围内元素，由1开始计数；
//        4.该搜索键不在范围内，且大于范围内元素，返回-(endIndex + 1);（特列）
    }
}
