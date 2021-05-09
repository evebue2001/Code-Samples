import java.util.Scanner;
import java.util.Random;

public class BobcatHotel {
	public static void main (String[] arguments) {
		int guests, nights, clubmem, mealtype, clubrandiscount;
		double roomtype, baseroomcost, mealcost, pretotalcost, AAAdiscount, clubdiscount, totalcost;
		boolean AAAmem; 

		Scanner reservationinfo = new Scanner(System.in);
		Random ranclubnum = new Random();

		//Introduction to Hotel
		System.out.println("Welcome to BOBCAT HOTEL!" + '\n' + '\n' + "ROOM OPTIONS");
		System.out.print("1. Single: $50.50 per night"+ '\n' + "2. Double: $75.00 per night" + '\n' + "3. Queen: $100.75 ");
		System.out.println("per night" + '\n' + "4. King: $150.25 per night" + '\n' + "5. Master Suite: $225.50 per night" + '\n');

		//Input of Number of Guests
		System.out.print("Please specify the number of guests: ");
		guests = reservationinfo.nextInt();

		//Input of Room Choice 
		System.out.print("Please select your room choice (enter 1/2/3/4/5 corresponding to the options shown above): ");
		roomtype = reservationinfo.nextDouble();

		//Input of Number of Nights
		System.out.print("Please enter the number of nights: ");
		nights = reservationinfo.nextInt();

		//Determination of Room Cost Based on Selected Type
		if (roomtype == 1) 
			roomtype = 50.50;
		else if (roomtype == 2) 
			roomtype = 75;
		else if (roomtype == 3) 
			roomtype = 100.75;
		else if (roomtype == 4) 
			roomtype = 150.25;
		else if (roomtype == 5)
			roomtype = 225.50;

		//Base Room Cost Calculations
		baseroomcost = nights * roomtype;

		//Input of AAA Member and Boolean Statement
		System.out.print("Are you a AAA member (enter 1 for yes, 0 for no)? ");
		AAAmem = (reservationinfo.nextInt() == 1);

		//Input of Club Member
		System.out.print("Are you a club member (enter 1 for yes, 0 for no)? ");
		clubmem = reservationinfo.nextInt();

		//If Club Member: A Random Number Will Generate
		if (clubmem == 1); 
		clubrandiscount = ranclubnum.nextInt(10);

		//IF: If Not A Club Member No Nights Will Be Discounted As (clubrandisount = 0)
		//ELSE IF: Check Of Applicable Club Discount Only When The Random Number Generated  
		//and Stay Nights In Hotel Is Greater Than Or Equal To Four 
		//If Random Number Generated and Stay Nights Are Greater Than Or Equal To 4 Then It Will Calculate Nights Discounted
		//ELSE: If Not Then There Will Be No Nights Discounted As (clubrandisount = 0)
		if (clubmem ==  0) {
			clubrandiscount = 0;
		}else if(clubrandiscount >= 4 && nights >= 4) {
			System.out.println("\nCongratulations! You've qualified for our \"Stay 4 nights get 1 free promotion\"");
			System.out.println("Discount wil be applied during checkout depending on the number of days\n");
			clubrandiscount = nights/4;
		}else{
			System.out.println("\nUnfortunately, you didn't qualify for our \"Stay 4 nights get 1 free promotion\"");
			System.out.println("Better luck next time!\n");
			clubrandiscount = 0;
		}


		//Calculation of Club Member Discount Based On Room Type Price
		clubdiscount = clubrandiscount * roomtype;

		//Selection of Meal Packages Display
		//Meals 0 through 3 Will Only Be Displayed When Selecting Room Type 5 Which Cost $225.50
		//Meals 0 through 2 Will Only Be Displayed When Selecting Any Other Room Types 
		if (roomtype == 225.50) {
			System.out.println("\nMEAL PACKAGES (PRICES SHOWN PER GUEST PER NIGHT)");
			System.out.print("0. Complementary: $0 per guest" + '\n' + "1. Standard: $30 per guests" + '\n');
			System.out.println("2. Deluxe: $50 per guest" + '\n' + "3. Indulgence: $85 per guests" + '\n');

			System.out.print("Please select your desired meal package (enter 0/1/2/3 corresponding to the options shown above): ");
		}else{
			System.out.println("\nMEAL PACKAGES (PRICES SHOWN PER GUEST PER NIGHT)");
			System.out.print("0. Complementary: $0 per guest" + '\n' + "1. Standard: $30 per guests" + '\n');
			System.out.println("2. Deluxe: $50 per guest" + '\n');

			System.out.print("Please select your desired meal package (enter 0/1/2 corresponding to the options shown above): ");
		}

		//Input Of Meal Type Selection	
		mealtype = reservationinfo.nextInt();

		//Determination of Each Meal Cost Based On Selection
		switch(mealtype){
		case 0:
			mealtype = 0;
			break;
		case 1:
			mealtype = 30;
			break;
		case 2:
			mealtype = 50;
			break;
		case 3:
			mealtype = 85;
			break;
		}

		//Calculation of Meal Cost For Total Stay Time In Hotel
		mealcost = guests * nights * mealtype;

		//Calculation of Preliminary Total Cost 
		pretotalcost = baseroomcost + mealcost;

		//Boolean Statement of AAA Member discount Will Be Checked 
		//When Input Of 1 is Entered By User, AAAmem Becomes True and Calculates The Discount  
		//When Input Of 0 is Entered By User, AAAmem Becomes False and No Discount Is Given As (AAAdiscount = 0)
		if (AAAmem == true)
			AAAdiscount = pretotalcost * .10;
		else
			AAAdiscount = 0;

		//Calculation of Total Cost
		totalcost = pretotalcost - (AAAdiscount + clubdiscount);

		//Checkout Message And Room Cost Will Print 
		System.out.println("\nCHECKOUT");
		System.out.println("Room Cost:\t\t $" + baseroomcost);

		//If Meal Type Selected is 0 No Meal Cost Message Will Be Displayed and It Will Instead Display The Preliminary After The Room Cost
		//If Any Other Meal Typed Is Selected Then A Meal Cost and Preliminary Cost Message Will Be Displayed After The Room Cost 
		if (mealtype == 0) {
			System.out.println("Preliminary Total Cost:\t $" + pretotalcost);
		}else{
			System.out.println("Meal Cost:\t\t+$" + mealcost);
			System.out.println("Preliminary Total Cost:\t $" + pretotalcost);
		}

		//If User Is An AAA Member A Discount Message Will Be Displayed
		if (AAAmem == true)
			System.out.println("AAA Discount:\t\t-$" + AAAdiscount);

		//If A Club Member and Random Number Generated Is Greater Than 4 Then There Must Be A Club Discount That Does Not Equal to 0
		//If Club Discount Then A Discount Message Will Be Displayed
		if (clubdiscount!= 0)
			System.out.println("Club Member Discount:\t-$" + clubdiscount);

		//If User Is Not An AAA Member and Random Number Generated Is Less Than 4 Or User Is Not A Club Member It Leads To No Discount And Display of This Message 
		if (AAAmem == false && clubdiscount == 0)
			System.out.println("No Discounts Applied");

		//Total Cost Of Booking Display Message
		System.out.println("Total Cost Of Booking:\t $" + totalcost);
	}
}
