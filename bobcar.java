import java.util.Scanner;

public class bobcar {

	public static void main(String[] args)
	{

		System.out.println("Welcome to Bobcat's Bobcar Self-Serviced Car Checkout.");
		System.out.println("We offer 3 classes of vehicles to rent: Economy, Compact, and Standard.");
		System.out.println("Economy is $35 per day, Compact is $45 per day, and Standard is $95 per day.");
		System.out.println("Please select the car class you would like to rent: Economy = 1 | Compact = 2 | Standard = 3");

		Scanner in = new Scanner(System.in);
		int baseCost, discount;
		String carclass = "a";
		discount = 0;

		baseCost = in.nextInt();

		switch (baseCost) {

		case 1:
			baseCost = 35;
			carclass = "Economy";
			break;

		case 2:
			baseCost = 45;
			carclass = "Compact";
			break;

		case 3:
			baseCost = 95;
			carclass = "Standard";
			break;
		}

		System.out.println("How many days would you like to rent this car?");
		int rentDays;
		rentDays = in.nextInt();

		System.out.println("Are you a Bobcar member? No = 0 | Yes = 1");
		int member, exec;
		double cost;
		member = in.nextInt();
		exec = 0;
		cost = 0;

		if (member == 1) {
			discount = (int)(rentDays / 7) * baseCost;
			System.out.println("Would you like to purchase a Platinum Executive Package? No = 0 | Yes = 1");
			exec = in.nextInt();
			if (exec == 1) {
				cost = (baseCost * rentDays) * .15;
			}
			else {
				cost = 0;
			}
		}
		else {
		}

		System.out.println("Base Cost " + rentDays + " days for a(n) " + carclass + " vehicle:        $" + baseCost * rentDays);
		System.out.println("Club Member Discount:                            -$" + discount);

		if (exec == 1) {
			System.out.println("Platinum Executive Package:                      +$" + cost);
		} else {
		}
		System.out.println("Total Estimate for Rental:                        $" + ((baseCost * rentDays) - discount + cost));


	}
}
