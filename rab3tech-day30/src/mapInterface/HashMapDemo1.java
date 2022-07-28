package mapInterface;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//All the rules which are applied in set, going to be applied in map also
//..because set internally uses map
//key must be unique


public class HashMapDemo1 {

	public static void main(String[] args) {
		//HashMap<String,String> map=new HashMap<>();
				Map<String,String> map=new HashMap<>();
								   map.put("100","Chandra");
								   							//  map.put("100","Zaved");duplicacy is not allowed in key column
								   map.put("200","Raman"); //duplicacy is allowed in value column
								   map.put("300","Reema");
								   map.put("400","Mohan");
								   map.put("null","null");
								   map.put("500","Chandra");
								   map.put("600","null");
								 
								   System.out.println(map);
								   System.out.println("------------");
								   
								   String abc=map.put("200","Radhe");
								   System.out.println(map);
								   
								   System.out.println("-----print the old data---");
								   System.out.println(abc); //zaved  
								   
								   System.out.println("------------");
								   
								   Set<String> keys=map.keySet();
								   for(String tempaa:keys   ) {
									   System.out.println(tempaa+ "   "+map.get(tempaa));
									   
								   }
								   System.out.println("---print only value data----");
								   System.out.println(map.values());

	}

}
