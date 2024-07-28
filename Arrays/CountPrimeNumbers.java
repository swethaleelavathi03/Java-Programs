/*
Count of Prime Numbers
Input:	[2,8,5,7,4,11]
Output:	Count of Prime Numbers - 4
*/

import java.util.Arrays;
class CountPrimeNumbers
{
	public static void main(String [] args)
	{
		int [] arr={2,8,5,7,4,11};
		countPrime(arr);
	}

	//Method
	public static void countPrime(int [] arr)
	{
		int count=0;
		for (int i=0;i<arr.length;i++)
		{
			if (isPrime(arr[i]))
			{
				count++;
			}
		}
		System.out.println("Count of Prime Numbers - "+count);
	}

	public static boolean isPrime(int num)
	{
		if (num<=1)
		{
			return false;
		}
		for (int i=2;i<num;i++)
		{
			if (num%i==0)
			{
				return false;
			}
		}
		return true;
	}
}