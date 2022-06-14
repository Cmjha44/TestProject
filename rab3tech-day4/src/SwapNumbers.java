import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) {
		int x,y,z;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("input the first number: ");
		x=scan.nextInt();
		System.out.println("input the second number: ");
		y= scan.nextInt();
		System.out.println("The numbers before swap x= "+x+" and y= "+y);
		z=x;//put value of x in z
		x=y;//put value of y in x which is swap
		y=z;//put value of old x which is z in y which is swap
		System.out.println("The numbers after swap x= "+x+" and y= "+y);
	}

}
