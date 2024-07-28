/*
Rotate the left elements in an Array
Input:	[10,20,30,40,50], n=1
Output: [20,30,40,50,10]
*/

import java.util.Arrays;
import java.util.Scanner;
class LeftShift
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String [] args)
	{
		int [] arr={10,20,30,40,50};
		System.out.print("Enter the number:");
		int num=sc.nextInt();
		leftShift(arr,num);
	}

	//Method
	public static void leftShift(int [] arr, int num)
	{
		System.out.println("Original Array:"+Arrays.toString(arr));
		for (int i=1;i<=num;i++)
		{
			int first=arr[0];
			for (int j=0;j<arr.length-1;j++)
			{
				arr[j]=arr[j+1];
			}
			arr[arr.length-1]=first;
		}
		System.out.println("Shifted Array:"+Arrays.toString(arr));
	}
}