import java.util.Scanner;
class WhileCountReverse
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String [] args)
	{
		System.out.println("Enter the n value:");
		int n=sc.nextInt(); //100
		
		while (n>=1) //100>=1
		{
			System.out.println(n); //100
			n--; //99
		}
	}
}