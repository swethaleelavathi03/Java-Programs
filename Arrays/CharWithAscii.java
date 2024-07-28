/*
******STATIC WAY******
Create Character Array and Traverse the Array to print Characters along with Ascii Values
Input:['A','c','B','D','d','0','S']
Output: A:65
		c:99
		B:66
		D:68
		d:100
		0:48
		S:83
*/
import java.util.Arrays;
class CharWithAscii
{
	public static void main(String [] args)
	{
		char [] arr={'A','c','B','D','d','0','S'};
		System.out.println(Arrays.toString(arr));
		for (int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+":"+(int)arr[i]);
		}
	}
}