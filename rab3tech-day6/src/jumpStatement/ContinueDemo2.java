package jumpStatement;

public class ContinueDemo2 {

	public static void main(String[] args) {

		for(int x=1;x<=10;x++)  {
		
		if((x==5)  ||
		
		(x==3)) {
			
			continue;
			// if you want to skip iteration number 5 and 3, then use continue keyword
		}
		System.out.println(x);
	
	}

			}
		}