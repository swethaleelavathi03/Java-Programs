/*
Remove the Duplicate Elements in an Array
Input:	[1,2,5,3,1,2,5]
Output:	[1,2,5,3]
*/

import java.util.Arrays;
class RemoveDuplicateElement
{
	public static void main(String [] args)
	{
		int [] arr={1,2,5,3,1,2,5};
		System.out.println("Original Array:"+Arrays.toString(arr));
		int [] result=removeDup(arr);
		System.out.println("Resultant Array:"+Arrays.toString(result));
	}

	//Method
	public static int [] removeDup(int [] arr)
	{
		int count=0;
		for (int i=0;i<arr.length;i++)
		{
			for (int j=i+1;j<arr.length;j++)
			{
				if (arr[i]==arr[j] && arr[i]!=Integer.MIN_VALUE)
				{
					count++;
					arr[j]=Integer.MIN_VALUE;
				}
			}
		}
		int [] res=new int[arr.length-count];
		for (int i=0, j=0;i<arr.length;i++)
		{
			if (arr[i]!=Integer.MIN_VALUE)
			{
				res[j]=arr[i];
				j++;
			}
		}
		return res;
	}
}