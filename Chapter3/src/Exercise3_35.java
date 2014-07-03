/*
 * Decimal to hex
 * Write a program that prompts the user to enter an integer between 0 and 15 and displays
 * its corresponding hex number. 
 * Example: 11 -> B, 5 -> 5, 31 ?
 */
import java.util.Scanner;
public class Exercise3_35 {
	public static void main(String[] main){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number between 0 and 15: ");
		int inputNumber = input.nextInt();
		
		if (inputNumber >= 0 && inputNumber <= 15){
			if (inputNumber >= 10){
				char outputChar = (char)(65 + inputNumber - 10);
				System.out.println("Hex value is: " + outputChar);
			}
			else{
				System.out.println("Hex value is: " + inputNumber);
			}
		}
		else{
			System.out.println("Error, must enter a number between 0 and 15");
		}
		char test = (char)65;
	}
}
