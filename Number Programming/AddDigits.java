/*
Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.
Example 1:

Input: num = 38
Output: 2
Explanation: The process is
38 --> 3 + 8 --> 11
11 --> 1 + 1 --> 2 
Since 2 has only one digit, return it.
Example 2:

Input: num = 0
Output: 0
*/
import java.util.Scanner;
class AddDigits
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String [] args)
	{
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		int sum=0;
		while (num>0 || sum>9) // [38>0 || 0>9], // [11>0 || 0>9] 
		{
			if (num==0) //[38==0, 3==0, 0==0], [11==0, 1==0, 0==0] 
			{
				num=sum; //[11], [2]
				sum=0;
			}
			sum+=num%10;
			num/=10;
		}
		
		System.out.println(sum);
	}
}