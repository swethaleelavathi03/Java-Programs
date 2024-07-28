/*
Find the First Largest Element present inside an Array
Input: [8, 6, 24, 3, 18]
Output: 24
*/

import java.util.Arrays;
class FirstLargest
{
	public static void main(String [] args)
	{
		int [] arr={8,6,24,3,18};
		System.out.println("Original Array:"+Arrays.toString(arr));
		int res=firstLargest(arr);
		System.out.println("First Largest Element:"+res);
	}

	//Method
	public static int firstLargest(int [] arr)
	{
		int largest=arr[0];
		for (int i=0;i<arr.length;i++)
		{
			if (arr[i]>largest)
			{
				largest=arr[i];
			}
		}
		return largest;
	}
}

/*
Original Array:[8, 6, 24, 3, 18]
First Largest Element:24
*/