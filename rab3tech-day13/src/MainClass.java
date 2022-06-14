public class MainClass {

	public static void main(String[] args) {
		// create an object of Dog class
		Dog d=new Dog();
		    d.run();
		    d.walk();
	        //d.bark();
		    System.out.println("---------");
		    System.out.println("-----upcasting-----");
		  //reference variable of super class assigned to  object of sub class, called upcasting       
		    Dog b;
		        b=new BarkDog();  //upcasting     -- // Dog b=new BarkDog();
		        b.run();
		        b.walk();
		        //b.bark();
		        System.out.println("---creating an object of sub class----");    
		        BarkDog g=new BarkDog();
		        g.bark();
		        g.run();
		        g.walk();
		        
		        System.out.println("---------");
			    
		        
		        
		        System.out.println("-----downcasting -----"); 
			  
			    
			    Dog e;
			        e=new BarkDog();
			    BarkDog bd =(BarkDog)e;  
			            bd.bark();   //BarkDog
			            bd.run();    //Dog
			            bd.walk();  //Dog
			            System.out.println(bd.name); //Dog
			            System.out.println(bd.leg);  //Dog
			            System.out.println(bd.tail); //BarkDog
			            
			    Dog s;
			    	s=new SleepDog();
			    
			    	SleepDog  sd =(SleepDog)s;
			    	sd.bark();   //BarkDog
		            sd.run();    //Dog
		            sd.walk();  //Dog
		            sd.sleep();   //sleep
		            System.out.println(sd.name); //Dog
		            System.out.println(sd.leg);  //Dog
		            System.out.println(sd.tail); //BarkDog
		            
			    	
			            
		        
		      
		    

	}

}