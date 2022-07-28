package stringDemo;

public class StringDemo4 {

	public static void main(String[] args) {
		StringBuilder s1=new StringBuilder("Hanu");
		s1.append("man");  //append the data in existing s1 append adds to existing word
		System.out.println(s1);  //123456789
		System.out.println("--perform delete operation---");
		s1.delete(0,5);  
		System.out.println(s1); 
		
	System.out.println("--Perform reverse operation---");
	System.out.println(s1.reverse());  
	
	
	

}}
