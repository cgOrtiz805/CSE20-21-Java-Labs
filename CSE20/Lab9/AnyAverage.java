import java.util.Scanner;

public class AnyAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("Please enter the max number:");

		int max = input.nextInt();
		int n = 0;
		int sum = 0;
		while ( n < max) {
			System.out.println("Number " + n);
			
			sum = n+sum;
			n++;
	
		}
System.out.print("Average is " + sum/max);
}
}


