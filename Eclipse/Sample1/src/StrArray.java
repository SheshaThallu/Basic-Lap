// 3. How to print an array of strings to the output console?
import java.util.Scanner;
public class StrArray 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String a[]=new String[n];
		for(int i=0;i<n;i++)
			a[i]=sc.next();
		sc.close();
		for(String i:a)
			System.out.println(i);
	}
}
