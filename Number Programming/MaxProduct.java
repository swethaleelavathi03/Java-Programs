/*
Given an integer array nums, find three numbers whose product is maximum and return the maximum product.
Example 1:

Input: nums = [1,2,3]
Output: 6
Example 2:

Input: nums = [1,2,3,4]
Output: 24
Example 3:

Input: nums = [-1,-2,-3]
Output: -6
*/

class MaxProduct
{
	public static void main(String [] args)
	{
		int [] nums={1,2,3,4};
		System.out.println(maxProduct(nums));
	}

	//Method
	public static int maxProduct(int [] array)
	{
		int product=1;
		for (int i=0;i<array.length;i++)
		{
			product*=array[i];
		}
		return product;
	}
}