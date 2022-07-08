/* 1 – Student Marks
Create a Class StudentMarks with a main method. Use Scanner to accept marks scored by Students.

Add the marks to an ArrayList. (two or more students can have the same marks)
Display the highest mark scored by the student.
Display the Average marks scored by the Students
Display the marks stored by the 3rd Student
Sort the marks and display the marks using Iterator.

Sample Input
Enter number of Students
4
Enter Marks
40 60 60 50 

Sample Output
Highest Marks : 60
Average Marks : 52.5
Marks   : 1-40 2-60 3-60 4-50
3rd Student marks : 60
Sorted : 1-40 2-50 3-60 4-60 */
package CollectionsPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class StudentMarks 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> list=new ArrayList<>();
		System.out.println("Enter number of Students");
		int n=sc.nextInt();
		int s=0;
		for(int i=0;i<n;i++)
		{
			list.add(sc.nextInt());
			s+=list.get(i);
		}
		sc.close();
		System.out.println("Highest Marks : "+Collections.max(list));
		System.out.println("Average Marks : "+((float)s/n));
		System.out.print("Marks   : ");
		for(int i=0;i<n;i++)
			System.out.print(i+1+"-"+list.get(i)+" ");
		System.out.println("\n3rd Student marks : "+list.get(2));
		System.out.print("Sorted : ");
		Collections.sort(list);
		Iterator<Integer> itr=list.iterator();
		int i=1;
		while(itr.hasNext())
		{
			System.out.print(i+"-"+itr.next()+" ");
			i++;
		}
	}
}
