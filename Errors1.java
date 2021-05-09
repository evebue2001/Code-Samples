//Debugged code as it contained errors 

import java.util.Scanner;

public class Errors1 {

	public static void main(String[] args) 
	{
		//bracket was add to make stated arguments inside the main string valid
		
		System.out.println("Can you spot and fix the errors?");
		
		//Inserted double quotes at the end of output statement
		//System.out.println("Can you spot and fix the errors?');

		System.out.println("Enter two numbers and I will ");
		System.out.println("add them for you");

		int n1, n2;
		
		Scanner keyboard = new Scanner(System.in);
		
		//inserted ; at the end of the scanner argument
		//Scanner keyboard = new Scanner(System.in)
		
		n1 = keyboard.nextInt();
		//n1 = nextInt();
		//Inserted the scanner object name in front of nextInt(); statement 
		
		n2 = keyboard.nextInt();
		//n2 = nextint();
		//Capitalized i in the nextint(); statement and inserted the scanner object name in front of it
		
		System.out.println("The sum of the numbers is");
		//System.println("The sum of the numbers is");
		//Inserted out. in between words system and println
		
		System.out.println(n1 + n2);
		//Switch the minus sign to an addition as you are summing the two values
		//System.out.println(n1 - n2);
	}
}
