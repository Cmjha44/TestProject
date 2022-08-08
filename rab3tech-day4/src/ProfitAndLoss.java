import java.util.Scanner;

public class ProfitAndLoss {

	public static void main(String[] args) {
		float cp;
		float sp;
		float result;
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Input the cost price:");
		cp=scan.nextFloat();
		
		System.out.println("Input the selling price");
		sp=scan.nextFloat();
		
		result=sp-cp;
		
		if (result>0) {
			System.out.println("Owner is in Profit");
			
		}
		else if(result==0) {
		System.out.println("Neither Profit nor loss");

	}
		else{
			
			System.out.println("Owner is in Loss");
		}

}
}
