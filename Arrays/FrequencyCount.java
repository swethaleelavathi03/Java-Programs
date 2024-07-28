import java.util.Arrays;
class FrequencyCount
{
	public static void main(String [] args)
	{
		int [] a={1,2,4,5,1,3,2};
		freqCount(a);
	}

	//Method
	public static void freqCount(int [] a)
	{
		for (int i=0;i<a.length;i++)
		{
			int count=1;
			for (int j=i+1;j<a.length;j++)
			{
				if (a[i]==a[j] && a[i]!=Integer.MIN_VALUE)
				{
					count++;
					a[j]=Integer.MIN_VALUE;
				}
			}
			if (a[i]!=Integer.MIN_VALUE)
			{
				System.out.println(a[i]+":"+count);
			}
		}
	}
}