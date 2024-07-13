//Sum the numbers between 1-1000 which is divisible by 2 and 9
class SumDivisibleBy2And9
{
	public static void main(String [] args)
	{
		int sum=0;
		for (int i=1;i<=1000;i++)
		{
			if (i%2==0 && i%9==0)
			{
				System.out.println(i);
				sum+=i;
			}
		}
		System.out.println("Sum of numbers:"+sum);
	}
}