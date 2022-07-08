// 8. Write a program in Java to display the multiplication table of a given integer.
import java.util.Scanner;
public class MulTable 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		for(int i=1;i<=10;i++)
			System.out.println(n+" * "+i+" = "+n*i);
	}
}
