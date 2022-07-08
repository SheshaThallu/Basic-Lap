// Q6. Write a program to iterate TreeMap in java?
package CollectionsPractice;

import java.util.Map;
import java.util.TreeMap;

public class IteraTreeMap 
{
	public static void main(String[] args) 
	{
		Map<Integer,String> map = new TreeMap<Integer,String>();
		map.put(1, "Dinesh");
		map.put(2, "Prasad");
		map.put(3, "BTK");
		map.put(4, "Sushwanth");
		map.put(5, "Mahesh");
        for (Map.Entry<Integer, String> i : map.entrySet()) 
        {
            System.out.println(i.getKey() + " : " + i.getValue());
        }
	}
}