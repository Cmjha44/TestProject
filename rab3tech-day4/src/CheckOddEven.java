import java.util.Scanner;

public class CheckOddEven {

	public static void main(String[] args) {
		int input1;
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Input the number: ");
		input1=scan.nextInt();
		if (input1%2==0) {
			
			System.out.println("The value is Even");
		}
		
		else {
			System.out.println("The value is Odd");
		}
	}

}
