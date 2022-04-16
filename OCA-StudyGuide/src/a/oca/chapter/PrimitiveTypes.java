package a.oca.chapter;

public class PrimitiveTypes {
	
	boolean trueOrFalse;
	byte byteData; // [-128, 127]
	short shortData; // [-32768, -32767] 
	int intData ; // [-2147483648, 2147483647]
	long longData = 2147483647; // [-9223372036854775808, 9223372036854775807]
	float flaotData;
	double doubleData;
	char charData;
	
	String A$B;
	String _helloWorld;
	String Public;
	public static void main(String[] args) {

//		System.out.println(56);
//		System.out.println(0b11);
//		System.out.println(017);
//		System.out.println(0x1F);

		findAswer(false);
	}
	
	public int notValid() {
		int y = 3;
		int x = 10;
		int reply = x + y; 
		return reply;
	}

	public static void findAswer(boolean check) {
		int answer;
		int onlyOneBranch;
		
		if(check) {
			onlyOneBranch = 1;
			answer = 1;
		} else {
			answer = 2;
		}
		System.out.println(answer);
		// System.out.println(onlyOneBranch);
	}
}
