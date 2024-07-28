//Add Integers from the Character Array
class AddIntegers
{
	public static void main(String [] args)
	{
		char [] a={'S','Y','2','4','e','3','d'};
		addIntegers(a);
	}
	public static void addIntegers(char [] a)
	{
		int sum=0;
		for (int i=0;i<a.length;i++)
		{
			if (a[i]>='0' && a[i]<='9')
			{
				a[i]-=48;
				sum+=a[i];
				//sum=sum+(a[i]-48);
			}
		}
		System.out.println(sum);
	}
}