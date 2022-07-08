import java.util.Scanner;

public class Sc 
{
	public static int specialSum(int N, int[] Arr,int K)
	{
		int result = -404;
		int sum = 0;
		for(int i=N-1;i>=0;i--)
		{
			if(i%(2*K)==0)
				i=i-K;
			if(i>=0)
				sum+=Arr[i];
		}
		result = sum;
		return result;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Arr[]=new int[N];
		for(int i=0;i<N;i++)
		{
			Arr[i]=sc.nextInt();
		}
		int K=sc.nextInt();
		int result = specialSum(N,Arr,K);
		sc.close();
		System.out.println(result);
	}
}
