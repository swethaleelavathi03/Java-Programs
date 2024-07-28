/*
BINARY SEARCH
Input: [10,20,30,40,50,60,70,80,90,100], key element = 10
Output: The key element 10 is present
*/

import java.util.Arrays;
import java.util.Scanner;
class BinarySearch
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String [] args)
	{
		int [] arr={10,20,30,40,50,60,70,80,90,100};
		System.out.println("Given Array:"+Arrays.toString(arr));
		System.out.print("Enter the key element:");
		int key_element=sc.nextInt();
		int low=0;
		int high=arr.length-1;
		int mid=(low+high)/2;
		String element="Not Present";
		for (int i=0;i<arr.length;i++)
		{
			//Check whether the given key element is present in middle
			if (key_element==arr[mid])
			{
				element="Present";
				break;
			}
			//Check whether the given key element is present in left from middle
			else if (key_element<arr[mid])
			{
				high=mid-1;
			}
			else if (key_element>arr[mid])
			{
				low=mid+1;
			}
			mid=(low+high)/2;
		}
		System.out.println("The key element "+key_element+" is "+element);
	}
}
