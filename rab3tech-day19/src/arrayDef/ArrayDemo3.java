package arrayDef;

public class ArrayDemo3 {

	public static void main(String[] args) {
		 int [] num=new int[6];
		 
		 num[0]=30;
		 num[1]=60;
		 num[2]=20;
		 num[3]=10;
		 num[4]=80;
		 num[5]=70;
		 
		 //perform sum operation
		 System.out.println("Sum operation on given array");
		 int sum=0;
		 for(int x=0;x<num.length; x++) {
			 sum=sum+num[x];  //==> 3=0+3  ==>9=3+6   ==>12=11+1
			 
		 }
		 System.out.println("Total=="+sum);
		 System.out.println("-----------------------------");
		 //we can update the data also in array
		 num[3]=90;
		 num[4]=85;
		 System.out.println("After updating print the updated value---");
		 for (int a=0;a<num.length;a++)  {
			 System.out.println(num[a]);
		 }
		 System.out.println("Sum operation on given array");
			int sum1=0;
			for(int x=0;x<num.length;x++ ) {
				sum1=sum1+num[x];  //==> 3=0+3  ==> 9=3+6   ==> 11=9+2   ==> 101==11+90   ==> 101=101+0
			// 108=101+7
			}
			System.out.println("Total =="+sum1); 

		
	}
			
}
