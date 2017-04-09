package test_1;

class Callme_2{
	String msg;
	void call(String msg) {
		System.out.print("["+msg);
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException e) {
			System.out.println("interrupted");
		}
		System.out.println("]");
	}
}

class Caller_2 implements Runnable{
	String msg;
	Callme_2 target;
	Thread t;
	
	public Caller_2(Callme_2 targ,String s) {
		target = targ;
		msg = s;
		t = new Thread(this);
		t.start();
	}
	
	public void run() {
		synchronized(target) {
			target.call(msg);
		}
	}
}

public class Synch_2 {
	public static void main(String args[]) {
		Callme_2 target = new Callme_2();
		Caller_2 ob1 = new Caller_2(target, "hello_2");
		Caller_2 ob3 = new Caller_2(target,"world_2");
		Caller_2 ob2 = new Caller_2(target,"synchronized_2");
		try {
			ob1.t.join();
			ob2.t.join();
			ob3.t.join();
		}
		catch(InterruptedException e) {
			System.out.println("interrupted");
		}
	}
}
