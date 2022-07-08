// 10. Program to find the square root of a number without using a library function in Java?
package Assignment;
import java.util.Scanner;
public class SqareRoot 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		for(int i=1;i<=n;i++)
		{
			if(i*i==n)
			{
				System.out.println(i);
				break;
			}
		}
	}
}