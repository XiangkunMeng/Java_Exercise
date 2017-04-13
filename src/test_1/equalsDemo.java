package test_1;

public class equalsDemo {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String s1 = "Hello";
		String s2 = "Hello";
//		String s3 = "Good-bye";
		String s4 = "HELLO";
		
		System.out.println(s1 + " equals " + s2 + "->" + s1.equals(s2));
		System.out.println(s1 + " equalsIgnoreCase" + s4 + "->" + s1.equalsIgnoreCase(s4));
	}

}
