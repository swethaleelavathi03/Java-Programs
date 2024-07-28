//Missing Numbers in Array
class MissingNaturalNumbers
{
	public static void main(String [] args)
	{
		int [] a={1,2,4,6,9};
		missingNumbers(a);
	}

	//Method
	public static void missingNumbers(int[] a)
	{
		for (int i=0, j=1;i<a.length;i++,j++)
		{
			if (a[i]!=j)
			{
				System.out.println(j);
				i--;
			}
		}
	}
}