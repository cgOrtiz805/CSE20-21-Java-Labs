import java.util.Scanner;

public class SumAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);

		System.out.print("Please enter the max number:");

		int max = input.nextInt();
		double sum = 0;
		int n = 0;
		while ( n <= max) {
			System.out.println("Number " + n);
			
			sum = n+sum;
			
			n++;
			
		
		
		
	}
		System.out.println("Sum of All is " + sum);
}
	
}
