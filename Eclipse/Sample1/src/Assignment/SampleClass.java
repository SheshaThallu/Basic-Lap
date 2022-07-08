package Assignment;

import java.util.Scanner;

public class SampleClass {
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		sc.close();
		for(int i=0,j=0;i<s1.length();i++)
		{
			if(j<s2.length() && s1.charAt(i)==s2.charAt(j))
				j++;
			else
				System.out.print(s1.charAt(i));
		}
	}
}
