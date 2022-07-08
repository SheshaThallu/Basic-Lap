// 7. How to check if two arrays are equal or not?
import java.util.Scanner;
public class ArrEqOrNot 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Size of Array 1: ");
		int n=sc.nextInt();
		System.out.println("Array 1 Elements");
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		System.out.print("Size of Array 2: ");
		int m=sc.nextInt();
		int b[]=new int[m];
		System.out.println("Array 2 Elments");
		for(int i=0;i<m;i++)
			b[i]=sc.nextInt();
		sc.close();
		if(n==m)
		{
			boolean eq=true;
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<m;j++)
				{
					if(a[i]!=b[j])
					{
						eq=false;
						System.out.println("Not Equal");
						break;
					}	
				}
			}
			if(eq)
						System.out.println("Equal");
		}
		else
			System.out.println("Not Equal");
	}
}