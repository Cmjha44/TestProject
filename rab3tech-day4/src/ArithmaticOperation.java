import java.util.Scanner;

public class ArithmaticOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float input1;
		float input2;
		Scanner scan=new Scanner(System.in);
		System.out.println("input the first number: ");
		input1=scan.nextFloat();
		System.out.println("input the second number: ");
		input2= scan.nextFloat();
		float add= input1+input2;
		
		
		System.out.println("The addition of the two numbers are "+add);
		
		float subtract= input2-input1;
		System.out.println("The diffrenece of input1 from input2 is "+subtract);
		
		float multiply= input1*input2;
		System.out.println("The multipication of input1 and input2 is "+multiply);
		float divide= input2/input1;
		System.out.println("The division of input2 by input1 is "+divide);
		float remainder= input2%input1;
		System.out.println("The remainder is "+remainder );
	}

}
