/*(Statistics: Computer mean and standard deviation)
 * 
 * Write a program that prompts the user to enter ten numbers,
 * and displays the mean and standard deviations of these numbers using the following formulas
 * 
 * See page 175 or google formulas for mean or standard deviation
 * 
 * Believe it or not, this is quite straightforward.
 * 
 */
import java.util.Scanner;
public class Exercise4_47 {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		final int INPUT_NUMBER = 10; //this is a good example of when to use a constant
		System.out.println("Enter " + INPUT_NUMBER + " numbers (they can be doubles):");
		double total = 0;
		double totalSquares = 0; //can you think of a more efficient way to find this?
		
		for (int i = 0; i < INPUT_NUMBER; i++){
			double number = input.nextDouble();
			total += number;
			totalSquares += Math.pow(number,2);
		}
		double mean = total / INPUT_NUMBER;
		double stdDeviation = Math.sqrt((totalSquares - (Math.pow(total, 2) / INPUT_NUMBER)) /
				(INPUT_NUMBER - 1));
		//Since you've been learning math your entire life, formulas should be nothing new to you
		//being able to break them into code is a valuable skill. Later in the book, we'll try
		//more advanced geometry, statistics, and calculus.
		
		System.out.println("The mean is: " + mean);
		System.out.println("The Standard Deviation is: " + stdDeviation);	
	}
}
