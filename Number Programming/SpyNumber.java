/*
Spy Number using Normal Method
Input: 321
Output: Spy Number
Explanation: Sum of 321 --> 3+2+1 = 6
Product of 321 --> 3*2*1 = 6
*/

import java.util.Scanner;
class SpyNumber
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String [] args)
	{
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		int sum=0;
		int product=1;
		while (num>0)
		{
			sum+=num%10;
			product*=num%10;
			num/=10;
		}
		if (sum==product)
		{
			System.out.println("Spy Number");
		}
		else
		{
			System.out.println("Not a Spy Number");
		}
	}
}