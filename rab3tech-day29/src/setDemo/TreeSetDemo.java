package setDemo;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	
		
		
		public static void main(String[] args) {
			Set<Integer> set=new TreeSet<>();
										//Set is un-ordered
										//Set does not allow duplicacy
										//Internally TreeSet uses R-B-Tree feature
						 set.add(1);
						 set.add(2);
						 set.add(3);
						 set.add(4);
						 set.add(1);//duplicacy is not allowed
						 System.out.println(set);
						 System.out.println("---------------");
			
			Set<String> set2=new TreeSet<>();
			set2.add("Raman");
			set2.add("Chaman");
			set2.add("Shreya");
			set2.add("Preeti");
			set2.add("Deepti");
			set2.add("Preeti");
				 System.out.println(set2);
				 System.out.println("-------------Search Operation--------------");
					
					System.out.println(set2.contains("Preeti")) ;
					
					System.out.println("--------------For Loop-------------");
					 for (String temp: set2 ) {
							
							System.out.println(temp);
				
	}
					 System.out.println("*************Iterator*******************");
					 Iterator<String> itr=set2.iterator();
					 while(itr.hasNext()) {
						 System.out.println(itr.next());

}}}
