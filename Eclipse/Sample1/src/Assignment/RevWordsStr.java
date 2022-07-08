// 5. Program to reverse words in a given String in Java?
package Assignment;
import java.util.Scanner;
public class RevWordsStr 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		sc.close();
		for(int i=s.length()-1;i>=0;i--)
		{
			if(s.charAt(i)==' ' || i==0)
			{
				for(int j=(i==0?i:i+1);j<s.length() && s.charAt(j)!=' ';j++)
				{
					System.out.print(s.charAt(j));
				}
				System.out.print(" ");
			}
		}
	}
}
