import java.util.Scanner;

public class AvgCalc {

	public static void main(String[] args) {
		float input1;
		float input2;
		float input3;
		float input4;
		float result;
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Input the first number:");
		input1=scan.nextFloat();
		
		System.out.println("Input the second number:");
		input2=scan.nextFloat();
		
		System.out.println("Input the third number:");
		input3=scan.nextFloat();
		
		System.out.println("Input the fourth number:");
		input4=scan.nextFloat();
		
		result=(input1+input2+input3+input4)/4;
		System.out.println("The average of input1, input2,input3,input4 is "+result);
		
	}

}
