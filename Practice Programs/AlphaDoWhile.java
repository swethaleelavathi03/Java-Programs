//Printing Alphabets using do-while loop
import java.util.Scanner;
class AlphaDoWhile
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String [] args)
	{
		char ch='A';
		do
		{
			System.out.print(ch+++" ");
		}
		while (ch<='Z');

	}
}