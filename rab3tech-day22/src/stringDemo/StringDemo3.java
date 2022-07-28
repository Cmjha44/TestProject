package stringDemo;

public class StringDemo3 {

	public static void main(String[] args) {
		String str="Amit";
		String str1="Amit";
		System.out.println(str.compareTo(str1));  //0
		
		
		String str2="AmitSi";
		String str3="Amit";
		System.out.println(str2.compareTo(str3)); //za-->1(z)+1(a)+1(c)-->+3
		
		String str4="Namast";
		String str5="Namaste";
		System.out.println(str4.compareTo(str5)); //lo-->-1(1)+1(a)+1-->-1
		
		
		
		
	}

}
