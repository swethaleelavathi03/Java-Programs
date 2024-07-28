/*
Input:	[8, 2, 0, 1, 4, 1, 0, 5, 1, 2, 0, 1]
Output:	[8, 2, 1, 4, 1, 5, 1, 2, 1, 0, 0, 0]
		[1, 1, 1, 1, 8, 2, 4, 5, 2, 0, 0, 0]
*/

import java.util.Arrays;
class Shift1And0
{
	public static void main(String [] args)
	{
		int [] arr={8,2,0,1,4,1,0,5,1,2,0,1};
		System.out.println(Arrays.toString(arr));
		shiftNumber(arr);
	}

	//Method
	public static void shiftNumber(int [] arr)
	{
		for (int i=0;i<arr.length;i++)
		{
			for (int j=0;j<arr.length-1;j++)
			{
				if (arr[j]==0)
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		for (int i=arr.length-1;i>0;i--)
		{
			for (int j=arr.length-2;j>0;j--)
			{
				if (arr[j]==1)
				{
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}