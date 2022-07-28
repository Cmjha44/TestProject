package stringDemo;

public class stringDemo {

	public static void main(String[] args) {
		String str="Amit";
		String str1="Amit";
		System.out.println(str==str1);   //True  (reference)
		
		
		/*if string is same result will be "TRue" , if new string it will be false */
		
		System.out.println(str.equals(str1));  //True   (Content)
		
		String str2= new String("Amit");
		String str3= new String ("Amit");
		System.out.println(str2==str3);  //False (reference method)
		System.out.println(str2.equals(str3));    //True (content)
	}

}
