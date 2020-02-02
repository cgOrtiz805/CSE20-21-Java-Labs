import java.util.Scanner;

public class DataAnalyze {

	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);


		int trial = 4;
		int sampleSize;
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE; 
		int sum = 0;

		System.out.println("Please enter the sample size: ");
		sampleSize = input.nextInt();		

		int [] arr = new int [sampleSize];
		int [] arr2 = new int [sampleSize];
		int [] arr3 = new int [sampleSize];
		int [] arr4 = new int [sampleSize];
		int [] avg = new int [trial];

		System.out.println("Enter numbers for trial 0 ");
		for (int a = 0; a < sampleSize; a++){

			System.out.print("Enter sample #" + a + ": ");
			arr[a] = input.nextInt();
			sum = arr[a] + sum ;

		}
		avg[0] = sum / sampleSize;
		sum = 0;

		System.out.println("Enter numbers for trial 1 ");
		for (int a = 0; a < sampleSize; a++){

			System.out.print("Enter sample #" + a + ": ");
			arr2[a] = input.nextInt();
			sum = arr2[a] + sum;

		}
		avg[1] = sum / sampleSize;
		sum = 0;

		System.out.println("Enter numbers for trial 2 ");
		for (int a = 0; a < sampleSize; a++){

			System.out.print("Enter sample #" + a + ": ");
			arr3[a] = input.nextInt();
			sum = arr3[a] + sum;

		}
		avg[2] = sum / sampleSize;
		sum = 0;

		System.out.println("Enter numbers for trial 3 ");
		for (int a = 0; a < sampleSize; a++){

			System.out.print("Enter sample #" + a + ": ");
			arr4[a] = input.nextInt();
			sum = arr4[a] + sum;

		}
		avg[3] = sum / sampleSize;
		sum = 0;


		System.out.print("\tSample #");
		System.out.print("\tTrial 1\t");
		System.out.print("\tTrial 2\t");
		System.out.print("\tTrial 3\t");
		System.out.println("\tTrial 4\t");

		for(int a = 0; a < sampleSize; a++){
			System.out.print("\t" +a);
			System.out.print("\t\t" + arr[a] + "\t");
			System.out.print("\t" + arr2[a] + "\t");
			System.out.print("\t" + arr3[a] + "\t");
			System.out.println("\t" + arr4[a] + "\t");

		}
		System.out.println("\t------------------------------------------------------------------------");
		System.out.println("Average:\t\t" + avg[0]+ "\t\t" + avg[1] + "\t\t" + avg[2] + "\t\t" + avg[3]+ "\t\t");
		for (int a = 0; a < trial; a++){

			if(min > avg[a]){
				min = avg[a];
			}
			if (max < avg[a]){
				max = avg[a];
			}
		}


		System.out.println("Min Average: " + min);
		System.out.println("Max Average: " + max);


		if (max == min){
			System.out.println("The trials match EXACTLY!");
		}

		if (max > min * 2){
			System.out.println("The trials do NOT concur");
		}


		else if (max < min * 2) {
			System.out.println("The trials concur with each other!");


		}
	}
}

// Collaborater: Daniel Toriz//