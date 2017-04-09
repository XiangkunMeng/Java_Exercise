package test_1;

class NewThread_4 implements Runnable{
	String name;
	Thread t;
	NewThread_4(String ThreadName){
		name = ThreadName;
		t = new Thread(this,name);
		System.out.println("New Thread :"+t);
		t.start();
	}
	public void run() {
		for(int i=5;i>0;i--)
		{
			System.out.println(name+":"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
		System.out.println(name+":"+"exiting");
	}
}

public class DemoJoin {
	public static void main(String args[]) {
	NewThread_4 ob1 = new NewThread_4("Thread one");
	NewThread_4 ob2 = new NewThread_4("Thread two");
	NewThread_4 ob3 = new NewThread_4("Thread three");
	NewThread_4 ob4 = new NewThread_4("Thread four");
	System.out.println(ob1.t.isAlive());
	System.out.println(ob2.t.isAlive());
	System.out.println(ob3.t.isAlive());
	System.out.println(ob4.t.isAlive());
	try {
		System.out.println("wait for Thread exit");
		ob1.t.join();
		ob2.t.join();
		ob3.t.join();
		ob4.t.join();
	}
	catch(InterruptedException e){
		System.out.println("main Thread is interrupted");
	}
	System.out.println(ob1.t.isAlive());
	System.out.println(ob2.t.isAlive());
	System.out.println(ob3.t.isAlive());
	System.out.println(ob4.t.isAlive());
	System.out.println("main Thread is exiting");
	
	}
}
