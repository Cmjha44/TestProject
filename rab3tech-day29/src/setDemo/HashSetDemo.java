package setDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;



public class HashSetDemo {

	public static void main(String[] args) {
		//empty HashSet
		Set<Integer> set=new HashSet<>();
		// Set is Un-ordered
		// Set doesn't allow dupliccy
		
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(1);   
		
		set.add(1);  //duplicacy is not allowed
		System.out.println(set);
		System.out.println("______________________________-");
		
		List<Integer> list=new ArrayList<>();
		
		list.add(1);
		list.add(1);  // Duplicacy is not allowed
		list.add(2);
		list.add(3);
		list.add(4);
		
		
		System.out.println(list);
		System.out.println("-------------Search Operation--------------");
		
		System.out.println(set.contains("CAT")) ;
		
		System.out.println("--------------For Loop-------------");
		 for (Integer temp: set ) {
				
				System.out.println(temp);
	}
		 System.out.println("*************Iterator*******************");
		 Iterator  itr=set.iterator();
		 while(itr.hasNext()) {
			 System.out.println(itr.next());
			  
			 
		 }
		 System.out.println("***************Sorting******************");
		 Collections.sort(list);
		 System.out.println(list);

}
}