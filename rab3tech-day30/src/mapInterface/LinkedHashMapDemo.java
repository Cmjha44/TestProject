package mapInterface;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		
		//LinkedHashMap<String,String>  map=new LinkedHashMap<>();
		Map<String,String>  map=new LinkedHashMap<>();
		 	map.put("100","Zaved");
		   map.put("200","Zaved"); 
		   map.put("300","Seema");
		   map.put("400","Ramesh");
		   map.put("null","null");
		   map.put("500","Lokesh");
		   map.put("600","null");
		   
		   System.out.println(map);
		
		
		
	}

}