// Q2. Given an element write a program to check if element(value) exists in ArrayList?
package CollectionsPractice;

import java.util.ArrayList;
import java.util.List;

public class CheckEle 
{
	public static void main(String[] args) 
	{
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(5);
		list.add(9);
		list.add(7);
		
		System.out.println(list.contains(9));
	}
}
