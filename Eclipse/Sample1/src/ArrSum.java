// 8. Write a Java program to sum values of an array.
import java.util.Scanner;
public class ArrSum 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int s=0;
		for(int i=0;i<n;i++) 
		{
			a[i]=sc.nextInt();
			s+=a[i];
		}
		sc.close();
		System.out.println("Sum:"+s);
		System.out.println("Avg:"+s/n);
	}
}
