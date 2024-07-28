/*
Check whether the given number is Strong or Not using Method
Input: 145
Output: Strong
Explanation: Factorial[145] --> 1!+4!+5! --> 1+24+120 --> 145
*/

import java.util.Scanner;
class StrongNumberUsingMethod
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String [] args)
	{
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		isStrongNumber(num);
	}

	//Method
	public static void isStrongNumber(int num)
	{
		int sum=0;
		int temp=num;
		while (num>0)
		{
			int fact=1;
			for (int i=1;i<=num%10;i++)
			{
				fact*=i;
				
			}
			sum+=fact;
			num/=10;
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