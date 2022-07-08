package CollectionsPractice;

import java.util.ArrayList;
import java.util.Collections;
public class RevArray 
{
	public static void main(String[] args)
	{
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(78);
		l.add(15);
		l.add(58);
		l.add(53);
		l.add(95);
		System.out.println(l);	
		Collections.reverse(l);
		System.out.println(l);
	}
}
