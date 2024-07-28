/*
Check whether the given number is Palindrome or not using Method
Input: 141
Output: Palindrome
*/

import java.util.Scanner;
class PalindromeUsingMethod
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String [] args)
	{
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		String res=isPalindrome(num);
		System.out.println(res);
	}

	//Method
	public static String isPalindrome(int num)
	{
		int rev=0;
		int temp=num;
		while (num>0)
		{
			rev=rev*10+num%10;
			num/=10;
		}
		if (temp==rev)
		{
			return "Palindrome";
		}
		return "Not a Palindrome";
	}
}