/*
Check whether the given number is Palindrome or not using Recursion
Input: 141
Output: Palindrome
*/

import java.util.Scanner;
class PalindromeUsingRecursion
{
	static Scanner sc=new Scanner(System.in);
	static int rev=0;
	public static void main(String [] args)
	{
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		String res=isPalindrome(num);
		System.out.println(res);
	}

	//Logic for Palindrome Using Recursion
	public static String isPalindrome(int num)
	{
		int temp=num;
		if (num>0)
		{
			rev=rev*10+num%10;
			num/=10;
			isPalindrome(num);
		}
		if (rev==temp)
		{
			return "Palindrome";
		}
		return "Not a Palindrome";
	}
}