/*
Duck Number Using Recursion
Input: 4089
Output: Duck Number
Explanation: If the given number contains any zero, then the given number is called Duck Number
*/

import java.util.Scanner;
class DuckNumberUsingRecursion
{
	static Scanner sc=new Scanner(System.in);
	static int count=0;
	public static void main(String [] args)
	{
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		String res=isDuckNumber(num);
		System.out.println(res);
	}

	//Logic for Duck Number Using Recursion
	public static String isDuckNumber(int num)
	{
		if (num>0)
		{
			if (num%10==0)
			{
				count++;
			}
			num/=10;
			isDuckNumber(num);
		}
		if (count>0)
		{
			return "Duck Number";
		}
		return "Not a Duck Number";
	}
}

