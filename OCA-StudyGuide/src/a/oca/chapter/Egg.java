package a.oca.chapter;

public class Egg {

	public Egg() { // the constructor runs after all fields and instance initializer blocks have run.
		number = 5;
	}
	public static void main(String[] args) {
		Egg egg = new Egg();
		System.out.println(egg.number);
	}

	private int number = 3;
	{number = 4;}
	{System.out.println(number);}
}
