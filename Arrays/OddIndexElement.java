/*
Print Odd Index Element
Input: [3,2,5,7,8,9,10]
Output: 2
		7
		9
*/

import java.util.Arrays;
class OddIndexElement
{
	public static void main(String [] args)
	{
		int [] arr={3,2,5,7,8,9,10};
		oddIndex(arr);
	}

	//Method
	public static void oddIndex(int [] arr)
	{
		for (int i=0;i<arr.length;i++)
		{
			if (i%2!=0)
			{
				System.out.println(arr[i]);
			}
		}
	}
}