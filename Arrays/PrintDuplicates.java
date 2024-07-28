/*
Print the Duplicate Elements in an Array
Input:	[1,2,3,4,5]
Output:	No Duplicate

Input:	[1,2,3,1,5,6,2,3]
Output: [1,2,3]
*/

import java.util.Arrays;
class PrintDuplicates
{
	public static void main(String [] args)
	{
		int [] arr={1,2,3,1,5,6,2,3};
		System.out.println("Original Array:"+Arrays.toString(arr));
		String result=printDup(arr);
		System.out.println("Duplicated Elements Found:"+result);
	}

	//Method
	public static String printDup(int [] arr)
	{
		int k=0;
		String ans="";
		for (int i=0;i<arr.length;i++)
		{
			int count=0;
			for (int j=i+1;j<arr.length;j++)
			{
				if (arr[i]==arr[j] && arr[i]!=Integer.MIN_VALUE)
				{
					count++;
					arr[j]=Integer.MIN_VALUE;
				}
			}
			if (count>0)
			{
				ans+=arr[i]+" ";
				k++;
			}
		}
		if (k==0)
		{
			return "No Duplicate Elements Found";
		}
		return ans;
	}
}