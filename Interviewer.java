//Small code interview using keyboard input for any user 

import java.util.Scanner;

public class Interviewer {
	public static void main(String[] args) {
		
		Scanner info = new Scanner(System.in);
		
		String name;
		System.out.print("What is your name? ");
		name = info.next();
		System.out.println(name);
		
		
		String hometown;
		System.out.print("Where is your hometown? ");
		hometown = info.next();
		System.out.println(hometown);
		
		
		String major;
		System.out.print("What is your major? ");
		major = info.next();
		System.out.println(major);
		
		int standing;
		System.out.print("What is the number of your class standing? ");
		standing = info.nextInt();
		System.out.println(standing + " yr");
	}
}
