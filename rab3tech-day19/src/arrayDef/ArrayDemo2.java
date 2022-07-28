package arrayDef;

public class ArrayDemo2 {

	public static void main(String[] args) {
		int [] num=new int[4];
		// name of array is num
		//type of array is --> int
		
		num[0]=1;
		num[1]=2;
		num[2]=3;
		num[3]=4;
		
		
		System.out.println("print the data using *for loop*");
		for(int x=0; x<=num.length-1;x++)  //or for(int x=0; x<num.length;x++)
		
		{
			System.out.println(num[x]);
			
		}
	}

}
