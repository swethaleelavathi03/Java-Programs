/*
Sum of adding the first digits
Input:	[84, 3, 4, 16, 268, 93, 4, 21, 258]
Output:	24
*/

import java.util.Scanner;
import java.util.Arrays;
class SumOfFirstDigit
{
	public static void main(String [] args)
	{
		int [] arr={84,3,4,16,268,93,4,21,258};
		System.out.println(Arrays.toString(arr));
		sumOfFirst(arr);
	}

	//Method
	public static void sumOfFirst(int [] arr)
	{
		int sum=0;
		for (int i=0;i<arr.length;i++)
		{
			if (arr[i]<10)
			{
				continue;
			}
			while (arr[i]>9)
			{
				arr[i]/=10;
			}
			sum+=arr[i];
			//System.out.print(arr[i]);
		}
		System.out.println(sum);
		
	}
}