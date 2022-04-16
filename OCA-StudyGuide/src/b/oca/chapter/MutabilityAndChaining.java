package b.oca.chapter;

import java.util.*;
import java.util.Arrays;

public class MutabilityAndChaining {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("start");
		sb.append("+middle");
		StringBuilder same = sb.append("+end");
		
		System.out.println("sb= "+sb);
		System.out.println("same= "+ same);
		System.out.println(sb==same);
		System.out.println(sb.equals(same));

		System.out.println("### ###");
		
		String x = "Hello World";
		String y = " Hello World".trim();
		System.out.println(x.equals(y));
		System.out.println(x == y);
		
	}

}
