import java.util.Scanner;

public class RemainderFunc {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		int i=1;
		int max =0;
		int div=0;
		
		System.out.println("Enter a Max number");
		max =input.nextInt();
		
		System.out.println("Enter a Divisor");
		 div = input.nextInt();
		
	for (i =1; i<=max;) {
		System.out.println("Num: " + i + " % " + div + " = " + i%div);
		
		
		++i;
		
	}

}

	
}