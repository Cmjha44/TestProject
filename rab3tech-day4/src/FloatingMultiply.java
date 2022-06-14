import java.util.Scanner;

public class FloatingMultiply {

	public static void main(String[] args) {
		
		float input1;
		float input2;
		float result;
		Scanner scan=new Scanner(System.in);
		System.out.println("input the first number: ");
		input1=scan.nextFloat();
		System.out.println("input the second number: ");
		input2= scan.nextFloat();
		result=input1*input2;
		System.out.println("The multiplication of input1 and inpuut2 is "+result);
		

	}

}
