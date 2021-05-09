import java.util.Scanner;

public class Errors2 {
	
	public static void main(String[] args) 
	{
		
		Scanner kbd = new Scanner(System.in);
		
		int number = 0;
		int theSquare = 0;
		
		System.out.print("Enter a number and I will");
		//Inserted ; at the end of the System.out.print statement 
		//System.out.print("Enter a number and I will")
		
		System.out.print(" square it for you:  ");
		//Added space in front of square  
		//Inserted double quotes at the end of output string
		//System.out.print("square it for you:  );
				
		number =  kbd.nextInt();
		//Changed the Scanner object name to kdb as not scanner object source for keyboard exist
		//Add () to the end of kbd.nextInt argument
		//number =  keyboard.nextInt;

		theSquare = number * number;
		//Removed the comment characters from "thesquare = number * number;" 
		//Capitalize S from square  
		//thesquare = number * number;

		System.out.print(number + " squared = ");
		//Inserted ) to the end of the output string after the double quotes 
		//System.out.print(number + " squared = ";
		
		System.out.println(theSquare);
		//Removed the double quotes from the output string statement 
		//System.out.println("theSquare");
	}
}