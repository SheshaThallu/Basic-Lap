// Q1. Write a program to convert List to Array.
package CollectionsPractice;

import java.util.ArrayList;
import java.util.List;

public class ListToArray 
{
	public static void main(String[] args) 
	{
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(5);
		list.add(9);
		list.add(7);
		
		Object[] a=list.toArray();
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
	}
}
