/*
 * This is the guess number method from the book
 * It is a great example of a while loop
 */
import java.util.Scanner;
public class GuessNumber {
	public static void main(String[] args) {
		int number = (int)(Math.random() * 100); //0 - 100
		Scanner input = new Scanner(System.in);
		System.out.println("Try to guess the number between 0 and 100");

		int guess = -1; //initializing with a number not in the range makes sense.
		while (guess != number){
			//the loop will iterate (that's geek speak for run once) until the number is guessed correctly
			System.out.println("\nEnter your guess: ");
			guess = input.nextInt();

			if (guess == number){
				System.out.println("Correct, the number is: " + number);
			}
			else if (guess > number){
				System.out.println("Your guess is too high");
			}
			else{
				System.out.println("Your guess is too low");

			}
		}

	}
}
