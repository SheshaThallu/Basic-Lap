//7. Write a program in Java to input 5 numbers from keyboard and find their sum and average.
import java.util.Scanner;
public class SumAvg 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		int s=0;
		for(int i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
			s+=a[i];
		}
		sc.close();
		System.out.println("Sum:"+s);
		System.out.print("Avg:"+((float)s/5));
	}
}
