package CollectionsPractice;
import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
public class Test1 
{
	public static void main(String[] args) 
	{
		Emp e1 = new Emp(1, "Vamsi", "Sales");
		Emp e2 = new Emp(2, "Venu", "Developer");
		Emp e3 = new Emp(3, "Dinesh", "Testing");
		
		List<Emp> list = new ArrayList<>();
		list.add(e1);
		list.add(e2);
		list.remove(1);
		list.add(e3);
		list.add(1, e2);
		System.out.println(list);
		System.out.println(list.size());
		for(int i=0;i<list.size();i++)
			System.out.println(list.get(i));
		Iterator<Emp> itr=list.iterator();
		while(itr.hasNext())
		{
			Emp e=itr.next();
			System.out.println(e.id+" "+e.name+" "+e.des);
		}
		System.out.println(list.get(1).id);
		
		System.out.println("================================================");
		
		Set<Emp> set = new HashSet<>();
		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e3);
		set.add(e1);
		System.out.println(set);
		System.out.println(set.size());
		set.remove(e3);
		System.out.println(set.size());
		System.out.println(set.contains(e3));
		System.out.println(set.getClass());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
