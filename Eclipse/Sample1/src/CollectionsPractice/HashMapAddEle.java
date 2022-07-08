// Q4. Write a program to add elements to the HashMap given the key and value data type is String and Integer respectively?
package CollectionsPractice;

import java.util.HashMap;
import java.util.Map;

public class HashMapAddEle 
{
	public static void main(String[] args) 
	{
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("Indra",200000);
		map.put("Sai",150000);
		map.put("Ram",200000);
		map.put("Chinny",150000);
		map.put("Rudra",150000);
		
		System.out.println(map);
	}
}
