/*Prime Number Using Count Method
Input: 3
Output: Prime
*/

import java.util.Scanner;
class PrimeNumberUsingCountMethod
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String [] args)
	{
		//Read data from user
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		String res=isPrime(num);
		System.out.println(res);
	}

	//Method
	public static String isPrime(int num)
	{
		int count=2;
		for (int i=2;i<num;i++)
		{
			if (num%i==0)
			{
				count++;
			}
		}
		if (count==2)
		{
			return "Prime Number";
		}
		return "Not a Prime Number";
	}
}