/*
******STATIC WAY******
Reverse the Array
Input: [10, 24, 44, 84]
Output: [84, 44, 24, 10]
*/

import java.util.Arrays;
class ReverseArray
{
	public static void main(String [] args)
	{
		int [] arr={10,24,44,84};
		System.out.println("Original Array:"+Arrays.toString(arr));
		int [] ans=reverse(arr);
		System.out.println("Reversed Array:"+Arrays.toString(ans));
	}

	//Method
	public static int[] reverse(int [] b)
	{
		int [] res=new int[b.length];
		for (int i=b.length-1, j=0; i>=0; i--, j++)
		{
			res[j]=b[i];
		}
		return res;
	}
}

/*
Original Array:[10, 24, 44, 84]
Reversed Array:[84, 44, 24, 10]
*/