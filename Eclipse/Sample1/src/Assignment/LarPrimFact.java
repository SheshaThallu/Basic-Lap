// 4. Program to find largest prime factors of a given integer in Java?
package Assignment;
import java.util.Scanner;
public class LarPrimFact 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		for(int i=n;i>1;i--)
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
					break;
				}
			}
		}
	}
}
