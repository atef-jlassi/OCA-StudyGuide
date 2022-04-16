package b.oca.chapter;

public class StringBuilderMethods {

	public static void main(String[] args) {

		System.out.println("###### StringBuilder Methods #######");
		
		StringBuilder sb = new StringBuilder("animals");
		
		String sub = sb.substring(sb.indexOf("a"), sb.indexOf("al"));
		int len = sb.length();
		char ch = sb.charAt(6);
		
		System.out.println(sub + " " + len + " " + ch );
		
		System.out.println("### append() ###");
		StringBuilder stringbuilder = new StringBuilder().append(1).append('c');
		stringbuilder.append("-").append(true);
		
		System.out.println(stringbuilder);
		
		System.out.println("### insert() ###");
		
		StringBuilder sbinsert = new StringBuilder("animals");
		
		sbinsert.insert(6, "-");
		sbinsert.insert(0, "-");
		sbinsert.insert(4, "-");
		
		System.out.println(sbinsert);
		
		System.out.println("### delete() - deleteCharAt() ###");
		
		StringBuilder sbdelete = new StringBuilder("abcdef");
		sbdelete.delete(1, 3);
		System.out.println(sbdelete);
		
		System.out.println("### reverse() ###");
		
		StringBuilder reverse = new StringBuilder("ABC");
		StringBuilder clonereverse = reverse.reverse();
		System.out.println(reverse);
		System.out.println(clonereverse == reverse);
		
		// convert StringBuilder to String
		String string = reverse.toString();
		
		System.out.println("### equality() ###");
		String x = "Hello World";
		String z = " Hello World".trim();
		
		System.out.println(x==z);

		
	}

}
