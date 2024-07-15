//Finding the sum of n natural numbers
import java.util.Scanner;
class SumNumber
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String [] args)
	{
		System.out.print("Enter the n value:");
		int n=sc.nextInt();
		int sum=0;
		for (int i=1;i<=n;i++)
		{
			sum+=i;
		}
		System.out.println(sum);
		//Another way
		System.out.println(n*(n+1)/2);
		
	}
}