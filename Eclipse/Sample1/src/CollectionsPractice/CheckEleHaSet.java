// Q3. Given an element write a program to check if element exists in HashSet?
package CollectionsPractice;

import java.util.HashSet;
import java.util.Set;

public class CheckEleHaSet 
{
	public static void main(String[] args) 
	{
		Set<Integer> values = new HashSet<Integer>();
		values.add(7);
		values.add(8);
		values.add(5);
		values.add(1);
		
		System.out.println(values.contains(5));
	}
}
