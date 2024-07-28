/*
Print the Characters and Remove Numbers
*/

import java.util.Arrays;
class PrintCharacters
{
	public static void main(String [] args)
	{
		char [] arr={'A','$','4','C','2','D'};
		printChar(arr);
	}

	//Method
	public static void printChar(char [] arr)
	{
		int count=0;
		for (int i=0;i<arr.length;i++)
		{
			if (arr[i]>='0' && arr[i]<='9')
			{
				count++;
			}
		}
		char [] res=new char[arr.length-count];
		for (char i=0, j=0;i<arr.length;i++)
		{
			if (!(arr[i]>='0' && arr[i]<='9'))
			{
				res[j]=arr[i];
				j++;
			}
		}
		System.out.println(Arrays.toString(res));
	}
}