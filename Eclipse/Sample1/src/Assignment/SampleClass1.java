package Assignment;

import java.util.Arrays;
import java.util.Scanner;

public class SampleClass1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		sc.close();
		Arrays.sort(a);
		System.out.println(a[n-1]+a[0]);
	}
}
