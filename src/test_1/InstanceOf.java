package test_1;

class A{
	int i,j;
}

class B{
	int i,j;
}

class C extends A{
	int k;
}

class D extends B{
	int k;
}

public class InstanceOf {
	/**
	 * 
	 */
	public static void main(String args[]) {
		A a = new A();
		B b = new B();
		C c = new C();
		D d = new D();
		
		if (a instanceof A)
			System.out.println("a is instanceof A");
		if (b instanceof B)
			System.out.println("b is instanceof B");
		if (c instanceof C)
			System.out.println("c is instanceof C");
		if (d instanceof D)
			System.out.println("d is instanceos D");
		if (c instanceof A)
			System.out.println("c can be cast to A");
		if (d instanceof B)
			System.out.println("d can be cast to B");
		
		
	}
}
