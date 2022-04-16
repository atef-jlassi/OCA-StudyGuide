package a.oca.chapter;

public class Finalizer {

	public static void main(String[] args) {
		String one, two;
		one = new String("one");
		two = new String("two");
		
		one = two;
		String three;
		Finalizer f = new Finalizer();

		three = one;
		one = null;
		
	}

	protected void finalize() {
		System.out.println("Calling finalize");
	}
}
