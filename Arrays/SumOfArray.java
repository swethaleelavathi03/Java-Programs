/*
Sum of Array Elements
Input: [5, 3, 4, 2, 1, 4]
Output: 19
*/

import java.util.Arrays;
class SumOfArray
{
	public static void main(String [] args)
	{
		int [] arr={5,3,4,2,1,4};
		System.out.println("Original Array:"+Arrays.toString(arr));
		int res=sumOfArray(arr);
		System.out.println("Sum of Array Elements:"+res);
	}

	//Method
	public static int sumOfArray(int [] arr)
	{
		int sum=0;
		for (int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		}
		return sum;
	}
}

/*
Original Array:[5, 3, 4, 2, 1, 4]
Sum of Array Elements:19
*/