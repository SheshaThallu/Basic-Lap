// 13.Program to check if a number is binary in Java?
package Assignment;
import java.util.Scanner;
public class BinaryOrNot 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		while(n!=0)
		{
			int t=n%10;
			if(t!=1 && t!=0)
			{
				System.out.println("Not Binary");
				break;
			}
			n/=10;
		}
		if(n==0)
			System.out.println("Binary");
	}
}
