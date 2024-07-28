/*
Sum of Odd Elements
Input: [8, 5, 7, 6, 4, 3]
Output: 15
*/

import java.util.Arrays;
class SumOfOdd
{
	public static void main(String [] args)
	{
		int [] arr={8,5,7,6,4,3};
		System.out.println("Original Array:"+Arrays.toString(arr));
		int res=sumOfOdd(arr);
		System.out.println("Sum of Odd Elements:"+res);
	}

	//Method
	public static int sumOfOdd(int [] arr)
	{
		int sum=0;
		for (int i=0;i<arr.length;i++)
		{
			if (arr[i]%2!=0)
			{
				sum+=arr[i];
			}
		}
		return sum;
	}
}

/*
Original Array:[8, 5, 7, 6, 4, 3]
Sum of Odd Elements:15
*/