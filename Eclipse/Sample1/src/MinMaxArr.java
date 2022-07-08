// 4. How to search the minimum and the maximum element in an array?
import java.util.Scanner;
public class MinMaxArr 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		sc.close();
		int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
		for(int i=0;i<n;i++)
		{
			if(a[i]<min)
				min=a[i];
			else
				max=a[i];
		}
		System.out.println("Minimum = "+min);
		System.out.println("Maximum = "+max);
	}
}
