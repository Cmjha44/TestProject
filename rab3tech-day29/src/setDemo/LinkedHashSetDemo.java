package setDemo;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;



public class LinkedHashSetDemo {

	public static void main(String[] args) {
		// empty HashSet
		Set<Integer> set=new LinkedHashSet<>();      // set is un-ordered 
													//Set doesn't allow duplicacy
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(1);   //Duplicacy is not allowed
		
		
		System.out.println(set);
		System.out.println("__________________________________-");
		
		Set<String>  set2=new LinkedHashSet<>();
		
		set2.add("Raman");
		set2.add("Chaman");
		set2.add("Shreya");
		set2.add("Preeti");
		set2.add("Deepti");
		
		System.out.println(set2);
		
		System.out.println("-------------Search Operation--------------");
		
		System.out.println(set2.contains("Preeti")) ;
		
		System.out.println("--------------For Loop-------------");
		 for (Integer temp: set ) {
				
				System.out.println(temp);
	}
		 System.out.println("*************Iterator*******************");
		 Iterator<Integer> itr=set.iterator();
		 while(itr.hasNext()) {
			 System.out.println(itr.next());
			 
			 
		 }
				
		

	}

}
