package InterfaceList;

import java.util.ArrayList;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		// creating empty ArrayList
				ArrayList<Comparable> list=new ArrayList();
				//by using add() method we can add elements in empty ArrayList
						  list.add("Seema");
						  list.add("Zaved");
						  list.add(5);
						  list.add(5);
						  list.add('m');
						  System.out.println(list);
						  System.out.println("---------");
						  
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
											
	}

}
