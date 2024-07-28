/*
Check whether the given number is Palindrome or not
Input: 141
Output: Palindrome
*/

import java.util.Scanner;
class Palindrome
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String [] args)
	{
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		int temp=num;
		int rev=0;
		while (num>0)
		{
			rev=rev*10+num%10;
			num/=10;
		}
		System.out.println(rev);
		if (temp==rev)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a Palindrome");
		}
	}
}