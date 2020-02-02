import java.util.Scanner;
public class Bobcars {

	public static void main(String[] args) {


		int Decision, numDays, clubMember, Price, Discount;
		int numTotal = 0;
		double Pack = 0;

		String Plan = null;
		Scanner scan = new Scanner(System.in);

		System.out.println("Welcome, we have three cars available.");
		System.out.println("The three available cars are: 1 for Economy, 2 for Compact, 3 for Standard");
		System.out.println("Please choose the rental car: ");
		Decision = scan.nextInt();

		if (Decision == 1){
			Decision = (35);
			Plan = ("Economy");

		}else if (Decision == 2){
			Decision = (45);
			Plan = ("Compact");

		}else if (Decision == 3){
			Decision = (95);
			Plan = ("Standard");

		}else
			Decision = (0);

		System.out.println("Please choose the number of rental days: ");
		numDays = scan.nextInt();

		if (numDays > 0){
			System.out.println("Club member?: 1 for yes, 0 for no: ");
			clubMember = scan.nextInt();
			Price = (numDays*Decision);

			if (clubMember == 1){
				clubMember = (numDays/7);
				System.out.println("Platinum Executive Package?: 1 for yes, 0 for no: ");
				Pack = scan.nextDouble();

				if (Pack == 1){
					Pack = (Price*0.15);

				}else if (Pack == 0){
					Pack = (0);

				}else{
					System.out.println("Cannot determine package status.");}

			}else if (clubMember == 0){
				clubMember = (0);

			}else{
				System.out.println();}

			Discount = (clubMember * Decision);
			numTotal = (int) (Price - Discount + Pack); 
			System.out.println("Base: " + numDays + " days for a " +  Plan + " @ $" + Decision + " per day: $ "  + Price);

			if (clubMember > 0){
				System.out.println("Club Member Discount: - $ " + Discount);

			}else if (clubMember <= 0){
				System.out.println();

			}if (Pack > 0){
				System.out.println("Platinum Executive Package: + $ " + Pack);

			}else if (Pack <= 0){System.out.println("");}
			System.out.println("Total Estimate for Rental: $ " + numTotal); } 

		else {
			System.out.println();

		} 

	}

}

// colaborators: Daniel Toriz
