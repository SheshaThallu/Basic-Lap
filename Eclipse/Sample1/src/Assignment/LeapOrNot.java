package Assignment;
// 4. Write a Java program that takes a year from user and print whether that year is a leap year or not.
import java.util.Scanner;
public class LeapOrNot 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		System.out.print(n%400==0 || (n%4==0 && n%100!=0)?"Leap":"Not Leap");
	}
}
