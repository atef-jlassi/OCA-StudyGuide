package b.oca.chapter;

import java.util.Arrays;

public class ArraysManipulation {

	public static void main(String[] args) {
		
		int [] number1 = new int[3];
		
		for(int i=0; i<number1.length; i++) {
			System.out.println(number1[i]);
		}
		
		// int [] number2 = new int[] {42, 55, 99}; => CORRECT
		int [] number2 = {42, 55, 99};

		for(int i=0; i<number2.length; i++) {
			System.out.println(number2[i]);
		}
		
		
		
		System.out.println("### sort arrays: int ###");
		int[] numbers = {6, 9, 1};
		
		Arrays.sort(numbers);
		System.out.println(numbers); // print the hash
		for (int i = 0; i < numbers.length; i++) {
				System.out.print(numbers[i]+ ", ");
		}
		
		System.out.println("\n### sort arrays: string ###");
		String[] strings = {"10", "9", "100"};
		Arrays.sort(strings);
		for (int i = 0; i < strings.length; i++) {
			System.out.print(strings[i]+", ");
		}
		
		System.out.println("\n### searching in arrays: string ###");
		int[] numberSearch = {2, 4, 6, 8};
		System.out.println(Arrays.binarySearch(numberSearch, 2));
		System.out.println(Arrays.binarySearch(numberSearch, 4));
		System.out.println(Arrays.binarySearch(numberSearch, 1));
		System.out.println(Arrays.binarySearch(numberSearch, 3));
		System.out.println(Arrays.binarySearch(numberSearch, 9));
		
		System.out.println("\n### multidimentional arrays ###");
		
		int twoD[][] = {{1,4}, {3}, {9,8,7}};
		for(int[] inner: twoD) {
			for(int num: inner) {
				System.out.print(num +" ");
			}
			System.out.println("\n---");
		}

	}

}
