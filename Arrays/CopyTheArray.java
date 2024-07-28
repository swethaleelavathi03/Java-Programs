/*
Copy one array element into another array
Input: [2, 4, 5, 7]
Output: [2, 4, 5, 7]
*/

import java.util.Arrays;
class CopyTheArray
{
	public static void main(String [] args)
	{
		int [] arr={2,4,5,7};
		System.out.println("Original Array:"+Arrays.toString(arr));
		int [] ans=solve(arr);
		System.out.println("Duplicate Array:"+Arrays.toString(ans));
	}

	//Method
	public static int[] solve(int [] b)
	{
		int [] res=new int[b.length];
		for (int i=0;i<b.length;i++)
		{
			res[i]=b[i];
		}
		return res;
	}
}

/*
Original Array:[2, 4, 5, 7]
Duplicate Array:[2, 4, 5, 7]
*/