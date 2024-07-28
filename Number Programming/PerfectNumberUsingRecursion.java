/*
Perfect Number Using Recursion
Input: 6
Output:Perfect Number
Explanation: Factors of 6 --> 1, 2, 3 --> --> 1+2+3 = 6
Therefore, Sum of the factors will be equivalent to the given number.
*/

import java.util.Scanner;
class PerfectNumberUsingRecursion
{
	static Scanner sc=new Scanner(System.in);
	static int i=1;
	static int sum=0;
	public static void main(String [] args)
	{
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		String res=isPerfect(num);
		System.out.println(res);
	}

	//Logic Using Recursion
	public static String isPerfect(int num)
	{
		if (i<num)
		{
			if (num%i==0)
			{
				sum+=i;
			}
			i++;
			isPerfect(num);
		}
		if (num==sum)
		{
			return "Perfect Number";
		}
		return "Not a Perfect Number";
	}
}