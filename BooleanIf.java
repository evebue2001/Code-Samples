//Replace all the true in the if statements with the appropriate relational check between a and b

import java.util.Scanner;

public class BooleanIf{
	public static void main(String[] args) {
		int a = 0, b = 0;

		Scanner in = new Scanner(System.in);
		System.out.print("Input the first number: ");
		a = in.nextInt();
		System.out.print("Input the second number: ");
		b = in.nextInt();

		if (a > b)
			System.out.println(a + " is greater than " + b);
		
		if (a < b)
		//if (true)
			System.out.println(a + " is less than " + b);

		if (a == b)
		//if (true)
			System.out.println(a + " is equal to " + b);

		if (a >= b)
		//if (true)
			System.out.println(a + " is greater or equal to " + b);
 
		if (a <= b)
		//if (true)
			System.out.println(a + " is less than or equal to " + b);

		if (a != b)
		//if (true)
			System.out.println(a + " is not equal to " + b);
				
	}
} 
