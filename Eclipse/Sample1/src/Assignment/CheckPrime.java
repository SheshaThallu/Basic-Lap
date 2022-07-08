// 12.Program to check if given number is prime in Java?
package Assignment;
import java.util.Scanner;
public class CheckPrime 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		if(!checkPrime(n) || n < 2)
			System.out.println("Not Prime");
		else
			System.out.println("Prime");
	}

	static boolean checkPrime(int n) 
	{
		int i=2;
		while(i<=Math.sqrt(n))
		{
			if(n%i==0)
				return false;
			i++;
		}
		return true;
	}
}