// 8. Program to remove duplicate characters from String in Java?
package Assignment;
import java.util.Scanner;
public class RemDupCharStr 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		sc.close();
		for(int i=s.length()-1;i>=0;i--)
		{
			boolean dup=false;
			for(int j=i+1;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j))
					dup=true;
			}
			if(!dup)
				System.out.print(s.charAt(i));
		}
	}
}
