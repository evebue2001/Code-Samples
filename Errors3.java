//Debugged code as it contained errors

import java.util.Scanner;

public class Errors3
{
	//Inserted { to make arguments inside the main public static valid to public class
	
	public static void main(String[] args) {
		
		Scanner kbd = new Scanner (System.in);
		//Inserted () in between Stystem.in
		//Scanner kbd = new Scanner System.in;
		
		int numerator;
		//Lowercased the i in Int
		//Int numerator;
		
		int denominator;
		//Change integer to int
		//integer denominator;

		System.out.println("This program divides two numbers.");
		//Inserted out. in between words system and println
		//System.println("This program divides two numbers.");
		
		System.out.print("Enter the numerator: ");
		//Inserted out. in between words system and print
		//System.print("Enter the numerator: ");
		
		numerator = kbd.nextInt();
		System.out.print("Enter the denominator: ");
		
		denominator = kbd.nextInt();
		//Corrected spelling of the variable
		//denomintaor = kbd.nextInt();

		System.out.print(numerator);
		//Capitalized the s in system 
		//system.out.print(numerator);
		
		System.out.print("/");
		
		System.out.print(denominator);
		//Capitalized the s in system and lowercase the p in Print
		//system.out.Print(denominator);
		
		System.out.print(" = ");
		
		System.out.println((double) numerator/denominator);
		//Lowercase the p in Println
		//System.out.Println((double) numerator/denominator);
	}
	//Inserted { to make arguments inside the main public static valid to public class
}
