package test_1;

class Thread_1 implements Runnable{
		Thread t;
		Thread_1(){
		    t = new Thread(this,"Thread_1");
            t.start();
		}
	// This is the entry point for the second thread.
	public void run() {
		try {
			for (int i = 7; i > 0; i--) {
				System.out.println("Child Thread: " + i);
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			System.out.println("Child interrupted.");
		}
		System.out.println("Exiting child thread.");
	}
}

class ThreadDemo {
	public static void main(String args[]) {
		new Thread_1(); // create a new thread
		try {
			for (int i = 4; i > 0; i--) {
				System.out.println("Main Thread: " + i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println("Main thread interrupted.");
			System.out.println("Main thread exiting.");
		}
	}
}