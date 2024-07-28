/*
Merge the Arrays 
Input:[2, 3, 4, 5]
	  [6, 7, 8]
	  [1, 2, 3, 4]
Merged Array with Reversed Middle Array:[2, 3, 4, 5, 8, 7, 6, 1, 2, 3, 4]
*/

import java.util.Arrays;
class MergeArrays
{
	public static void main(String [] args)
	{
		int [] arr1={2,3,4,5};
		System.out.println("Array1:"+Arrays.toString(arr1));
		int [] arr2={6,7,8};
		System.out.println("Array2:"+Arrays.toString(arr2));
		int [] arr3={1,2,3,4};
		System.out.println("Array3:"+Arrays.toString(arr3));
		int [] ans=mergeArray(arr1, arr2, arr3);
		System.out.println("Merged Array with Reversed Middle Array:"+Arrays.toString(ans));
	}

	//Method
	public static int [] mergeArray(int [] arr1, int [] arr2, int [] arr3)
	{
		int [] res=new int[arr1.length+arr2.length+arr3.length];
		for (int i=0,j=0,k=arr2.length-1,l=0;i<res.length;i++)
		{
			if (j<arr1.length)
			{
				res[i]=arr1[j];
				j++;
			}
			else if (k>=0)
			{
				res[i]=arr2[k];
				k--;
			}
			else if (l<arr3.length)
			{
				res[i]=arr3[l];
				l++;
			}
		}
		return res;
	}
}

/*
Array1:[2, 3, 4, 5]
Array2:[6, 7, 8]
Array3:[1, 2, 3, 4]
Merged Array with Reversed Middle Array:[2, 3, 4, 5, 8, 7, 6, 1, 2, 3, 4]
*/