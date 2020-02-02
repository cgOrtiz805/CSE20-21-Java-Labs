import java.util.Scanner;

public class PosAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		
		int max=0;
		int i = 0;
		int total =0;
		
		do {
			System.out.println("Enter " + i + " Number: ");
			max=input.nextInt();
			
			if(max>0){
				total +=max;
				i++;
				
			}
		}
		while(max>0);
		System.out.println("Average of all is " + (total/i));
		
	}
	
}

				
				
	





