/*
Check whether the given number is Strong or Not using Normal Method
Input: 145
Output: Strong
Explanation: Factorial[145] --> 1!+4!+5! --> 1+24+120 --> 145
*/

import java.util.Scanner;
class StrongNumber
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String [] args)
	{
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		int sum=0;
		int temp=num;
		while (num>0)
		{
			int fact=1;
			for (int i=1;i<=num%10;i++)
			{
				fact*=i;
			}
			num/=10;
			sum+=fact;
		}
		if (sum==temp)
		{
			System.out.println("Strong Number");
		}
		else
		{
			System.out.println("Not a Strong Number");
		}
	}
}