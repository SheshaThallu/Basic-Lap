// 1. Program to count vowels and consonants in given String in Java?
package Assignment;
import java.util.Scanner;
public class VowConCount 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		sc.close();
		String v="aeiou";
		int vc=0,cc=0;
		for(int i=0;i<s.length();i++)
		{
			boolean vowel=false;
			for(int j=0;j<v.length();j++)
			{
				if(v.charAt(j)==s.charAt(i))
				{
					vowel=true;
					break;
				}
			}
			if(vowel)
				vc++;
			else
				cc++;
		}
		System.out.println("Number of Vowels:"+vc);
		System.out.println("Number of Consonants:"+cc);
	}
}