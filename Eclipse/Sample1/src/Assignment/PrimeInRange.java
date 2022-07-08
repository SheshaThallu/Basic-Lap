// 3. Program to print Prime numbers from 1 to 100?
package Assignment;

public class PrimeInRange 
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=100;i++)
		{
			int c=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
					c++;
			}
			if(c==2)
				System.out.println(i);
		}
	}
}
