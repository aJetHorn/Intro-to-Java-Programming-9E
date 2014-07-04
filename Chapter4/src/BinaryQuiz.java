/*
 * Here is an example of a for loop that I came up with
 * Once you understand it, can you think of better approaches?
 * Do you know your powers of 2?
 */
import java.util.Scanner;
public class BinaryQuiz {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to the Binary Quiz");
		System.out.println("Try to make it to 2^31!");
		
		for (int i = 0; i < 32; i++){ //this will iterate 32 times
			System.out.println("What is 2^" + i + "?");
			int answer = input.nextInt();
			if (answer == Math.pow(2, i)){
				System.out.println(answer + " is correct!");
			}
			else{
				System.out.println("Incorrect!");
				i--; 
				/*
				 * See what happens here?
				 * On the next iteration, i will be the same as it was on this iteration.
				 * No skipping questions!
				 */
			}
			if (i >= 16){ //delete this if you want to play all the way
				System.out.println("Just kidding, we'll stop there.");
				i = 31; //this will terminate the loop
				//there is another way to terminate the loop, it's called break.
			}
		}
		System.out.println("You won!");

	}
}
