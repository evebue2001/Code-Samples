import java.util.Scanner;

public class Manipulate {
	public static void main(String[] args) {
		
		Scanner numbers = new Scanner(System.in);
		
		System.out.println("Input two integers:");
		
		int int1= numbers.nextInt();
		int int2= numbers.nextInt();
		
		int sum = int1 + int2; 
		System.out.println("Sum of " + int1 + " and " + int2 + " is " + sum);
		
		int minus = int1 - int2;
		System.out.println("Difference of " + int1 + " and " + int2 + " is " + minus);
		
		int product = int1 * int2;
		System.out.println("Product of " + int1 + " and " + int2 + " is " + product);
		
		int divide = int1 / int2; 
		System.out.println("Integer cast of (" + int1 + " / " + int2 + ") is " + divide);
		
		int remainder = int1 % int2; 
		System.out.println("Integer cast of (" + int1 + " % " + int2 + ") is " + remainder + "\n");
		
		System.out.println("Input two shorts:");
		
		short st1= numbers.nextShort();
		short st2= numbers.nextShort();
		
		sum = st1 + st2; 
		System.out.println("Sum of " + st1 + " and " + st2 + " is " + sum);
		
		minus = st1 - st2;
		System.out.println("Difference of " + st1 + " and " + st2 + " is " + minus);
		
		product = st1 * st2;
		System.out.println("Product of " + st1 + " and " + st2 + " is " + product);
		
		divide = st1 / st2; 
		System.out.println("Short cast of (" + st1 + " / " + st2 + ") is " + divide);
		
		remainder = st1 % st2; 
		System.out.println("Short cast of (" + st1 + " % " + st2 + ") is " + remainder + "\n");
		
		System.out.println("Input two floating points:");
		
		float flt1= numbers.nextFloat();
		float flt2= numbers.nextFloat();
		
		float sumf = flt1 + flt2; 
		System.out.println("Sum of " + flt1 + " and " + flt2 + " is " + sumf);
		
		float minusf = flt1 - flt2;
		System.out.println("Difference of " + flt1 + " and " + flt2 + " is " + minusf);
		
		float productf = flt1 * flt2;
		System.out.println("Product of " + flt1 + " and " + flt2 + " is " + productf);
		
		float dividef = flt1 / flt2; 
		System.out.println("Float cast of (" + flt1 + " / " + flt2 + ") is " + dividef);
		
		float remainderf = flt1 % flt2; 
		System.out.println("Float cast of (" + flt1 + " % " + flt2 + ") is " + remainderf + "\n");
		
		System.out.println("Input two doubles:");
		
		double dub1= numbers.nextDouble();
		double dub2= numbers.nextDouble();
		
		double sumdub = dub1 + dub2; 
		System.out.println("Sum of " + dub1 + " and " + dub2 + " is " + sumdub);
		
		double minusdub = dub1 - dub2;
		System.out.println("Difference of " + dub1 + " and " + dub2 + " is " + minusdub);
		
		double productdub = dub1 * dub2;
		System.out.println("Product of " + dub1 + " and " + dub2 + " is " + productdub);
		
		double dividedub = dub1 / dub2; 
		System.out.println("Double cast of (" + dub1 + " / " + dub2 + ") is " + dividedub);
		
		double remainderdub = dub1 % dub2; 
		System.out.println("Double cast of (" + dub1 + " % " + dub2 + ") is " + remainderdub + "\n");
	}
}
