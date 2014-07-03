/*
 * Business: check ISBN-10
 * Last digit of an ISBN is a checksum, calculated from the other nine:
 * (d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11
 * There are a variety of ways to approach this (the wonders of programming)
 */
import java.util.Scanner;
public class Exercise3_9 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		/*
		 * book instructs you to take input as an int while preserving leading zeros
		 * This is impossible to do without using loops or a lot of if statements for 
		 * input, especially when accounting for numbers such as 000000013. By my way of
		 * thinking, the examples given in the book are impossible to achieve given
		 * the constraints. Sure, we can handle leading zeros, but there is no way to tell
		 * if 9 digits were actually entered without splitting up the statements (going digit
		 * by digit) or by using strings. Let's assume no leading zeros to simplify things.
		 */
		System.out.println("Enter 9 digit ISBN with no leading zero(s):");
		int nineDigitISBN = input.nextInt();
		if (nineDigitISBN >= 100000000){
			int nineDigitISBNTemp = nineDigitISBN;
			int checksum = 0;
			int digitNine = nineDigitISBNTemp % 10;
			nineDigitISBNTemp /= 10;
			int digitEight = nineDigitISBNTemp % 10;
			nineDigitISBNTemp /= 10;
			int digitSeven = nineDigitISBNTemp % 10;
			nineDigitISBNTemp /= 10;
			int digitSix = nineDigitISBNTemp % 10;
			nineDigitISBNTemp /= 10;
			int digitFive = nineDigitISBNTemp % 10;
			nineDigitISBNTemp /= 10;
			int digitFour = nineDigitISBNTemp % 10;
			nineDigitISBNTemp /= 10;
			int digitThree = nineDigitISBNTemp % 10;
			nineDigitISBNTemp /= 10;
			int digitTwo = nineDigitISBNTemp % 10;
			nineDigitISBNTemp /= 10;
			int digitOne = nineDigitISBNTemp % 10;
			nineDigitISBNTemp /= 10;
			
			checksum = (digitOne + 2*digitTwo + 3*digitThree + 4*digitFour +
					5*digitFive + 6*digitSix + 7*digitSeven + 8*digitEight +
					9*digitNine) % 11;
		
			if (checksum == 10){
				System.out.println("ISBN is: " + nineDigitISBN + "X");
			}
			else{
				System.out.println("ISBN is: " + nineDigitISBN + checksum);
			}
		}
		else {
			System.out.println("You didn't ender a nine digit integer");
		}
		
	}
}
