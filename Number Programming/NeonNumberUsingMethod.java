/*
Check whether the given number is Neon or Not using Method
Input: 9
Output: Neon
Explanation: 9 --> 9*9 --> 81 --> 8+1 --> 9
*/

import java.util.Scanner;
class NeonNumberUsingMethod
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String [] args)
	{
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		String res=isNeonNumber(num);
		System.out.println(res);
	}

	//Method
	public static String isNeonNumber(int num)
	{
		int square_num=num*num;
		int sum=0;
		while (square_num>0)
		{
			sum+=square_num%10;
			square_num/=10;
		}
		if (sum==num)
		{
			return "Neon Number";
		}
		return "Not a Neon Number";
	}
}
