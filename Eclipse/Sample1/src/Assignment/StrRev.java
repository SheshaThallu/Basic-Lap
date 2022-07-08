// 2. Program to reverse a String in place in Java?
package Assignment;
import java.util.Scanner;
public class StrRev 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		sc.close();
		String r="";
		for(int i=0;i<s.length();i++)
			r=s.charAt(i)+r;
		System.out.println(r);
	}
}