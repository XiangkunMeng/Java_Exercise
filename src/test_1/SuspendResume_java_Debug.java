package test_1;

//Suspending and resuming a thread for Java2
class NewThread_D6 implements Runnable {
	String name; // name of thread
	Thread t;
	boolean suspendFlag;

	NewThread_D6(String threadname) {
		name = threadname;
		t = new Thread(this, name);
		System.out.println("New thread: " + t);
		suspendFlag = false;
		t.start(); // Start the thread
	}

	// This is the entry point for thread.
	public void run() {
		try {
			for (int i = 15; i > 0; i--) {
				System.out.println(name + ": " + i);
				Thread.sleep(200);
				synchronized (this) {
					while (suspendFlag) 
						wait();
					
				}
			}
		} catch (InterruptedException e) {
			System.out.println(name + " interrupted.");
		}
		System.out.println(name + " exiting.");
	}

	void mysuspend() {
		suspendFlag = true;
	}

	synchronized void myresume() {
		suspendFlag = false;
		notify();
	}
}

class SuspendResume_java_Debug {
	public static void main(String args[]) {
		NewThread_D6 ob1 = new NewThread_D6("One");
		NewThread_D6 ob2 = new NewThread_D6("Two");
		try {
			Thread.sleep(1000);
			ob1.mysuspend();
			System.out.println("Suspending thread One");
			Thread.sleep(1000);
			ob1.myresume();
			System.out.println("Resuming thread One");
			ob2.mysuspend();
			System.out.println("Suspending thread Two");
			Thread.sleep(1000);
			ob2.myresume();
			System.out.println("Resuming thread Two");
		} catch (InterruptedException e) {
			System.out.println("Main thread Interrupted");
		}
		// wait for threads to finish
		try {
			System.out.println("Waiting for threads to finish.");
			ob1.t.join();
			ob2.t.join();
		} catch (InterruptedException e) {
			System.out.println("Main thread Interrupted");
		}
		System.out.println("Main thread exiting.");
	}
}