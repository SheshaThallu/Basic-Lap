// 6. Program to find all prime factors of a number in Java?
package Assignment;
import java.util.Scanner;
public class AllPrimeFac 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		for(int i=2;i<=n;i++)
		{
			if(n%i==0) 
			{
				int c=0;
				for(int j=1;j<=i;j++)
				{
					if(i%j==0)
						c++;
				}
				if(c==2)
				{
					System.out.println(i);
				}
			}
		}
	}
}
