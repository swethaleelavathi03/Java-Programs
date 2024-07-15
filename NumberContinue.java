//Print numbers using continue keyword
class NumberContinue
{
	public static void main(String [] args)
	{
		for (int i=1;i<=10;i++)
		{
			if (i==6 || i==9)
			{
				continue;
			}
			System.out.print(i+" ");
		}
	}
}