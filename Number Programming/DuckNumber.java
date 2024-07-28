/*
Duck Number Using Normal Method
Input: 4089
Output: Duck Number
Explanation: If the given number contains any zero, then the given number is called Duck Number
*/

import java.util.Scanner;
class DuckNumber
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String [] args)
	{
		System.out.println("Enter the number:");
		int num=sc.nextInt();
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
			System.out.println("Duck Number");
		}
		else
			System.out.println("Not a Duck Number");
	}
}