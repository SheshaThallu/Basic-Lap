// 2. How to reverse an array?
import java.util.Scanner;
public class ReverseArray 
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
		sc.close();
		for(int i=0,j=n-1;i<j;i++,j--)
		{
			int t=a[i];
			a[i]=a[j];
			a[j]=t;
		}
		for(int i:a)
			System.out.print(i+" ");
	}
}
