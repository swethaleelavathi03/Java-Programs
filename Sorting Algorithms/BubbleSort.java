/*
Bubble Sort
Input:	[15,14,13,12]
Output:	[12,13,14,15]
*/

import java.util.Arrays;
class BubbleSort
{
	public static void main(String [] args)
	{
		int [] arr={15,14,13,12};
		System.out.println("Unsorted Array:"+Arrays.toString(arr));
		for (int i=0;i<arr.length-1;i++)
		{
			for (int j=0;j<arr.length-1;j++)
			{
				if (arr[j]>arr[j+1])
				{
					//Swapping
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("Sorted Array:"+Arrays.toString(arr));
	}
}