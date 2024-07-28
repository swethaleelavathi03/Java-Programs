/*
Spy Number using Method
Input: 321
Output: Spy Number
Explanation: Sum of 321 --> 3+2+1 = 6
Product of 321 --> 3*2*1 = 6
*/

import java.util.Scanner;
class SpyNumberUsingMethod
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String [] args)
	{
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		String res=isSpyNumber(num);
		System.out.println(res);
	}

	//Method
	public static String isSpyNumber(int num)
	{
		int sum=0, product=1;
		while (num>0)
		{
			sum+=num%10;
			product*=num%10;
			num/=10;
		}
		if (sum==product)
		{
			return "Spy Number";
		}
		return "Not a Spy Number";
	}
}