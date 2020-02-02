import java.util.Scanner;
public class FindDuplicateCount {

	public static void main(String[] args) {
		int[] arr = {1, 2, 2, 3, 4, 2, 4, 3, 0, 5, 3, 2};
		
	
	
	int a,b;
	int count = 0;
	
	for (a =0; a < arr.length; a++) {     //counts size of array//
	count =0;
	for (b = a+1; b < arr.length; b++) 	{	//find duplicates//
		if ( arr[a]==arr[b])
		count++;
	
	}
	

	
	
	if (count==0)
		System.out.println("No duplicates with values " + arr[a] + " beyong Index " + a);
	
	if (count > 1)
		System.out.println("There are " + count + " more occurrences of value " + arr[a] + " starting at index " + a);
		
	if (count == 1)
		System.out.println("There is only " + count + " more occurences of value " + arr[a] + " starting at index " + a);
	
		
	}
		
		
		
		
	}
	

}



