class SwitchFood
{
	public static void main(String [] args)
	{
		System.out.println("Hi from Swetha");
		String food="Parotta";
		switch(food)
		{
			case "Dosa":{
				System.out.println("Dosa");
				break;
			}
			case "Parotta":{
				System.out.println("Parotta");
				break;
			}
			case "Idli":{
				System.out.println("Idli");
				break;
			}
			default:{
				System.out.println("Invalid");
			}
		}
		System.out.println("Bye from Swetha");
	}
}