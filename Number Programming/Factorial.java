/*
Find the Factorial for a given number using Normal Method
Input: 5
Output: 120
Explanation: 5*4*3*2*1 --> 120
*/

import java.util.Scanner;
class Factorial
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String [] args)
	{
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		int fact=1;
		for (int i=1;i<=num;i++)
		{
			fact*=i;
		}
		System.out.println(fact);
	}
}

