package java_lib.TimerTaskDemo;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by mxk94 on 2017/4/6.
 */

class myTimerTask extends TimerTask{

    @Override
    public void run() {
        System.out.println("TimerTaske run");
    }
}

public class TimerTaskDemo {
    public static void main(String[] args) {
        myTimerTask mtt = new myTimerTask();
        Timer mt = new Timer();
        mt.schedule(mtt,1000,500);
        try{
            Thread.sleep(5000);
        }catch (InterruptedException e){
            System.out.println("Catch interruptedExp");
        }
        mt.cancel();
    }
}
