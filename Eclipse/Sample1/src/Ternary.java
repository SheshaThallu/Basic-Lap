
public class Ternary 
{
	public static void main(String args[])
	{
		int a=7,b=30,c=9;
	//	System.out.print(a>b?(a>c?a:c):(b>c?b:c));
		if(a>b)
			if(a>c)
				System.out.print(a);
			else
				System.out.print(c);
		else
			if(b>c)
				System.out.print(b);
			else
				System.out.print(c);
	}
}
