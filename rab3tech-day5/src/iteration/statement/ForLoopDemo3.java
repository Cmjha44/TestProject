package iteration.statement;

public class ForLoopDemo3 {

	public static void main(String[] args) {
		// want to write a code for printing table from 2 to 10
		
		for (int i = 2; i <= 15; i++) {
	          //2    3   4  5  6 7 8 9 10
				for (int j = 1; j <= 15; j++) {
					
					System.out.println(j*i);
					//2
					//1*2
					//2*2
					//3*2
					//--
					//10*2
					
					//3
					//1*3
					//2*3
					//3*3
					//--
					//10*3
							
				}
				System.out.println("###########");
			}
		
		}
	}