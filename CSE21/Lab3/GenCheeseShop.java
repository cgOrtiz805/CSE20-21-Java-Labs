import java.util.Random;
import java.util.Scanner;

public class GenCheeseShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	Scanner input = new Scanner(System.in);
final int MAXCHEESE = 10;
double discount =0;
double Total = 0;
			
		

		String[] names = new String[MAXCHEESE];
		double[] prices = new double[MAXCHEESE];
		int[] amounts = new int[MAXCHEESE];

		// Special 3 Cheeses
		
		System.out.println("Welcome to the Cheese Shop");
		System.out.println("");
		
		if (0 < MAXCHEESE & MAXCHEESE <21){
		names[0] = "Dalaran Sharp";
		prices[0] = 1.25;
		
		if (1 < MAXCHEESE){
		names[1] = "Stormwind Brie";
		prices[1] = 10.00;
		}
		if (2<MAXCHEESE){
		names[2] = "Alterac Swiss";
		prices[2] = 40.00;
		}
		
 		System.out.println("We sell " + MAXCHEESE + " kinds of Cheese");
System.out.println("-----------------------------------------");
		System.out.println(names[0] + ": $" + prices[0] + " per pound");
		if (1<MAXCHEESE)
		System.out.println(names[1] + ": $" + prices[1] + " per pound");
		if(2<MAXCHEESE)
		System.out.println(names[2] + ": $" + prices[2] + " per pound");

 		Random ranGen = new Random(100);

		for (int i = 3; i < MAXCHEESE; i++) {
			names[i] = "Cheese Type " + (char)('A'+i);
			
			prices[i] = ranGen.nextInt(1000)/100.0;
			amounts[i] = 0;

			System.out.println(names[i] + ": $" + prices[i] + " per pound");
		
		}
		
		for(int i=0; i < MAXCHEESE; i++){
			System.out.println("Enter the amount of " + names[i] + ":");
			amounts[i] = input.nextInt();
			
			Total= Total+(amounts[i]*prices[i]);
		}
		
		System.out.println(" Display the itemized list? (1 for yes)");
		 int choice = input.nextInt();
		 
		 if(Total>=100)
		 discount = 25;
		
		 else if (Total >=50)
		 discount = 10;
		 
		 if (choice == 1){
		 for(int i=0; i<MAXCHEESE; i++){
			
			 if (amounts[i]>0);
		 	System.out.println(amounts[i] + " lbs of " + names[i]+ " = $" + prices[i]*amounts[i]);
		 
		 	
		 }
		 }
		 
		System.out.println("------------------");
		System.out.println("Sub Total: $" + Total);
		System.out.println("-Discount: $" + discount);
		System.out.println("Total $" + (Total-discount));
		
		}
		
		if(MAXCHEESE==0){
		System.out.println("Sorry! We sell 0 kinds of cheese");
		System.out.println("--------------------------------");
		System.out.println("Sub Total: $" + 0.00);
		System.out.println("-Dicount: $" + 0.00);
		System.out.println("Total: $" + 0.00);
		
		
		

		}

}

}