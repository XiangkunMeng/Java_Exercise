package java_lib.RandomDemo;

import java.util.Random;

/**
 * Created by mxk94 on 2017/4/6.
 */
public class RandomDemo {
    public static void main(String[] args) {
        Random rand = new Random();
        int bell[] = new int[10];
        double val = 0;
        double sum = 0;

        for (int i = 0; i < 100; i++) {
            val = rand.nextGaussian();
            sum += val;
            double t = -2;
            for (int j = 0; j < 10; j++, t += 0.5) {
                if(val <t){
                    bell[j]++;
                    break;
                }
            }
            System.out.println("Average of value"+sum/100);
            for (int j = 0; j < 10; j++) {
                for(int x = bell[j];x>0;x--)
                    System.out.print("*");
                System.out.println();
            }
        }
    }
}
