
import java.util.*;


public class Main
{
	public static void main( String[]args)
	{
		Scanner input = new Scanner(System.in);
		boolean KeepGoing= true;
		int option;
		int num;
		int user;
		int Won = 0;
		int Lost = 0;
		int TotalGames = 0;
		String continueOption;
		
		History myHistory = new History();
		
		System.out.println("Guessing Game");
		while(KeepGoing)
		{
		System.out.println("How many dice(s) do you want to roll?");
		System.out.println("1 Dice,  guess from 1-6");
		System.out.println("2 Dices, guess from 2-12");
		System.out.println("3 Dices, guess from 3-18");
		System.out.println("Pick Dice and guess number");
		option = input.nextInt();
		if (option == 1 || option == 2 || option ==3)
		{
			if(option == 1)
			{
				new Dice(1,6);
				num = Dice.getValue();
				System.out.println("Please Choose a number between 1 and 6");
				user = input.nextInt();
				if(user == num)
				{
					System.out.printf("You Guessed right. \nYour picked %d ,dice rolled %d", user, num);
					Won++;
				}
				else
				{
					System.out.printf("Sorry you guessed wrong. \nYour picked %d , dice rolled %d" , user, num);
					Lost++;
				}
				TotalGames++;
				myHistory.StoreValue(num, user, TotalGames);
			}
			else if (option == 2)
			{
				new DoubleDice(2,12);
				num = RandomNumber.getValue();
				System.out.println("Please choose a number between 2 and 12");
				user = input.nextInt();
				if(user == num)
				{
					System.out.printf("You Guessed right. \nYour picked %d , dice rolled %d", user, num);
					Won++;
				}
				else
				{
					System.out.printf("Sorry you guessed wrong.  \nYour picked %d , dice rolled %d", user, num);
					Lost++;
				}
				TotalGames++;
				myHistory.StoreValue(num, user, TotalGames);
			}
			else
			{

				new ThripleDice(3,18);
				num = RandomNumber.getValue();
				System.out.println("Please choose a number between 3 and 18");
				user = input.nextInt();
				if(user == num)
				{
					System.out.printf("You Guessed right. \nYour picked %d , dice rolled %d", user, num);
					Won++;
				}
				else
				{
					System.out.printf("Sorry you guessed wrong.  \nYour picked %d , dice rolled %d", user, num);
					Lost++;
				}
				TotalGames++;
				myHistory.StoreValue(num, user, TotalGames);
		}
		}
	
		else{
			
			System.out.println("Wrong option entered");
		}
		System.out.println("\nWould you like to continue?\nY for yes N for no");
		continueOption = input.next();
		if (continueOption.toUpperCase().startsWith("N"))
			{
			KeepGoing = false;
			}
		}
		System.out.println("History of Game");
		System.out.printf("You Played %d Games, Won %d, Lost %d",TotalGames, Won, Lost);
		System.out.println(myHistory);
		System.out.println("\nGame Over");
	}
}