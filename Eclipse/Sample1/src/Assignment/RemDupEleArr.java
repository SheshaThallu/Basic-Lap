// 11.Program to remove duplicate elements from the array in Java?
package Assignment;
import java.util.Scanner;
public class RemDupEleArr 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		sc.close();
		for(int i=0;i<n;i++)
		{
			boolean dup=false;
			for(int j=i-1;j>=0;j--)
			{
				if(a[i]==a[j])
				{
					dup=true;
					break;
				}
			}
			if(!dup)
				System.out.println(a[i]);
		}
	}
}
