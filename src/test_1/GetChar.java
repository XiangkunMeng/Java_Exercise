package test_1;

//1.char charAt(int where)
//2.void getChars(int sourceStart, int sourceEnd, char target[ ], int
// 	targetStart)
/*这里sourceStart指定了子字符串开始的下标， sourceEnd指定了子字符串结束的下一个
字符的下标。因此子字符串包含了从sourceStart到sourceEnd–1的字符。获得字符的数组由
target所指定。将被复制子字符串于其中的target的下标由targetStart指定。注意必须确保的
是数组target应该足够大以保证能容纳被指定子字符串中的字符。*/

public class GetChar {
	public static void main(String args[]) {
		String s = "This is a demo of the getChars method";
		int start = 10;
		int end = 14;
		char buf[] = new char[end - start];
		
		s.getChars(start, end, buf, 0);
		System.out.println(buf);
	}
}
