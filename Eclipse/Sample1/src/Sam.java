import java.util.Scanner;
public class Sam 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		sc.close();
		for(int i:a)
		{
			System.out.println(2*(int)Math.sqrt(i)-1);
		}
	}
}
