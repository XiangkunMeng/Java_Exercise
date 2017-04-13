package test_1;

/**
 * Created by mxk94 on 2017/3/18.
 */
public class Thread_1_1 {
    public static void main (String args[]){
        Thread t = Thread.currentThread();
        System.out.println("current name: "+ t);
        t.setName("My Thread");
        String tName=t.getName();
        System.out.println("Current name :"+ t+"  , "+ tName);
        try {
            for( int i = 0; i< 4;i++){
                System.out.println(i+" ");
                t.sleep(300);
            }
        }catch (InterruptedException e){
            System.out.println("Main Thread interrupted");
        }
    }
}
