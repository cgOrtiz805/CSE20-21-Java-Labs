import java.util.Scanner;
public class CheeseShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner input = new Scanner(System.in);
		double costSharp, costBrie, costSwiss;
		double Subtotal;
		double Discount=0;
		double Discount1 = 10;
		double Discount2 = 15;
		double Total=0;
		System.out.println("Welcome to the CheeseShop (^o^)/, home of the greasiest Cheese in the world.");
		System.out.println("---------------------------------------------------------------------");
		
		System.out.println("We sell 3 kinds of Cheeese ");
		System.out.println("");
		System.out.println("Dalaran Sharp: $1.25 per pound");
		System.out.println("Stormwind Brie: $10.00 per pound");
		System.out.println("Alterac Swiss: $40.00 per pound");
		
		System.out.println("Enter the ammount of Sharp: ");
		int max0 = input.nextInt();
		costSharp = max0*1.25;
		System.out.println("Enter the ammount of Brie: ");
		int max1 = input.nextInt();
		costBrie = max1*10.00;
		System.out.println("Enter the ammount of Swiss:");
		int max2 = input.nextInt();
		costSwiss = max2*40.00;
		System.out.println(" Display the itemized list? (1 for yes and 2 for no");
		 int choice = input.nextInt();
		 {
		
			 Subtotal = costSharp+costBrie+costSwiss;
		 
		 if (Subtotal < 50){
			 Total=Subtotal;
		 } if(Subtotal >=50){
			  Discount += Discount1;
		 	Total= Subtotal-Discount;
		 }	if(Subtotal >= 100){
		 		Discount += Discount2;
		 	Total = Subtotal - Discount;
		 }
		 	
		 
		
		 
		 
		if (choice ==1){
		System.out.println(max0 +" lbs of Sharp @ $1.25 = $" + costSharp);
		System.out.println(max1 +" lbs of Brie @ $10.00 = $" + costBrie);
		System.out.println(max2 +" lbs of Swiss @ $40.00 = $" + costSwiss); 
		System.out.println("");
		System.out.println("Sub Total: $" + Subtotal);
		System.out.println("-Discount: $" + Discount);
	    System.out.println("Total : $" + Total );

	
		}
		
		else if (choice ==2){
			
		System.out.println("Sub Total: $" + Subtotal);
		System.out.println("-Discount: $" + Discount);
	    System.out.println("Total : $" + Total );
		
		}
		
		
		System.out.println("Thank you for shopping at the CheeseShop! (^_^)/");
		
			
		
		
	}

		 }
		 
	
	
}




	

