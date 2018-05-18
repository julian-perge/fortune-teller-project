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
		while (input.nextLine() != quittingApp.toLowerCase())
		{
			System.out.println("Please enter your first name.");
			String firstName = input.nextLine();
			if (firstName.isEmpty())
			{
				System.out.println("This field cannot be blank. Please try again.");
				firstName = input.nextLine();
			}
			// last name
			System.out.println("Please enter your last name (sur name).");
			String lastName = input.nextLine();
			if (lastName.isEmpty())
			{
				System.out.println("This field cannot be blank. Please try again.");
				lastName = input.nextLine();
			}
			
			// age
			System.out.println("How old are you?");
			int userAge = input.nextInt();
			if (userAge <= 1 || userAge > 90)
			{
				System.out.println("How are you alive?!");
			}
			else if ((userAge % 2) == 0)
			{
				yearsToRetire = 40;
			}
			
			yearsToRetire = 33;
			
			// birth month && bank account
			System.out.println("What is your birth month? Enter a number 1-12, January being 1.");
			String birthMonth = input.nextLine();
			int intBirthMonth = Integer.parseInt(birthMonth);
			
			if (intBirthMonth > 12 || intBirthMonth <= 0)
			{
				System.out.println("Please enter a valid birth month.\n"
						+ "Only numbers 1 through 12 are applicable.");
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
			if (favoriteColor.isEmpty())
			{
				System.out.println("No favorite color :( ");
				favoriteColor = "N/A";
			}
			else if (favoriteColor.equalsIgnoreCase("help"))
			{
				System.out.println("The ROYGBIV colors are red, orange, yellow, green, blue, indigo, violet.");
			}
			else
			{
				switch (favoriteColor.toLowerCase())
				{
					case "red":
						favoriteColor = "Red";
						break;
					case "orange":
						favoriteColor = "Orange";
						break;
					case "yellow":
						favoriteColor = "Yellow";
						break;
					case "green":
						favoriteColor = "Green";
						break;
					case "blue":
						favoriteColor = "Blue";
						break;
					case "indigo":
						favoriteColor = "Indigo";
						break;
					case "violet":
						favoriteColor = "Violet";
						break;
					default:
						System.out.println("You did not choose a color in the ROYGBIV");
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
					if (numOfSiblings > 3)
					{
						vacationLocation = "Sicily, Italy";
					}
					
					vacationLocation = "Scottsdale, Arizona";
					break;

				default:
					System.out.println("I didn't know you could have less than 1 sibling...");
					vacationLocation = "Chernobyl, Ukraine";
					break;
			}
			
			
			System.out.println(firstName + " " + lastName + " will retire in " + yearsToRetire + " with " + bankBalance + " in the bank, "
					+ "a vacation home in " + vacationLocation + ", and travel by " + modeOfTransportation + ".");
			
			input.close();
			break;
		}
		
		System.out.println("Nobody likes a quitter...");
		System.exit(0);
	}

}
