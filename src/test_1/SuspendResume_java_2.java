package test_1;

/*
 * · wait( ) 告知被调用的线程放弃管程进入睡眠直到其他线程进入相同管程并且调用
 *   notify( )。
 * · notify( ) 恢复相同对象中第一个调用 wait( ) 的线程。
 * · notifyAll( ) 恢复相同对象中所有调用 wait( ) 的线程。具有最高优先级的线程最先
 *    运行。
 */

//Suspending and resuming in java2
class NewThread_6 implements Runnable {
	String name;
	Thread t;
	boolean suspendFlag;

	NewThread_6(String threadName) {
		name = threadName;
		t = new Thread(this, name);
		System.out.println("New thread:" + t);
		suspendFlag = false;
		t.start();
	}

	public void run() {
		try {
			for (int i = 15; i > 0; i--) {
				System.out.println(name + ":" + i);
				Thread.sleep(200);
				synchronized (this) {
					while (suspendFlag)
						wait();
				}
			}
		} catch (InterruptedException e) {
			// TODO: handle exception
			System.out.println(name + "interrupted");
		}
		System.out.println(name + ":exiting");
	}

	void mysuspend() {
		suspendFlag = true;
	}

	// 下面这个方法必须加synchronized:
	synchronized void myresume() {
		suspendFlag = false;
		notify();
	}
}

public class SuspendResume_java_2 {
	public static void main(String args[]) {
		NewThread_6 ob1 = new NewThread_6("one");
		NewThread_6 ob2 = new NewThread_6("two");

		try {
			Thread.sleep(1000);
			ob1.mysuspend();
			System.out.println("suspending thread one");
			Thread.sleep(1000);
			ob1.myresume();
			System.out.println("resume thread one ");
			ob2.mysuspend();
			System.out.println("suspending thread two");
			Thread.sleep(1000);
			ob2.myresume();
			System.out.println("resumeing thread two");
		} catch (InterruptedException e) {
			// TODO: handle exception
			System.out.println("thread interrupted");
		}
		try {
			System.out.println("wait for threads to finish.");
			ob1.t.join();
			ob2.t.join();
		} catch (InterruptedException e) {
			// TODO: handle exception
			System.out.println("Main thread interrupted");
		}
		System.out.println("main thread exiting..");
	}
}
