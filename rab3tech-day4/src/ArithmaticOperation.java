import java.util.Scanner;

public class ArithmaticOperation {

	public static void main(String[] args) {
		float input1;
		float input2;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Input the first number:");
		input1=scan.nextFloat();
		
		System.out.println("Input the second number:");
		input2=scan.nextFloat();
		
		float add=input1+input2;
		System.out.println("The addition of the two numbers are  "+add);
		
		float subtract=input2-input1;
		System.out.println("The difference of input1 from input2 is " +subtract);
		
		float multiply=input1*input2;
		System.out.println("The multiplication of input1 and input2 "+multiply);
		
		float divide=input2/input1;
		System.out.println("The division of input2 by input1 is "+divide);
		
		float remainder=input1%input2;
		System.out.println("The remainder  is "+remainder);
		
		
		
				
		
	}

}
