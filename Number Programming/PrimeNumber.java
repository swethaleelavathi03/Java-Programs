/*PRIME NUMBER: The number should be divisible by 1 and itself.
Prime Number in Normal Method
Input: 3
Output: Prime
*/
import java.util.Scanner;
class PrimeNumber
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String [] args)
	{
		//Read data from User
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		//Logic
		boolean res=true;
		for (int i=2;i<num;i++)
		{
			if (num%i==0)
			{
				res=false;
			}
		}
		if (res)
		{
			System.out.println("Prime Number");
		}
		else
		{
			System.out.println("Not a Prime Number");
		}
	}
}

/*
Enter the number:
3
Prime Number
*/