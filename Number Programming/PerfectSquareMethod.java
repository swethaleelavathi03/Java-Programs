//Perfect Square in Method
import java.util.Scanner;
class PerfectSquareMethod
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String [] args)
	{
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		String res=perfectSquare(num);
		System.out.println(res);
	}

	//Method
	public static String perfectSquare(int num)
	{
		String res="Not a Perfect Square";;
		for (int i=1;i*i<=num;i++)
		{
			if (num%i==0 && num/i==i)
			{
				res="Perfect Square";
				break;
			}
			
		}
		if (res=="Perfect Square")
		{
			return "Perfect Square";
		}
		return "Not a Perfect Square";
	}
}