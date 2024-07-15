import java.util.Scanner;
class SwitchVowelOrConsonant
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String [] args)
	{
		System.out.println("Enter a character:");
		char input=sc.next().charAt(0);
		switch (input)
		{
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u': System.out.println(input+" is vowel");
		default: System.out.println(input+" is consonant");
		}
	}
}