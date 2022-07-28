import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DogMain {

	public static void main(String[] args) {
		
		Dog dog1=new Dog(5,"Tiger","Yellow");
		Dog dog2=new Dog(3,"Ronny","Red");
		Dog dog3=new Dog(4,"Tommy","Black");
		Dog dog4=new Dog(5,"Tiger","Yellow");
		
		List<Dog> list=new ArrayList<>();//empty ArrayList
				  list.add(dog1);
				  list.add(dog2);
				  list.add(dog3);
				  list.add(dog4);
				  
				  //searching dog4
				  System.out.println(list.contains(dog4));
				  //sorting (here elements are sorted by age)
				  Collections.sort(list);
				  System.out.println(list);
					System.out.println("*************************************************************");		 
				  System.out.println("----sort on name based ------");
		      // sort the element on the basis of name
				  Collections.sort(list, new SortingOnName());
				  System.out.println(list);
				  
				  
					System.out.println("*************************************************************");			  
				  System.out.println("----sort on elements on the basis of color ------");
					// sort the element on the basis of name
							  Collections.sort(list, new SortingDogOnColorBased());
							  System.out.println(list);
						System.out.println("*************************************************************");
							  //equals() 
							System.out.println(dog1.equals(dog4));//false---(HERE WORKS ON REFERENCE BASED)
			
			//after overriding equals(), dog1 and dog4 will work on the basis of contents
			//that's y both will be equal and result will be--TRUE
							
							System.out.println("***************************************************************")	;
							 System.out.println(dog1.hashCode());
							 System.out.println(dog4.hashCode());
							 
		//AFTER OVERRIDING HASHCODE(), BOTH dog1 and dog4 will return same Hash Code.
		//but before overriding hashCode(), it will return diferent-2 hashCode()
	}}