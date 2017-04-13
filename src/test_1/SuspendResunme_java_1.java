package test_1;

//Using suspend() and resume
class NewThread_5 implements Runnable {
	String name;
	Thread t;

	public NewThread_5(String treadName) {
		// TODO 自动生成的构造函数存根
		name = treadName;
		t = new Thread(this, name);
		System.out.println(t);
		t.start();
	}

	public void run() {
		try {
			for (int i = 15; i > 0; i--) {
				System.out.println(name + ":" + i);
				Thread.sleep(200);
			}
		} catch (InterruptedException e) {
			System.out.println("Thread" + name + "interrupted");
		}
	}
}

public class SuspendResunme_java_1 {
	public static void main(String args[]) {
		NewThread_5 ob1 = new NewThread_5("one");
		NewThread_5 ob2 = new NewThread_5("two");

		try {
			Thread.sleep(1000);
			ob1.t.suspend();
			System.out.println("Suspend thread one");
			Thread.sleep(1000);
			ob1.t.resume();
			System.out.println("resume thread one");
			ob2.t.suspend();
			System.out.println("Suspend thread two");
			Thread.sleep(1000);
			ob2.t.resume();
			System.out.println("resume thread two");
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO: handle exception
			System.out.println("main thread interrupted");
		}
		try {
			ob1.t.join();
			ob2.t.join();
		} catch (InterruptedException e) {
			// TODO: handle exception
			System.out.println("thread interrupted");
		}
		System.out.println("main thread exiting");
	}
}
/*
 * Thread类同样定义了stop() 来终止线程。它的形式如下： void stop( ) 一旦线程被终止，它不能被resume() 恢复继续运行。
 * 
 * Thread定义的suspend()， resume()和stop()方法看起来是管理线程的完美的和方便的方
 * 法，它们不能用于新Java版本的程序。下面是其中的原因。 Thread类的suspend()方法在Java
 * 2中不被赞成，因为suspend()有时会造成严重的系统故障。假定对关键的数据结构的一个线
 * 程被锁定的情况，如果该线程在那里挂起，这些锁定的线程并没有放弃对资源的控制。其 他的等待这些资源的线程可能死锁。
 * Resume()方法同样不被赞同。它不引起问题，但不能离开suspend()方法而独立使用。 Thread类的stop()方法同样在Java
 * 2中受到反对。这是因为该方法可能导致严重的系统 故障。设想一个线程正在写一个精密的重要的数据结构且仅完成一个零头。如果该线程在
 * 此刻终止，则数据结构可能会停留在崩溃状态
 */
