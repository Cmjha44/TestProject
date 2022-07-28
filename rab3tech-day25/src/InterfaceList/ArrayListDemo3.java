package InterfaceList;

import java.util.ArrayList;
import java.util.Iterator;



public class ArrayListDemo3 {

	public static void main(String[] args) {
		ArrayList<String> list1=new ArrayList<>();
		//creating empty ArrayList and in this array we can add only String type of data
				  					list1.add("Haseena");
				  					list1.add("Mahesh");
				  					list1.add("Mahesh");//duplicacy is allowed here
				  					//list1.add(5);  // not allowed
				  					//list1.add('b'); // not allowed
				  					list1.add("Pratima");
				  					list1.add("Aman");
				  					System.out.println(list1);
				  					System.out.println("-----------");
				  					
				  					
				  					// iteration using for each loop
				  					for(String   temp:list1) {
				  						System.out.println(temp);
				  						
				  					}
				  					
				  					// using Iterator interface iterating data
				  					//Collection framework provides another interface iterator
				  					// by using iterator you can iterate any collection
				  					System.out.println("---iterator----");
				  					
				  		Iterator<String> itr=list1.iterator();	
				  		while(itr.hasNext()) 
				  			//hasnext()-->Returns true if the iteration has more elements. (In other words, returns true if next would return an element rather than throwing an exception.)
				  		    {
				  			System.out.println(itr.next());
				  			
	}

	}}
