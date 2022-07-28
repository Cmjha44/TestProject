package mapInterface;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		
		Map<String,String> map=new TreeMap<>();
		   
		   map.put("100","Chandra");
		   map.put("400","Ramesh");
		   map.put("600","null");
		   map.put("200","Chandra"); 
		   map.put("300","Reema");
		   map.put("null","Sukesh");
		   map.put("500","Lokesh");
		   
		   
		   System.out.println(map);
		

	}

}