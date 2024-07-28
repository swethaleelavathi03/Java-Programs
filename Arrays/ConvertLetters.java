/*
Convert Uppercase to lowercase and vice versa
Input: [A, b, $, #, 4, f, M]
Output: [a, B, $, #, 4, F, m]
*/

import java.util.Arrays;
class ConvertLetters
{
	public static void main(String [] args)
	{
		char [] arr={'A','b','$','#','4','f','M'};
		System.out.println("Given Array:"+Arrays.toString(arr));
		for (int i=0;i<arr.length;i++)
		{
			if (arr[i]>='A' && arr[i]<='Z')
			{
				arr[i]+=32;
			}
			else if (arr[i]>='a' && arr[i]<='z')
			{
				arr[i]-=32;
			}
		}
		System.out.println("Converted Array:"+Arrays.toString(arr));
	}
}
/*
Given Array:[A, b, $, #, 4, f, M]
Converted Array:[a, B, $, #, 4, F, m]
*/