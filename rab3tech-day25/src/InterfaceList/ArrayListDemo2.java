package InterfaceList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo2 {

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
				  					
				ArrayList<Integer> list2=new ArrayList<>();
		//creating empty ArrayList and in this array we can add only int type of data
									list2.add(5);
									list2.add(15);
									list2.add(13);
									list2.add(4);
									list2.add(39);
									list2.add(456);
									System.out.println(list2);
									
									System.out.println("---search operation on list2-----");
									System.out.println(list2.contains(13)); //true
									System.out.println(list2.contains(99)); //false
									System.out.println(list1.contains("Pratima"));//true
									
			ArrayList<Character> list3=new ArrayList<>();
									//creating empty ArrayList and in this array we can add only char type of data
																list3.add('C');
																list3.add('H');
																list3.add('A');
																list3.add('N');
																list3.add('D');
																list3.add('R');
																list3.add('A');
																System.out.println(list3);	
																
																System.out.println("---search operation on list3-----");
																System.out.println(list3.contains(13)); //False
																System.out.println(list3.contains('C')); //True
																
																
																System.out.println("        ****************************        ");
																
			System.out.println("---Sorting operation on list3-----");
			Collections.sort(list3);
			System.out.println(list3);	
			
																System.out.println("        ****************************        ");
																
																
			System.out.println("---Sorting operation on list2-----");
			Collections.sort(list2);
			System.out.println(list2);
																System.out.println("        ****************************        ");
			System.out.println("---Sorting operation on list1-----");
			Collections.sort(list1);
			System.out.println(list1);
									
									
									
	
		
	}

}
