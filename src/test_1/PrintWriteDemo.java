package test_1;

import java.io.PrintWriter;

public class PrintWriteDemo {

	public static void main(String[] args) {
		PrintWriter pw = new  PrintWriter (System.out,true);
		pw.println("this is a string");
		int i = -7;
		pw.println(i);
		double d = 4.5e-7;
		pw.println(d);
	}
}
