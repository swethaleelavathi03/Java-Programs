/*
Find the Nth Largest Element in an Array
Input:	[2, 8, 3, 2, 4, 16, 12, 16], n=3
Output:	8
*/

import java.util.Arrays;
import java.util.Scanner;
class NthLargest
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String [] args)
	{
		int [] arr={2,8,3,2,4,16,12,16};
		System.out.println("Given Array:"+Arrays.toString(arr));
		System.out.print("Enter the number:");
		int num=sc.nextInt();
		int res=nthLargest(arr, num);
		System.out.println("The Nth Largest number: "+res);
	}

	//Method
	public static int nthLargest(int [] arr, int num)
	{
		int largest=arr[0];
		for (int i=1;i<=num;i++) //2
		{
			largest=arr[0]; //2 --> 8
			for (int j=0;j<arr.length;j++)
			{
				if (arr[j]>largest) 
				{
					largest=arr[j];
				}
			}
			for (int j=0;j<arr.length;j++)
			{
				if (largest==arr[j])
				{
					arr[j]=Integer.MIN_VALUE;
				}
			}
		}
		return largest;
	}
}

/*
Given Array:[2, 8, 3, 2, 4, 16, 12, 16]
Enter the number:3
The Nth Largest number: 8
*/