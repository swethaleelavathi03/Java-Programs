//Frequency count
class Frequency
{
	public static void main(String [] args)
	{
		int[] freq={2,3,1,2,5,3,2};
		frequency(freq);
	}

	//Method
	public static void frequency(int[] array)
	{
		int visited=Integer.MIN_VALUE;
		for (int i=0;i<array.length;i++)
		{
			int count=1;
			if (array[i]!=visited)
			{
				for (int j=i+1;j<array.length;j++)
				{
					if (array[i]==array[j])
					{
						count++;
						array[j]=visited;
					}
				}
				System.out.println(array[i]+":"+count);
			}
		}
	}
}
