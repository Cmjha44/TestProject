import java.util.Scanner;

public class ProfitAndLoss {

	public static void main(String[] args) {
		float cp;
		float sp;
		float result;
		Scanner scan=new Scanner(System.in);
		System.out.println("input the cost price: ");
		cp=scan.nextFloat();
		System.out.println("input the selling price: ");
		sp= scan.nextFloat();
		result=sp-cp;
		if(result>0) {
			System.out.println("Owner is in profit ");
			
		}
		else if (result==0){
			System.out.println("Neither profit nor loss");
			
		}
		else {
			System.out.println("Owner is in loss");
			
		}

		

	}

}
