import java.util.Scanner;

public class Manipulatev2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		double n1, n2;

		System.out.print("Please enter the first number: ");
		n1 = input.nextDouble();

		System.out.print("Please enter the second number: ");
		n2 = input.nextDouble();

		//System.out.print("Please enter the second number: ");
		//n2 = input.nextDouble();

		System.out.println("\nWe support +, -, *, / and % operations. Choose:");
		System.out.println("\t 1 for + \n\t 2 for - \n\t 3 for * \n\t 4 for / and \n\t 5 for %");
		
		System.out.print("Please choose the operation: ");
		int operation = input.nextInt();
		
		System.out.println("\nWe support output types: short, int, float and double. Choose");
		System.out.println("\t 1 for short \n\t 2 for int \n\t 3 for float and \n\t 4 for double");
		
		System.out.print("Please choose the output data type: ");
		int dataType = input.nextInt();
		System.out.println();
		
		double result = 0;
		
		if (operation == 1) {
			result = n1 + n2;
			System.out.println("Adding two numbers...");
		} else if (operation == 2) {
			result = n1 - n2;		
			System.out.println("Subtracting two numbers...");
		} else if (operation == 3) {
			result = n1 * n2;
			System.out.println("Multiplying two numbers...");
		} else if (operation == 4) {
			result = n1/n2;
			System.out.println("Dividing two numbers...");
		} else if (operation == 5) {
			result = n1 % n2;
			System.out.println("Computing remainder of two numbers...");

		} else {

			System.out.println("Wrong operation type");
		}
		
		System.out.print("The result is ");
		if (dataType == 1) {
			System.out.println((short)result);
		} else if (dataType == 2) {
			System.out.println((int)result);
		} else if (dataType == 3) {
			System.out.println((float)result);
		} else if (dataType == 4) {
			System.out.println((double)result);
		} else {
			System.out.println("the wrong type to output");
		}
	}	
}
