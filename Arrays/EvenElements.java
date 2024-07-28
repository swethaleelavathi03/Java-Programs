/*
******STATIC WAY******
Print Even Elements in an Array
Input: [8, 5, 7, 6, 4, 3]
Output: 8
		6
		4
*/

import java.util.Arrays;
class EvenElements
{
	public static void main(String [] args)
	{
		int [] arr={8,5,7,6,4,3};
		System.out.println("Original Array:"+Arrays.toString(arr));
		evenArray(arr);
	}

	//Method
	public static void evenArray(int [] b)
	{
		for (int i=0;i<b.length;i++)
		{
			if (b[i]%2==0)
			{
				System.out.println(b[i]);
			}
		}
	}
}

/*
Original Array:[8, 5, 7, 6, 4, 3]
8
6
4
*/