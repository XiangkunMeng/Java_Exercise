package java_lib.InsertSortDemo;

/**
 * Created by mxk94 on 2017/4/8.
 */
public class InsertSortDemo {
    public static void main(String[] args) {
        int arr[] ={3,2,6,4,7,1,5,8,0,9};
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int tmp = i;
            while(tmp>0&&key>arr[tmp-1]){
                arr[tmp] = arr[tmp-1];
                tmp --;
            }
            arr[tmp] = key;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
