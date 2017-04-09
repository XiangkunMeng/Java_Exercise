package test_1;

class clicker implements Runnable {
	int click = 0;
	Thread t;
	private volatile boolean running = true;

	public clicker(int p) {
		t = new Thread(this);
		t.setPriority(p);
	}

	public void run() {
		while (running) {
			click++;
		}
	}

	public void stop() {
		running = false;
	}

	public void start() {
		t.start();
	}
}

class HiLoPri {
	public static void main(String args[]) {
		Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
		clicker hi = new clicker(Thread.NORM_PRIORITY + 2);
		clicker lo = new clicker(Thread.NORM_PRIORITY - 2);

		lo.start();
		hi.start();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			System.out.println("main Thread interrupted");
		}
		System.out.println("LOW-priority thread: " + lo.click);
		System.out.println("HIGH-priority thread: " + hi.click);
		System.out.println("hi is alive? : "+hi.t.isAlive());
		System.out.println("lo is alive? : "+lo.t.isAlive());
		hi.stop();
		lo.stop();
		System.out.println("hi is alive? : "+hi.t.isAlive());
		System.out.println("lo is alive? : "+lo.t.isAlive());
		try {
			hi.t.join();
			lo.t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("hi is alive? : "+hi.t.isAlive());
		System.out.println("lo is alive? : "+lo.t.isAlive());
	}

}