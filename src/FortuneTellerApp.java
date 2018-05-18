import java.util.Scanner;

public class FortuneTellerApp
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		int yearsToRetire = 0;
		double bankBalance = 0;
		String vacationLocation = "";
		String modeOfTransportation = "";
		String quittingApp = "Quit";

		// first name
		System.out.println("Please enter your first name.");
		
		try
		{
			String firstName = input.nextLine();
			if (firstName.equalsIgnoreCase(quittingApp))
			{
				System.out.println("Nobody likes a quitter...");
				System.exit(0);
			}

			// last name
			System.out.println("Please enter your last name (sur name).");
			String lastName = input.nextLine();
			if (lastName.equalsIgnoreCase(quittingApp))
			{
				System.out.println("Nobody likes a quitter...");
				System.exit(0);
			}

			// age
			System.out.println("How old are you?");
			String userAge = input.nextLine();
			int parsedUserAge = Integer.parseInt(userAge);

			if (userAge.equalsIgnoreCase(quittingApp))
			{
				System.out.println("Nobody likes a quitter...");
				System.exit(0);
			}
			else
			{
				if (parsedUserAge <= 1 || parsedUserAge > 90)
				{
					System.out.println("How are you alive?!");
				}
				else if ((parsedUserAge % 2) == 0)
				{
					yearsToRetire = 40;
				}
				else
				{
					yearsToRetire = 33;
				}
			}

			// birth month && bank account
			System.out.println("What is your birth month? Enter a number 1-12, January being 1.");
			String birthMonth = input.nextLine();
			int intBirthMonth = Integer.parseInt(birthMonth);

			if (intBirthMonth > 12 || intBirthMonth <= 0 || birthMonth.equals(""))
			{
				System.out.println("Birth month is not valid.\n" + "Only numbers 1 through 12 are applicable.");
			}
			else
			{
				switch (intBirthMonth)
				{
					case 1:
					case 2:
					case 3:
					case 4:
						bankBalance = 357_000.44;
						break;
					case 5:
					case 6:
					case 7:
					case 8:
						bankBalance = 6_420_256.42;
						break;
					case 9:
					case 10:
					case 11:
					case 12:
						bankBalance = 36_000.36;
						break;
					default:
						System.out.println("You poor sod.");
						bankBalance = 0;
						break;
				}
			}

			// favorite color
			System.out.println("What is your favorite ROYGBIV color?");
			String favoriteColor = input.nextLine();

			while (favoriteColor.equalsIgnoreCase("Help"))
			{
				System.out.println("The ROYGBIV colors are red, orange, yellow, green, blue, indigo, violet.");
				favoriteColor = input.nextLine();
			}

			if (favoriteColor.isEmpty())
			{
				System.out.println("No favorite color :( ");
				favoriteColor = "N/A";
			}
			else
			{
				switch (favoriteColor.toLowerCase())
				{
					case "red":
						modeOfTransportation = "Ferrari LaFerrari";
						break;
					case "orange":
						modeOfTransportation = "Dodge Viper SRT";
						break;
					case "yellow":
						modeOfTransportation = "McLaren P1 GTR";
						break;
					case "green":
						modeOfTransportation = "Lamborghini Murciélago";
						break;
					case "blue":
						modeOfTransportation = "Ferrari F60 America";
						break;
					case "indigo":
						modeOfTransportation = "Noble M600";
						break;
					case "violet":
						modeOfTransportation = "Lamborghini Aventador Galaxy";
						break;
					default:
						System.out.println("You did not choose a color in the ROYGBIV");
						modeOfTransportation = "Flying Saucers";
						break;
				}
			}

			// siblings
			System.out.println("How many siblings do you have?");
			int numOfSiblings = input.nextInt();
			switch (numOfSiblings)
			{
				case 0:
					vacationLocation = "San José, Costa Rica";
					break;
				case 1:
					vacationLocation = "Sydney, Australia";
					break;
				case 2:
					vacationLocation = "Hong Kong, China";
					break;
				case 3:
					vacationLocation = "Scottsdale, Arizona";
					break;

				default:
					if (numOfSiblings > 3)
					{
						vacationLocation = "Sicily, Italy";
						break;
					}
					System.out.println("I didn't know you could have less than 0 sibling...");
					vacationLocation = "Chernobyl, Ukraine";
					break;
			}

			System.out.println(firstName + " " + lastName + " will retire in " + yearsToRetire + " years with $"
					+ bankBalance + " in the bank, " + "a vacation home in " + vacationLocation + ", and travel by "
					+ modeOfTransportation + ".");
		}
		catch (NumberFormatException e)
		{
			System.out.println(e + ", is not a valid input");
			System.exit(0);
		}

		input.close();

		System.exit(0);
	}

}
