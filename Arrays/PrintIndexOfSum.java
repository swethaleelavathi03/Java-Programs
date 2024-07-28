/*
Input:	[8, 3, 4, 2, 6, 1, 5]
Output:	[0,3]
		[2,4]
*/

import java.util.Arrays;
class PrintIndexOfSum
{
	public static void main(String [] args)
	{
		int [] arr={8,3,4,2,6,1,5};
		System.out.println(Arrays.toString(arr));
		int target_sum=10;
		indexOfSum(arr, target_sum);
	}

	//Method
	public static void indexOfSum(int [] arr, int target_sum)
	{
		for (int i=0;i<arr.length;i++)
		{
			for (int j=i+1;j<arr.length;j++)
			{
				if (arr[i]+arr[j]==target_sum)
				{
					System.out.println("["+i+","+j+"]");
				}
			}
		}
	}
}