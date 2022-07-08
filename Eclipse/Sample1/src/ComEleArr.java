// 6. How to find common elements from arrays?
import java.util.Scanner;
public class ComEleArr 
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
		System.out.println("Common Elements in Arrays");
		for(int i:a)
			for(int j:b)
				if(i==j)
				{
					System.out.print(i+" ");
					break;
				}
	}
}
