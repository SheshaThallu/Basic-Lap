/* 9. Fizz Buzz Problem
a) take any number
b) if divisible by 3 -> "Fizz"
b) if divisible by 5 -> "Buzz"
c) if divisible by 15 -> "FizzBuzz"
d) else "SORRY" */
import java.util.Scanner;
public class FizzBuzz 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		System.out.print(n % 15 == 0 ? "FizzBuzz" : (n % 3 == 0 ? "Fizz" : (n % 5 == 0 ? "Buzz" : "SORRY") ) );
	}
}
