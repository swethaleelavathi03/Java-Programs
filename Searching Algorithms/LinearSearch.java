/*
LINEAR SEARCH
--> We can access each and every memory linearly to check whether the key element is present or not.

Input: [10,20,30,40,50,60,70,80,90,100], key element = 10
Output: The key element 10 is present
*/

import java.util.Arrays;
import java.util.Scanner;
class LinearSearch
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String [] args)
	{
		int [] arr={10,20,30,40,50,60,70,80,90,100};
		System.out.println("Given Array:"+Arrays.toString(arr));
		System.out.print("Enter the key element:");
		int key_element=sc.nextInt();
		String element="Not Present";
		for (int i=0;i<arr.length;i++)
		{
			if (arr[i]==key_element)
			{
				element="Present";
				break;
			}
		}
		System.out.println("The key element "+key_element+" is "+element);
	}
}

/*
Given Array:[10, 20, 30, 40, 50, 60, 70, 80, 90, 100]
Enter the key element:10
The key element 10 is Present
*/