import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter a number 0-25: ");
		double num = input.nextInt();
		
		System.out.println("You have entered " + num);
	
	if (num == 0)
	System.out.println(num + " Character of the alphabet is A ");
	
	else if (num >= 1&&num<25)
		System.out.println("Character of the alphabet is " + (char)('A'+num));
	
	else if (num > 25)
		System.out.println("Outside of acceptable range");
		
	
	
	
	
	
	
	
	
	
	
	
		} 
	

}
