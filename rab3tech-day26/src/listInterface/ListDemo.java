package listInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class ListDemo {

	public static void main(String[] args) {
		
		ArrayList<String> list1=new ArrayList<>();
		//creating empty ArrayList and in this array we can add only String type of data
				  					list1.add("Dell");
				  					list1.add("Acer");
				  					list1.add("Apple");//duplicacy is allowed here
				  										//list1.add(5);  // not allowed
				  										//list1.add('b'); // not allowed
				  					list1.add("Lenovo");
				  					list1.add("Hp");
				  					System.out.println(list1);
				  					System.out.println("-----------");
				  					
				ArrayList<Integer> list2=new ArrayList<>();
															//creating empty ArrayList and in this array we can add only int type of data
									list2.add(1);
									list2.add(2);
									list2.add(3);
									list2.add(4);
									list2.add(5);
									list2.add(333);
									System.out.println(list2);
									
									System.out.println("---search operation on list2-----");
									System.out.println(list2.contains(333));        //true
									System.out.println(list2.contains(99));         //false
									System.out.println(list1.contains("Apple"));     //true
									
			ArrayList<Character> list3=new ArrayList<>();
									//creating empty ArrayList and in this array we can add only char type of data
																list3.add('N');
																list3.add('I');
																list3.add('M');
																list3.add('I');
																list3.add('S');
																list3.add('H');
																list3.add('A');
																System.out.println(list3);	
																
																System.out.println("---search operation on list3-----");
																System.out.println(list3.contains(1)); //False
																System.out.println(list3.contains('M')); //True
																
																
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
		
		
		
											//ArrayList<String>  list=new ArrayList<>();
											//LinkedList<String>  list1=new LinkedList<>();
											//Vector<> list=new Vector<>();
											//Stack<String> list=new Stack<>()
				
				System.out.println("----ArrayList-----");
				List<String>  list=new ArrayList<>();
					list.add("Dell");
					list.add("Acer");
					list.add("Apple");
					list.add("Lenovo");
					System.out.println(list);
	
					System.out.println("        ****************************        ");
					
					System.out.println("----LinkedList----");
					List<String>  list4=new LinkedList<>();
							list4.add("Dell");
							list4.add("Acer");
							list4.add("Apple");
							list4.add("Lenovo");
							System.out.println(list2);
							
							System.out.println("        ****************************        ");
				
					System.out.println("----vector----");
						List<String> list5=new Vector<>();
						list5.add("Dell");
						list5.add("Acer");
						list5.add("Apple");
						list5.add("Lenovo");
						System.out.println(list3);
						
						
						System.out.println("        ****************************        ");
						
						
						System.out.println("---Stack-----");
						List<String> list6=new Stack<>();
						list6.add("Dell");
						list6.add("Acer");
						list6.add("Apple");
						list6.add("Lenovo");
						System.out.println(list6);
						System.out.println("-----------");
						
						
						
						System.out.println("---Sorting operation on list3-----");
						Collections.sort(list);
						System.out.println(list);	
						
																			System.out.println("        ****************************        ");
																			
																			
																			System.out.println("---Sorting operation on list4-----");
																			Collections.sort(list4);
																			System.out.println(list4);	
																			
																								System.out.println("        ****************************        ");
																								System.out.println("---Sorting operation on list5-----");
																								Collections.sort(list5);
																								System.out.println(list5);	
																								
																					System.out.println("        ****************************        ");
																					System.out.println("---Sorting operation on list6-----");
																					Collections.sort(list6);
																					System.out.println(list6);	
																					
																																		System.out.println("        ****************************        ");
																																		
																																					
																																
																			
	}

}
