/*
Check whether the given number is Neon or Not
Input: 9
Output: Neon
Explanation: 9 --> 9*9 --> 81 --> 8+1 --> 9
*/

import java.util.Scanner;
class NeonNumber
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String [] args)
	{
		System.out.print("Enter the number:");
		int num=sc.nextInt();
		int square_num=num*num;
		int sum=0;
		while (square_num>0)
		{
			sum+=square_num%10;
			square_num/=10;
		}
		if (sum==num)
		{
			System.out.println("Neon Number");
		}
		else
			System.out.println("Not a Neon Number");
	}
}