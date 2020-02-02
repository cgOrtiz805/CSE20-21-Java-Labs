import java.util.Scanner;

public class Errors2 {

	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		int number = 0;
		int theSquare = 0;

		//System.out.print("Enter a number and I will ")
		  System.out.print("Enter a number and I will ");
		
		 // System.out.print("square it for you:  );
		   System.out.print("square it for you");
		
		   Scanner keyboard = new Scanner(System.in); // added
		   
		   //number =  keyboard.nextInt;
		number = keyboard.nextInt(); 
		   
				  
		//thesquare = number * number;
		  theSquare = number * number;

		//System.out.print(number + " squared = ";
		  System.out.print(number + " squared = ");
		
		  //System.out.print("theSquare);
		  System.out.println(theSquare);
	}
}