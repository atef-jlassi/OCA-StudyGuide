package b.oca.chapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListManipulation {

	public static void main(String...args) {
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(1);
		numbers.add(2);
		System.out.println("#########");
		System.out.println(numbers);
		System.out.println("#########");

		 numbers.remove(1);
		// numbers.remove(Integer.valueOf(1));
		System.out.println(numbers);
		System.out.println("#### Converting between array & list #####");
		
		List<String> list = new ArrayList<String>();
		list.add("hawk");
		list.add("robin");
		
		Object[] array = list.toArray();
		System.out.println(array.length);
		
		String[] stringArray = list.toArray(new String[0]);
//		System.out.println(array2);
		for (int i = 0; i < stringArray.length; i++) {
			System.out.println(stringArray[i]);
		}
		
		System.out.println("######");
		String[] array2 = {"hawk", "robin"};
		List<String> list2 = Arrays.asList(array2);
		System.out.println(list2);
		list2.set(1, "test");
		array2[0] = "new";
		
		System.out.println("### show array2 ####");
		for (String string : array2) {
			System.out.println(string + " ");
		}
		System.out.println("--- show list2 ---");
		
		for (String string : list2) {
			System.out.println(string);
		}
		
		// list2.remove(1); : Exception in thread "main" java.lang.UnsupportedOperationException
		
		System.out.println("--- show list3 ---");
//		List<String> list3 = Arrays.asList("one", "two");
		List<String> list3 = Arrays.asList("one", "two");
		
		for (String string : list3) {
			System.out.println(string);
		}
		
//		list3.add("three"); java.lang.UnsupportedOperationException
		
		List<Integer> numbers2= new ArrayList<Integer>();
		numbers2.add(99);
		numbers2.add(5);
		numbers2.add(81);
		
		Collections.sort(numbers2);
		System.out.println(numbers2);
		
		System.out.println("#########");
		int numFish = 4;
		String fishType = "tuna";
//		String anotherFish = numFish + 1;
		
	}
}
