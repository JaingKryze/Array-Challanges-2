import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayChallanges2
	{
	static int wordToPrint;
	static int i = 0;
	static String sentence1;
	static String sentence2;
	static int randomCard;
	static int randomSuit;
	static int monthNumber;

	public static void main(String[] args)
		{
		// squares();
		// months();
		// cards();
		sentence1();
		sentence2();
		}

	public static void squares()
		{
		int[] numbers =
			{ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		for (int bill : numbers)
			{
			System.out.println(bill * bill);
			}
		}

	public static void months()
		{
		System.out
				.println("Please enter a Month number to convert to a Month name.");
		System.out.println("i.e. entering 1 will display January.");
		Scanner UserInput1 = new Scanner(System.in);
		monthNumber = UserInput1.nextInt();
		String[] monthName =
			{ "January", "February", "March", "April", "May", "June", "July",
					"August", "September", "October", "November", "December" };
		System.out.println(monthName[monthNumber - 1]);
		}

	public static void cards()
		{
		String[] card =
			{ "King", "Queen", "Jack", "10", "9", "8", "7", "6", "5", "4", "3",
					"2", "1" };
		String[] suit =
			{ "Hearts", "Diamonds", "Spades", "Clubs" };
		Random randomNumber1 = new Random();
		randomCard = randomNumber1.nextInt(13);
		Random randomNumber2 = new Random();
		randomSuit = randomNumber2.nextInt(4);
		System.out.println("You got delt a " + card[randomCard] + " of "
				+ suit[randomSuit]);
		}

	public static void sentence1()
		{
		System.out.println("Enter a sentence.");
		Scanner UserInput1 = new Scanner(System.in);
		sentence1 = UserInput1.nextLine();
		String[] sentence1Array = sentence1.split(" ");
		for (String fred : sentence1Array)
			{
			i++;
			System.out.println(i + ". " + fred);
			}
		System.out.println("Enter the number of the word to display.");
		Scanner UserInput2 = new Scanner(System.in);
		wordToPrint = UserInput2.nextInt();
		System.out.println(sentence1Array[wordToPrint - 1]);
		}

	public static void sentence2()
		{
		System.out.println("Enter a sentence.");
		Scanner UserInput1 = new Scanner(System.in);
		sentence2 = UserInput1.nextLine();
		String[] sentence2Array = sentence2.split(" ");
		Arrays.sort(sentence2Array);
		for (String bob : sentence2Array)
			{
			System.out.println(bob);
			}
		}
	}
