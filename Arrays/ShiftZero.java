/*
Shift Zeroes to the right
Input:	[5,0,3,4,0,8,0,1]
Output: [5,3,4,8,1,0,0,0]
*/

import java.util.Arrays;
class ShiftZero
{
	public static void main(String [] args)
	{
		int [] arr={5,0,3,4,0,8,0,1};
		shiftZero(arr);
	}

	//Method
	public static void shiftZero(int [] arr)
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
	}
}