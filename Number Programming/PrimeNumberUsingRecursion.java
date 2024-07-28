//Prime Number Using Recursion
import java.util.Scanner;
class PrimeNumberUsingRecursion
{
	static Scanner sc=new Scanner(System.in);
	static int i=2;
	public static void main(String [] args)
	{
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		String res=solve(num);
		System.out.println(res);
	}

	//Method Using Recursion
	public static String solve(int num)
	{
		int count=2;
		if (i<num)
		{
			if (num%i==0)
			{
				count++;
			}
			i++;
			solve(num);
		}
		if (count==2)
		{
			return "Prime Number";
		}
		else
		{
			return "Not a Prime Number";
		}
		
	}
}