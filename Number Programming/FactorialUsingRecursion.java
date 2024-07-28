/*
Find the Factorial for a given number using Recursion
Input: 5
Output: 120
Explanation: 5*4*3*2*1 --> 120
*/

import java.util.Scanner;
class FactorialUsingRecursion
{
	static Scanner sc=new Scanner(System.in);
	static int i=1;
	static int fact=1;
	public static void main(String [] args)
	{
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		int res=findFactorial(num);
		System.out.println(res);
	}

	//Find Factorial Using Recursion
	public static int findFactorial(int num)
	{
		if (i<=num)
		{
			fact*=i;
			i++;
			findFactorial(num);
		}
		return fact;
	}
}