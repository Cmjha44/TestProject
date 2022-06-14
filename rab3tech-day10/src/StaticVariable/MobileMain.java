package StaticVariable;

public class MobileMain {

	public static void main(String[] args) {
		MobileVar mv=new MobileVar("Nokia","Pink");
		mv.info(); //nokia nokia   pink  pink
		MobileVar mv1=new MobileVar("Samsung","Blue");
		// 
		System.out.println("------------");
		
		mv1.info();  // samsung samsung blue blue
		System.out.println("------------");
		mv.info();   //nokia nokia blue blue 
		System.out.println("------------");
		
		MobileVar mv2=new MobileVar("Motorola","Yellow");
		mv2.info(); //Motorola Motorola Yellow Yellow
		System.out.println("------------");
		mv.info(); // Nokia Nokia Yellow Yellow
		System.out.println("------------");
		
		mv1.info(); // Samsung Samsung Yellow Yellow
		System.out.println("------------");
		
		MobileVar mv3=new MobileVar("Apple","Maroon");
		mv3.info(); //Apple  Apple   maroon maroon
		MobileVar mv4=new MobileVar("Myphone","Blue");
		// 
		System.out.println("------------");
		
		
	}

}
	

