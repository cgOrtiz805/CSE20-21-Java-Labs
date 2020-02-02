import java.util.Scanner;
public class Manipulate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);
	int n1, n2, add, sub, div, mul, rem;
	
	
	System.out.println("Type in a first number: ");
	System.out.println("Type in a second number: ");
	n1 = input.nextInt();
	n2 = input.nextInt();
	
	add = (int) n1 + n2;
	sub = (int) n1 - n2;
    div = (int) n1/n2;
	mul = (int) n1 * n1;
	rem = (int) n1 % n2;
	
	System.out.println("The sum is: " + add);
	System.out.println("The difference is: " + sub);
	System.out.println("The quotent is: " + div);
	System.out.println("The product is:" + mul);
	System.out.println("The remainder is" + rem);
	
	short n3, n4, add1, sub1, div1, mul1, rem1;
	
	System.out.println("Type in a third number: ");
	System.out.println("Type in a fourth number: ");
	n3 = input.nextShort();
	n4 = input.nextShort();
	
	add1 = (short) (n1 + n2);
	sub1 = (short) (n1 - n2);
	div1 = (short) (n1/n2);
	mul1 = (short) (n1 * n1);
	rem1 = (short) (n1 % n2);
	
	System.out.println("The short sum is: " + add1);
	System.out.println("The short difference is: " + sub1);
	System.out.println("The short quotent is: " + div1);
	System.out.println("The short product is:" + mul1);
	System.out.println("The short remainder is" + rem1);
	
	float n5, n6, add2, sub2, div2, mul2, rem2;
	
	System.out.println("Type a fifth number: ");
	System.out.println("Type in a sixth number: ");
	n5 = input.nextFloat();
	n6 = input.nextFloat();
	
	
	add2 = (float) n1 + n2;
	sub2 = (float) n1 - n2;
	div2 = (float) n1/n2;
	mul2 = (float) n1 * n1;
	rem2 = (float) n1 % n2;
	
	
	
	
	System.out.println("The float sum is: " + add2);
	System.out.println("The float difference is: " + sub2);
	System.out.println("The float quotent is: " + div2);
	System.out.println("The float product is:" + mul2);
	System.out.println("The float remainder is" + rem2);
	
	double n7, n8, add3, sub3, div3, mul3, rem3;
	
	System.out.println("Type a seventh number: ");
	System.out.println("Type a eigth number: ");
	n7 = input.nextDouble();
	n8 = input.nextDouble(); 
	
	add3 = (double) (n1 + n2);
	sub3 = (double) (n1 - n2);
	div3 = (double) (n1/n2);
	mul3 = (double) (n1 * n1);
	rem3 = (double) (n1 % n2);
	
	
	
	
	System.out.println("The double sum is: " + add3);
	System.out.println("The double difference is: " + sub3);
	System.out.println("The double quotent is: " + div3);
	System.out.println("The double product is:" + mul3);
	System.out.println("The double remainder is" + rem3);
	
	
	
	
	
	
	
	
	
	
	
	
	//Collaborator: Lesn Ngs and Daniel Toriz// 
	
	
	}

}
