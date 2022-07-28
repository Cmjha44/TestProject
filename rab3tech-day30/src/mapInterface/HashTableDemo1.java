package mapInterface;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//All the rules which are applied in set, going to be applied in map also
//..because set internally uses map
//key must be unique


public class HashTableDemo1 {

	public static void main(String[] args) {
		HashMap<String,String> map=new HashMap<>();
		Map<String,String> map1=new HashMap<>();
						   map1.put("100","Zaved");
						 //  map.put("100","Zaved");duplicacy is not allowed in key column
						   map1.put("200","Zaved"); //duplicacy is allowed in value column
						   map1.put("300","Seema");
						   map1.put("400","Ramesh");
						   map1.put("null","null");
						   map1.put("500","Lokesh");
						   map1.put("600","null");
						 
						   System.out.println(map1);
						   System.out.println("------------");
						   
						   String abc=map1.put("100","Arun");
						   System.out.println(map1);
						   
						   System.out.println("-----print the old data---");
						   System.out.println(abc); //zaved  
						   
						   System.out.println("------------");
						   
						   Set<String> keys=map1.keySet();
						   for(String tempaa:keys   ) {
							   System.out.println(tempaa+ "   "+map1.get(tempaa));
							   
						   }
						   System.out.println("---print only value data----");
						   System.out.println(map1.values());

	}

}
