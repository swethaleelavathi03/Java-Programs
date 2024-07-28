/*
Rotate the right elements in an Array
Input:	[10,20,30,40,50], n=1
Output: [50,10,20,30,40]
*/

import java.util.Arrays;
import java.util.Scanner;
class RightShift
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String [] args)
	{
		int [] arr={10,20,30,40,50};
		System.out.print("Enter the number:");
		int num=sc.nextInt();
		rightShift(arr, num);
	}

	//Method
	public static void rightShift(int [] arr, int num)
	{
		for (int i=1;i<=num;i++)
		{
			int last=arr[arr.length-1]; // last = a[5-1] --> a[4] 
			for (int j=arr.length-2;j>=0;j--) // j=5-2 --> [j=3;3>=0] --> [j=2; 2>=0] -->
			{
				arr[j+1]=arr[j];
			}
			arr[0]=last;
		}
		System.out.println(Arrays.toString(arr));
	}
}