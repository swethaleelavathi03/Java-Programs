/*Traversing the Array
Input: [2.3,4.3,5.3,3.7]
Output: 2.3
		4.3
		5.3
		3.7
Explanation: The given array should be visited each and every memory(traversed)
*/
import java.util.Arrays;
class TraverseArray
{
	public static void main(String [] args)
	{
		double [] arr={2.3,4.3,5.3,3.7};
		System.out.println(Arrays.toString(arr));
		//Logic for Traversing the array
		
		for (int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
}