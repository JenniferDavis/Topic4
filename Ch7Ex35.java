import java.lang.reflect.Array;
import java.util.*;

public class Ch7Ex35 {

	public static int misses;
	public static char [] asteriskArray;
	public static int choice;
	public static String [] words = {"prayer", "grace", "forgiven", "Jesus", "holiness", "God", "love", "Saints", "communion", "Bible"};
	public static char letter;
	public static char [] wordToGuess;

	public static void main(String[] args) {
		pickWordToGuess();
		
	}

	
	// start game
	public static void pickWordToGuess()
	{
		// randomly pick a word
		choice = (int)(Math.random() * 10 );
		// create a char array of the word
		wordToGuess = words[choice].toCharArray();
		// create and fill an asterisk array to switch with
		asteriskArray = new char[wordToGuess.length];
		for (int i = 0; i < asteriskArray.length; i++)
		{
			asteriskArray[i] = '*';
		}	
		play();
		//System.out.println(Arrays.toString(words));
		//System.out.println(choice);
		//System.out.println(words[choice]);
		//System.out.println(asteriskArray);
	}
	
	
	// Searches through the given array looking for the given target. Returns the index number
	// of the target if found, or -1 otherwise. (classic search-loop example)
	public static int search(char[] array, char a) {
	  // Look at every element
	  for (int i=0; i<array.length; i++) {
	    if (array[i] == a) {
	      return i; // return the index where the target is found
	    }
	  }
	  // If we get here, the target was not in the array
	  return -1;
	}
	
	
	
	// playing the game
	public static void play()
	{
		// see if asteriskArray has any asterisks left
		// if yes, then ask for a letter guess
		// if no, then print the word and the number of misses
		// search asteriskArray for letters that have already been picked
		// return statement if yes, search and reveal if no
		if (search(asteriskArray, '*') >= 0)
		{
			Scanner input = new Scanner(System.in);
			System.out.print("(Guess) Enter a letter in word " + String.valueOf(asteriskArray) + ">");
			letter = input.next().charAt(0);
			
			if (search(wordToGuess, letter) >= 0) 
			{
				int indexToReplace = search(wordToGuess, letter);	
				Array.set(asteriskArray, indexToReplace, letter);
				play();
			}
			else if (search(wordToGuess, letter) < 0)
			{
				System.out.println(letter + " is not in the word");
				misses++;
				play();
			}
			else if (search(asteriskArray, letter) >= 0)
			{
				System.out.println(letter + "is already in the word");
				misses++;
				play();
			}
		}
		else 
		{
			System.out.println("The word is " + words[choice] + ".  You missed " + misses + " times.");
			playAgain();
		}
	}	
	
	// Do you want to play again?
		public static void playAgain()
		{
			Scanner input = new Scanner(System.in);
			System.out.println("Do you want to guess another word? Enter y or n>");
			String answer = input.next();
			if (answer.equalsIgnoreCase("y"))
			{
				pickWordToGuess();
			}
			else if (answer.equalsIgnoreCase("n"))
			{
				System.exit(0);
			}
			else
			{
				System.out.println("Error in input");
				playAgain();
			}
			
		}
	
	
}
