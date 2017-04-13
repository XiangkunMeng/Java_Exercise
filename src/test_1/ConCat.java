package test_1;

public class ConCat {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String longStr = "This could have been " +
		"a very long line that would hava" +
		"wrapped arround.but string concatenation " +
		"prevents this.";
		
		String age = "9";
		String s = "he is " + age + " year old";
		
		System.out.println(s);
		System.out.println(longStr);
	}

}
