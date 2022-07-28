package abstractKeyword;

public class MainClass {

	public static void main(String[] args) {
		//Boss bs=new Boss (); we can not  create an object of abstract type of class
		
		//but we can create a refrence of it.
		//Boss bs;
		
		Junior jb=new Junior();
		System.out.println("********two values are coming from super class**************");
		
		
		System.out.println("Age="+jb.age);  //Data from Super class
		System.out.println("**********************");
		
		
		System.out.println("Age="+jb.name);  ////Data from Super class
		System.out.println("****Given below value will come from sub class******************");
		
		System.out.println("Age="+jb.year);  ////Data from Sub class
		System.out.println("**********************");
		
		jb.study();
		jb.study1();
	}

}
