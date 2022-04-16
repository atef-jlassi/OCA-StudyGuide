package a.oca.chapter;

//import java.sql.*;
import java.util.Date;
import java.util.Random;

public class Main {

	public static void main(String... args) {
		// TODO Auto-generated method stub

		//		commentImportsArgs(args);
		
		
	}

	private static void commentImportsArgs(String... args) {
		//		this comment doesn't compile	
		//		/*
		//		 */* ferret*/ 
		//		 */
				// Animal animal = new Animal();
		
				System.out.println(args[0]);
				System.out.println(args[1]);
				
				Random r = new Random();
				System.out.println(r.nextInt(10));
				
				Date date;
				java.sql.Date date2;
	}

}
