
public class MethodDemo {
//define /declare method
	static int sum(int num1,int num2) {
		int result=num1+num2;
		return result;
		
	}
	
	//this is definition of magic method
	static int magic(int input) {
		
		int result=9033 % input;   //0
		return result+1;   //0+1
	}
	
	public static void main1(String[] args) {
	magic(3);
	
	
	confusing();
	

	}

	//define /declare method
	
	static float foo() {
		//not taking any parameter, but returning something
		return 1923.0f;
	}
	
	static void confusing()  {
		//taking any parameter??   no
		// Not returning anything
		System.out.println("So confusing");
		System.out.println("So confusing");
	}
	
	static void  printa(int pp)  {
		//this method does not return anything
		//Just do your job
		System.out.println("-----------------");
		System.out.println("-------"+pp+"------");
		System.out.println("------------------"); 
			
		}
		
		public static void main(String[] args)  {
			// who call a method?? main method
			
			int wow=magic(1);    //WOW=1
			System.out.println(wow);  //1
			wow=magic(2);
			System.out.println(wow);//2
			
			
			printa(2);
			
			confusing();
				System.out.println("-- - - sum method------") ;
				System.out.println("sum of num1 and num2 ="+sum(34,26));
				System.out.println("foo="+foo());
				
						
	}
	
}
