package test_1;

//This program uses a synchronized block.
class Callme_Debug {
	void call(String msg) {
		System.out.print("[" + msg);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("Interrupted");
		}
		System.out.println("]");
	}
}

class Caller_Debug implements Runnable {
	String msg;
	Callme_Debug target;
	Thread t;

	public Caller_Debug(Callme_Debug targ, String s) {
		target = targ;
		msg = s;
		t = new Thread(this);
		t.start();
	}

	// synchronize calls to call()
	public void run() {
		synchronized (target) { // synchronized block
			target.call(msg);
		}
	}
}

class Synch1 {
	public static void main(String args[]) {
		Callme_Debug target = new Callme_Debug();
		Caller_Debug ob1 = new Caller_Debug(target, "Hello");
		Caller_Debug ob2 = new Caller_Debug(target, "Synchronized");
		Caller_Debug ob3 = new Caller_Debug(target, "World");
		// wait for threads to end
		try {
			ob1.t.join();
			ob2.t.join();
			ob3.t.join();
		} catch (InterruptedException e) {
			System.out.println("Interrupted");
		}
	}
}