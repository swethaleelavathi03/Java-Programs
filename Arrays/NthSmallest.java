/*
Find the Nth Smallest Element in an Array
Input:	[2, 8, 3, 2, 4, 16, 12, 16], n=3
Output:	4
*/

import java.util.Arrays;
import java.util.Scanner;
class NthSmallest
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String [] args)
	{
		int [] arr={2,8,3,2,4,16,12,16};
		System.out.println("Given Array:"+Arrays.toString(arr));
		System.out.print("Enter the number:");
		int num=sc.nextInt();
		int res=nthSmallest(arr, num);
		System.out.println("The Nth Smallest Number: "+res);
	}

	//Method
	public static int nthSmallest(int [] arr, int num)
	{
		int smallest=arr[0];
		for (int i=1;i<=num;i++)
		{
			smallest=arr[0];
			for (int j=0;j<arr.length;j++)
			{
				if (arr[j]<smallest)
				{
					smallest=arr[j];
				}
			}
			for (int j=0;j<arr.length;j++)
			{
				if (arr[j]==smallest)
				{
					arr[j]=Integer.MAX_VALUE;
				}
			}
		}
		return smallest;
	}
}

/*
Given Array:[2, 8, 3, 2, 4, 16, 12, 16]
Enter the number:3
The Nth Smallest Number: 4
*/