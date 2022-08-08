import java.util.Scanner;

public class FloatingMultiply {

	public static void main(String[] args) {
		float input1;
		float input2;
		float input3;
		float input4;
		
		Scanner scan=new Scanner(System.in);
				
				System.out.println("Input the first number: ");
				input1=scan.nextFloat();
				
				System.out.println("Input the second number: ");
				input2=scan.nextFloat();
				
				System.out.println("Input the second number: ");
				input3=scan.nextFloat();
				
				System.out.println("Input the second number: ");
				input4=scan.nextFloat();
				
				float result = input1*input2*input3*input4;
				
				System.out.println("The multiplication if input1, input2, input3 and input4 "+result);
	}

}
