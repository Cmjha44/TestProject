package thisDemo;

public class ThisDemoMain2 {

	public static void main(String[] args) {
		ThisDemo t=new ThisDemo();
		System.out.println(t.num1);  //0;
		System.out.println(t.str);    //null
		System.out.println("*******************");
		
		
		
		ThisDemo td=new ThisDemo("Shyam",22);
		System.out.println(td.num1);  //22;
		System.out.println(td.str);    //Shyam
		System.out.println("*******************");
		
		
		ThisDemo td1=new ThisDemo(28,"Priya");
		System.out.println(td1.num1);  // Priya
		System.out.println(td1.str);    //28
		System.out.println("*******************");
		
		
		ThisDemo td2=new ThisDemo(30,"Apple");
		System.out.println(td2.num1);  // Apple
		System.out.println(td2.str);    //30
		
		
	}

}
