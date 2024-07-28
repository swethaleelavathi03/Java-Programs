/*
Shift Zeroes to the left
Input:	[5,0,3,4,0,8,0,1]
Output: [0,0,0,5,3,4,8,1]
*/

import java.util.Arrays;
class ShiftZeroLeft
{
	public static void main(String [] args)
	{
		int [] arr={5,0,3,4,0,8,0,1};
		shiftZero(arr);
	}

	//Method
	public static void shiftZero(int [] arr)
	{
		for (int i=arr.length-1;i>0;i--)
		{
			for (int j=arr.length-2;j>0;j--)
			{
				if (arr[j]==0)
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