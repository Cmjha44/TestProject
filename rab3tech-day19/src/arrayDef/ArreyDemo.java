package arrayDef;

public class ArreyDemo {

	public static void main(String[] args) {
		// in simple variable we can store only one value at a moment
		// int x=20; String name="Nagen"; Char ch='m';  
		//multi values at a moment---> by using Array
		// An Array is a collection of similar data type. ( eg.- int, char, String only one type is executed so use only one)
		
		//Syntax of an array 
		//int num[]=new int[8];   // 8 elements (all of these 8 elements will be int type)
		
		//int[] num=new int[8];  or
		//int [] num=new int[8];  or
		//int []num=new int[8];  or
		
		//insert a data in an array
		
		int num[]=new int[5];
			num[0]=22;
			num[1]=33;
			num[2]=99;
			num[3]=44;  // duplicacy is also allowed
			num[4]=11;
			
			System.out.println("First element of an array: "+num[0]);
			System.out.println("Second element of an array: "+num[1]);
			System.out.println("Third element of an array: "+num[2]);
			System.out.println("Fourth element of an array: "+num[3]);
			System.out.println("Fifth element of an array: "+num[4]);

}}
