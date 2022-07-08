// 5. Write a Java program that takes a number and print whether that number is a Even or Odd.
import java.util.Scanner;
public class EvenOrOdd 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		System.out.print(n%2==0?"Even":"Odd");
	}
}
