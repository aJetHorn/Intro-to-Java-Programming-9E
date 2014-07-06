/*
 * (Financial: credit card number validation)
 * 
 * Rather than typing the entire description of the problem, I will instead point you to Google,
 * as there are many informative guides on the internet if you don't know how validation works
 * 
 * This is a great practice problem. I've seen a class assignment in a data structures class modeled
 * around card validation (though it was considerably more complex). 
 * 
 * Method headers are given. Uses Mod 10/Luhn check
 */
import java.util.Scanner;
public class Exercise5_31 {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a 13 - 16 digit credit card number: ");
		long ccNumber = input.nextLong();
		
		if (isValid(ccNumber)){
			System.out.println(ccNumber + " is valid");
		}
		else{
			System.out.println(ccNumber + " is not valid");
		}
	}
	public static boolean isValid(long number){
		boolean validPrefix = (prefixMatched(number, 4) || prefixMatched(number, 5) || prefixMatched(number, 37) || prefixMatched(number, 6));
		boolean validSize = getSize(number) >= 13 && getSize(number) <= 16;
		boolean checksumIsValid = ((sumOfOddPlaces(number) + sumOfDoubleEvenPlace(number)) % 10 == 0);	
		
		return validPrefix && validSize && checksumIsValid;
	}
	public static int sumOfDoubleEvenPlace(long number){
		int sum = 0;
		number /= 10;
		for (int i = 2; number > 0; i+=2){
			sum += getDigit((int)(2*(number % 10)));
			number /= 100;
		}
		return sum;
	}
	//assumes no more than two digits
	public static int getDigit(int number){
		if (number > 9){
			return (number / 10) + (number % 10);
		}
		return number;
		
	}
	public static int sumOfOddPlaces(long number){
		int sum = 0;
		for (int i = 1; number > 0; i+=2){
			sum += number % 10;
					//getDigit((int)(number % 10));
			number /= 100;
		}
		return sum;
	}
	
	public static boolean prefixMatched(long number, int d){
		return getPrefix(number, getSize(d)) == d;
	}
	
	public static int getSize(long d){
		int size = 0;
		for (long i = d; i > 0; i /= 10, size++){}
		return size;
	}
	
	public static long getPrefix(long number, int k){
		if (getSize(number) < k){
			return number;
		}
		return (long)(number / Math.pow(10, (getSize(number) - k)));
		
	}
}
