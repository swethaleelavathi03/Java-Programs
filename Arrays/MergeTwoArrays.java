/*
Merge two sorted Arrays
Input:[2, 3, 4, 5]
	  [6, 7, 8]
Output:[2, 3, 4, 5, 6, 7, 8]
*/

import java.util.Arrays;
class MergeTwoArrays
{
	public static void main(String [] args)
	{
		int [] arr1={2,3,4,5};
		System.out.println("Array1:"+Arrays.toString(arr1));
		int [] arr2={6,7,8};
		System.out.println("Array2:"+Arrays.toString(arr2));
		int [] ans = mergeTwoArray(arr1, arr2);
		System.out.println("Merged Array:"+Arrays.toString(ans));
	}

	//Method
	public static int [] mergeTwoArray(int [] arr1, int [] arr2)
	{
		int [] res=new int[arr1.length+arr2.length];
		for (int i=0,j=0,k=0;i<res.length;i++)
		{
			if (j<arr1.length)
			{
				res[i]=arr1[j];
				j++;
			}
			else if (k<arr2.length)
			{
				res[i]=arr2[k];
				k++;
			}
		}
		return res;
	}
}

/*
Array1:[2, 3, 4, 5]
Array2:[6, 7, 8]
Merged Array:[2, 3, 4, 5, 6, 7, 8]
*/