package hashCode;

import java.util.ArrayList;
import java.util.List;

public class DogMain {

	public static void main(String[] args) {
		Dog d1=new Dog(5,"Tommy");//1982791261
		Dog d2=new Dog(3,"Jacky");
		Dog d3=new Dog(2,"Pushy");
		Dog d4=new Dog(5,"Tommy"); //1562557367
		
		List<Dog> list=new ArrayList<>();
				  list.add(d1);
				  list.add(d2);
				  list.add(d3);
				  list.add(d4);
				  
				  System.out.println(list);
				  
			System.out.println(d1.hashCode()+" "+d4.hashCode());
			System.out.println("-------------");
			System.out.println(d2.hashCode());
			System.out.println(d3.hashCode());
			System.out.println("-------------");
			System.out.println(d1.equals(d4));//false-->True


	}

}
