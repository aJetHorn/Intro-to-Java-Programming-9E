/*
 * (Palindromic Primes)
 * ten numbers per line
 * 
 * This is a great chance to modify the code from CH4's prime number finder
 */
import java.util.Scanner;
public class Exercise5_26 {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter how many palindromic primes you'd like to print:");
		int numberPrime = input.nextInt();
		
		for (int i = 1, number = 2; i <= numberPrime; number++){
			if (isPrime(number) && isPalindrome(number)){
				System.out.println("Prime number " + i + " is " + number);
				i++;
			}
		}

	}
	public static boolean isPrime(int x){
		for (int i = 2; i * i <= x; i++){
			if (x % i == 0 && i != x){
				return false;
			}
		}
		return true;
	}
	
	public static boolean isPalindrome(int x){
		char[] charArray = ("" + x).toCharArray();
		int lastIndex = charArray.length - 1;
		for (int i = 0; i <= lastIndex - i; i++){
			if (charArray[i] != charArray[lastIndex - i]){
				return false;
			}
		}
		return true;
	}
}
