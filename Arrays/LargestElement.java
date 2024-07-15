//Largest Element in an Array
class LargestElement
{
	public static void main(String [] args)
	{
		int[] num={2,3,5,-9,7};
		System.out.println(largest(num));
		
	}

	//Method 
	public static int largest(int[] array)
	{
		int largest=array[0];
		for (int i=1;i<array.length;i++)
		{
			if (array[i]>largest)
			{
				largest=array[i];
			}
			
		}
		return largest;
	}
}