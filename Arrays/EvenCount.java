//Even Count in Arrays
import java.util.Scanner;
class EvenCount
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String [] args)
	{
		int[] array={2,3,4,5,6};
		System.out.println(evenCount(array));
	}

	//Method
	public static int evenCount(int[] array)
	{
		int count=0;
		for (int i=0;i<array.length;i++)
		{
			if (array[i]%2==0)
			{
				count++;
			}
		}
		return count;
	}
}