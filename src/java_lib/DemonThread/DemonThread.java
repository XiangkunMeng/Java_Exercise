package java_lib.DemonThread;

/**
 * Created by mxk94 on 2017/3/23.
 */
class NewThread extends Thread {
    boolean suspendFlag = false;

    NewThread(String threadname, ThreadGroup tgObj) {
        super(tgObj, threadname);
        System.out.println("New Thread:" + this);
        start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(currentThread().getName()+" : "+i);
            try {
                Thread.sleep(500);
                synchronized (this) {
                    while (suspendFlag) {
                        wait();
                    }
                }
            } catch (InterruptedException e) {
                System.out.println("IOException!");
            }
        }

    }

    void mysuspend() {
        suspendFlag = true;
    }

    void mynotify() {
        suspendFlag = false;
        notify();
    }
}

public class DemonThread {
    public static void main(String[] args) {
        ThreadGroup tg1 = new ThreadGroup("ThreadGrout_1");
        ThreadGroup tg2 = new ThreadGroup("ThreadGroup_2");
        NewThread t1 = new NewThread("myThread_1",tg1);
        NewThread t2 = new NewThread("mythread_2",tg2);
        System.out.println("Here is output ThreadGroup list: ");
        tg1.list();
        tg2.list();
        System.out.println("END");
        Thread tg_a[] = new Thread[tg1.activeCount()];
        Thread tg_b[] = new Thread[tg2.activeCount()];

        tg1.enumerate(tg_a);
        for (int i = 0; i < tg_a.length; i++) {
            ((NewThread)tg_a[i]).mysuspend();
        }
        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){
            System.out.println("INter!");
        }
        tg2.enumerate(tg_b);
        for (int i = 0; i < tg_b.length; i++) {
            ((NewThread)tg_b[i]).mysuspend();
        }
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            System.out.println("INter!");
        }

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Main Thread Exit!");
    }
}
