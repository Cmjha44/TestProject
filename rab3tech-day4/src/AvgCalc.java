import java.util.Scanner;

public class AvgCalc {

	public static void main(String[] args) {
		
		float input1;
		float input2;
		float input3;
		float result;
		Scanner scan=new Scanner(System.in);
		System.out.println("input the first number: ");
		input1=scan.nextFloat();
		System.out.println("input the second number: ");
		input2= scan.nextFloat();
		System.out.println("input the third number: ");
		input3= scan.nextFloat();
		result=(input1+input2+input3)/3;
		System.out.println("The average of input1,inpuut2 and input3 is "+result);

	}

}
