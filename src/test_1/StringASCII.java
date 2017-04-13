package test_1;

//String(byte asciiChars[ ])
//String(byte asciiChars[ ], int startIndex, int numChars)

public class StringASCII {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		byte ascii[] = {65,66,67,68,69,70};
		
		String s1 = new String(ascii);
		System.out.println(s1);
		
		String s2 = new String(ascii,2,3);
		System.out.println(s2);
	}

}
