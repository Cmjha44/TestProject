package string.demo;

public class StringDemo1 {

	public static void main(String[] args) {
		String s1 = "Saurabh";
		// using String literal(inside Intern Pool)
		String s2 = "Aasish";
		
		String s3 = new String("Ramdeep");
		
		System.out.println(3+4+s1); //7Saurabh
		System.out.println(s1+1+2+3);    // Aasish123
		System.out.println(2+4+5+s1+1+2+3); //11Saurabh123
		System.out.println(1+2+3+s1+1+2+3+s2); /*6Saurabh123Aasish*/
		System.out.println((1+2+3+s1)+(1+2+3+s2)); //6 Saurabh6Aasish
		System.out.println(s1+s2); //using String literals-- adding two strings
		System.out.println("_____________________");
		//UPPER CASE CONVERSION METHOD
		String a=s1.toUpperCase();//covert string from lower to upper case
		 System.out.println(a); //SAGAR
		 System.out.println(s1.toUpperCase()); //Aasish
		 
	      		 System.out.println("_____________________");
		
	      		 //LENGTH METHOD
		 System.out.println(s1.length());  //6
		 //find length of string(counting will start
		
		 System.out.println(s3.length()); //8
		 //find length of string(counting will start from 1) */
		 System.out.println("_____________________");
		
		
		 //charAt METHOD
		 char ch=s1.charAt(4);// Saurabh   0 1 2 3 4
		 System.out.println(s1.charAt(1));     //S
		System.out.println(s1.charAt(2));      //u
		
		
		
		System.out.println("_____________________");
		
	
		
		//SUBSTRING METHOD
		String str1 = "Agile and scrum";
		String substr = str1.substring(3, 5);//5-1=4 ---(3  to 5)
		 System.out.println("Sub String is===" + substr);   //ile and
		
		 System.out.println("_____________________");

	}

}
