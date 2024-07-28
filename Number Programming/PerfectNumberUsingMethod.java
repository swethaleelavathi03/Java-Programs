/*
Perfect Number Using Method
Input: 6
Output:Perfect Number
Explanation: Factors of 6 --> 1, 2, 3 --> --> 1+2+3 = 6
Therefore, Sum of the factors will be equivalent to the given number.
*/

import java.util.Scanner;
class PerfectNumberUsingMethod
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String [] args)
	{
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		String res=isPerfect(num);
		System.out.println(res);
	}

	//Method
	public static String isPerfect(int num)
	{
		int sum=0;
		for (int i=1;i<num;i++)
		{
			if (num%i==0)
			{
				sum+=i;
			}
		}
		if (sum==num)
		{
			return "Perfect Number";
		}
		return "Not a Perfect Number";
	}
}