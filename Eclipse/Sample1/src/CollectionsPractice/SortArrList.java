// Q5. Write a program to sort ArrayList in descending order?
package CollectionsPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortArrList 
{
	public static void main(String[] args) 
	{
		List<Integer> ls=new ArrayList<Integer>();
		ls.add(7);
		ls.add(8);
		ls.add(7);
		ls.add(9);
		ls.add(4);
		
		Collections.sort(ls,Collections.reverseOrder());;
		System.out.println(ls);
	}
}
