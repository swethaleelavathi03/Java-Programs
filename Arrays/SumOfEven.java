/*
Print Sum of Even Elements present in an Array
Input: [8, 5, 7, 6, 4, 3]
Output: 18
*/
import java.util.Arrays;
class SumOfEven
{
	public static void main(String [] args)
	{
		int [] arr={8,5,7,6,4,3};
		System.out.println("Original Array:"+Arrays.toString(arr));
		int res=sumOfEven(arr);
		System.out.println("Sum of Even Elements:"+res);
	}

	//Method
	public static int sumOfEven(int [] arr)
	{
		int sum=0;
		for (int i=0;i<arr.length;i++)
		{
			if (arr[i]%2==0)
			{
				sum+=arr[i];
			}
		}
		return sum;
	}
}

/*
Original Array:[8, 5, 7, 6, 4, 3]
Sum of Even Elements:18
*/