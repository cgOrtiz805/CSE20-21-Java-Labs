import java.util.Scanner;

public class SumAllDo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("Please enter the max number:");

		int max = input.nextInt();
		int i = 0;
		double sum = 0;
		do {
			System.out.println("Number " + i);
			i++; 
			sum = i+sum;
		} while ( i <= max);
		
	
	
		System.out.print("sum of all is " + sum); 
	
			
	
}

}

