/*
ZigZag Merging of an Array
Input: [2,4,6,8]
	   [10,12,14,16]
Output: [2,10,4,12,6,14,8,16]
*/

import java.util.Arrays;
class ZigZagMerging
{
	public static void main(String [] args)
	{
		int [] a={2,4,6,8};
		int [] b={10,12,14,16};
		int [] result=zigZagMerge(a, b);
		System.out.println("Merged Array:"+Arrays.toString(result));
	}

	//Method
	public static int [] zigZagMerge(int [] a, int [] b)
	{
		int [] res=new int[a.length+b.length];
		for (int i=0, j=0, k=0;i<res.length;i++)
		{
			if (i%2==0)
			{
				res[i]=a[j];
				j++;
			}
			else
			{
				res[i]=b[k];
				k++;
			}
		}
		return res;
	}
}