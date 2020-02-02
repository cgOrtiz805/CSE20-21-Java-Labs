import java.util.Scanner;

public class SumSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("Please enter the max number:");
		int max = input.nextInt();
		
		double sum = 0;
		for (int i = 0; i <= max; i++) {
			System.out.println("Number " +i+ " squared is "+ i*i);
			
			sum=i*i+sum;
	}
		System.out.println("Sum of squares is " + sum);
}

	
}