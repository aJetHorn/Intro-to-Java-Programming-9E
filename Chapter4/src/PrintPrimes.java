/* This is an advanced program that finds prime numbers up to the nth prime
 * There are many, many ways to approach this problem
 * Though this is not the most efficient implementation, it is far from worst case
 */
import java.util.Scanner;
public class PrintPrimes {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Which nth prime number would you like to print up to?");
		int numberPrime = input.nextInt(); //this is how many primes will be printed
		for (int i = 1, number = 1; i <= numberPrime; number++) {
			//this loop initializes two variables and increments one.
			//"i" is the number prime, "number" is the current number
			boolean isPrime = true; 
			//this can be done more efficiently with a method, we'll get there soon
			for (int j = 2; j * j <= number; j++){ 
				//factors are never greater than the sqrt of the number
				//this adds serious efficiency
				if (number % j == 0 && j != number){ //if a number is evenly divided by anything other than 
					isPrime = false; //the number isn't prime
				}
			}
			if (isPrime) {
				System.out.println("Prime number " + i + " is " + number);
				i++; //increments i now that a prime has been found
			}
		}
	}
}