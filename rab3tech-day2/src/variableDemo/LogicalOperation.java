package variableDemo;

public class LogicalOperation {

	public static void main(String[] args) {
		//&& -AND operator -think as multiplication
		//||- OR operator think as +
		//! - Inverse
		
		int a=10, b=5, c=20;
		
		System.out.println((a<b)&& (b<c));
		System.out.println((a<b) || (b<c));
		System.out.println(!(b>a));
	}

}
