/* Q-  Create a class with methods-

reverse a string
2. reverse a number
3. change the cases of the characters of a string removing all spaces
4. reversing an array

Write test cases for each of the methods. */
package Assignment;

import java.util.Collections;
import java.util.List;

public class Sample 
{
	static String revStr(String s)
	{
		String s1="";
		for(int i=s.length()-1;i>=0;i--)
			s1+=s.charAt(i);
		return s1;
	}
	static int revNum(int x)
	{
		int n=0;
		while(x!=0)
		{
			int r=x%10;
			n=n*10+r;
			x/=10;
		}
		return n;
	}
	static String caseChange(String s) 
	{
		String s1="";
		for(int i=0;i<s.length();i++)
			if(s.charAt(i)>='a'&&s.charAt(i)<='z')
				s1+=(char)(s.charAt(i)-32);
			else if(s.charAt(i)>='A'&&s.charAt(i)<='Z')
				s1+=(char)(s.charAt(i)+32);
		return s1;
	}
	static List<Integer> revArray(List<Integer> l)
	{
		Collections.reverse(l);
		return l;
	}
}
