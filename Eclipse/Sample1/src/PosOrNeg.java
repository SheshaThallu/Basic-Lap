// 1. Write a Java program to get a number and print whether it is positive or negative.
import java.util.Scanner;
public class PosOrNeg 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		if(n>0)
			System.out.print("Positive");
		else if(n<0)
			System.out.print("Negative");
		else
			System.out.print("Zero");
	}
}
