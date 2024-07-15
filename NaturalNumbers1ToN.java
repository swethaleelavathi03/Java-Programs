//Natural Numbers from 1 to N
import java.util.Scanner;
class NaturalNumbers1ToN
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String [] args) throws Exception
	{
		System.out.print("Enter the N value:");
		int n=sc.nextInt();
		for (int i=1;i<=n;i++)
		{
			System.out.println(i);
		}
	}
}
