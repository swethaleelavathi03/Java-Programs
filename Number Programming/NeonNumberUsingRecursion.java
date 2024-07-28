/*
Check whether the given number is Neon or Not using Recursion
Input: 9
Output: Neon
Explanation: 9 --> 9*9 --> 81 --> 8+1 --> 9
*/

import java.util.Scanner;
class NeonNumberUsingRecursion
{
	static Scanner sc=new Scanner(System.in);
	static int sum=0;
	public static void main(String [] args)
	{
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		int square_num=num*num;
		int res=isNeonNumber(square_num);
		System.out.println(res);
		if (res==num)
		{
			System.out.println("Neon Number");
		}
		else
			System.out.println("Not a Neon Number");
	}

	//Logic for Neon Number using Recursion
	public static int isNeonNumber(int square_num)
	{
		if (square_num>0)
		{
			sum+=square_num%10;
			square_num/=10;
			isNeonNumber(square_num);
		}
		return sum;
	}
}