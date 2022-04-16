package a.oca.chapter;

import java.util.Date;

public class Variables {
	static boolean b;
	static byte number;
	static int numberInt;
	static float numberFloat;
	static double numberDouble;
	static char charNumber;
	static String chaine;

	Date date;

	public static void main(String[] args) {
		System.out.println(b);
		System.out.println(number);
		System.out.println(numberInt);
		System.out.println(numberFloat);
		System.out.println(numberDouble);
		System.out.println(charNumber);
		System.out.println(chaine);
//		eatIfHungry(true);

//		List<String> liste = new ArrayList<String>();
//		while (true) {
//
//			liste.add("test");
//		}

	}

	public static void eatIfHungry(boolean hungry) {
		if (hungry) {
			int bitesOfCheese = 1;
			{
				boolean teenyBit = true;
				System.out.println(bitesOfCheese);
			}
		}

		/*
		 * Does not compile
		 * 
		 * System.out.println(teenyBit); System.out.println(bitesOfCheese);
		 */
	}

	public static void variables() {
		boolean b;
		byte number;
		int numberInt;
		float numberFloat;
		double numberDouble;
		char charNumber;
		String chaine;

		/*
		 * Compile Error: Local variables should be initialized.
		 * 
		 * System.out.println(b); System.out.println(number);
		 * System.out.println(chaine);
		 */
	}
}
