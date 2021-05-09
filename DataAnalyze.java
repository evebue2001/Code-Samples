//A computer program to automatically analyze some of the data collected by some experiments

import java.util.Scanner;

public class DataAnalyze {
	public static void main (String[] arguments) {

		Scanner info = new Scanner(System.in);
		System.out.print("Please enter the sample size: ");
		int samplesize = info.nextInt();

		if (samplesize == 0) {
			System.out.print("No data to analyze. Ending program.");
			System.exit(0);
		}

		int[][] trail = new int[samplesize + 1][5];
		int x,y; 

		for (x= 1; x <= 4; x++) {
			System.out.println('\n' + "Enter numbers for Trail "+ x);

			for(y= 1; y<= samplesize; y++) {
				System.out.print("Enter sample #" + y + ": " );
				trail[y][x] = info.nextInt();
			}
		}

		System.out.println('\n' + "\tSample #\tTrail 1\tTrail 2\tTrail 3\tTrail 4");

		for (x=1; x<= samplesize; x++) {
			System.out.print("\n\t" + x + "\t");
			for (y= 1; y<= 4; y++) {
				System.out.print("\t" + trail[x][y]);
			}
		}

		System.out.print("\n\t-------------------------------------------------");
		System.out.print("\n\tAverage:");

		int average[] = new int[5];

		for(x=1; x<= 4; x++) {
			average[x] = 0;
			for( y=1; y<= samplesize; y++) {
				average [x]+= trail[y][x];
			}
			average [x]/= samplesize;
			System.out.print("\t" + average[x]);
		}

		int min = average[1], max= average[1];

		for(x=1; x<=4; x++) {
			if(average[x]< min)
				min = average[x];
			if(average[x]>max)
				max = average[x];	
		}

		System.out.println("\n\nMin Average: " + min);
		System.out.println("Max Average: " + max);

		if (min == max) 
			System.out.print("\nThe trails match EXACTLY!");
		else if (max < min*2)
			System.out.print("\nThe trails concur with each other!");
		else 
			System.out.print("\nThe trails do NOT concur!");
	}
}
