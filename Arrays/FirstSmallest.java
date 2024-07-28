/*
Find the Smallest Element in an Array
Input: [8, 6, 24, 3, 18]
Output: 3
*/

import java.util.Arrays;
class FirstSmallest
{
	public static void main(String [] args)
	{
		int [] arr={8,6,24,3,18};
		System.out.println("Original Array:"+Arrays.toString(arr));
		int ans=firstSmallest(arr);
		System.out.println("First Smallest Element:"+ans);
	}

	//Method
	public static int firstSmallest(int [] arr)
	{
		int smallest=arr[0];
		for (int i=0;i<arr.length;i++)
		{
			if (arr[i]<smallest)
			{
				smallest=arr[i];
			}
		}
		return smallest;
	}
}

/*
Original Array:[8, 6, 24, 3, 18]
First Smallest Element:3
*/