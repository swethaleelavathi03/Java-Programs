/*
Duck Number Using Method
Input: 4089
Output: Duck Number
Explanation: If the given number contains any zero, then the given number is called Duck Number
*/

import java.util.Scanner;
class DuckNumberUsingMethod
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String [] args)
	{
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		String res=isDuckNumber(num);
		System.out.println(res);
	}

	//Method
	public static String isDuckNumber(int num)
	{
		int count=0;
		while (num>0)
		{
			if (num%10==0)
			{
				count++;
			}
			num/=10;
		}
		if (count>0)
		{
			return "Duck Number";
		}
		return "Not a Duck Number";
	}
}