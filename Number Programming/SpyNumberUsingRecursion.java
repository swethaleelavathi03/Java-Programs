/*
Spy Number using Recursion
Input: 321
Output: Spy Number
Explanation: Sum of 321 --> 3+2+1 = 6
Product of 321 --> 3*2*1 = 6
*/

import java.util.Scanner;
class SpyNumberUsingRecursion
{
	static Scanner sc=new Scanner(System.in);
	static int sum=0;
	static int product=1;
	public static void main(String [] args)
	{
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		String res=isSpyNumber(num);
		System.out.println(res);
	}

	//Logic for Spy Number using Recursion
	public static String isSpyNumber(int num)
	{
		if (num>0)
		{
			sum+=num%10;
			product*=num%10;
			num/=10;
			isSpyNumber(num);
		}
		if (sum==product)
		{
			return "Spy Number";
		}
		return "Not a Spy Number";
	}
}