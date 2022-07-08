// 1. How to search an element inside array?
import java.util.Scanner;
public class SearchElement 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int search_element=sc.nextInt();
		sc.close();
		boolean present=false;
		int i;
		for(i=0;i<n;i++)
		{
			if( search_element == a[i] )
			{
				present=true;
				break;
			}
		}
		if(present)
		{
			System.out.print("Searching element is present at index "+i);
		}
		else
		{
			System.out.print("Searching element is not present in the array");
		}
	}
}
