import java.util.Scanner;

/*
 * (emirp)
 * 
 * Prime numbers that are nonpalindromic but are still prime when reversed
 */
public class Exercise5_27 {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter how many palindromic primes you'd like to print:");
		int numberPrime = input.nextInt();
		
		for (int i = 1, number = 2; i <= numberPrime; number++){
			if (isEmirp(number)){
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
	public static boolean isEmirp(int x){
		char[] charArray = ("" + x).toCharArray();
		int lastIndex = charArray.length - 1;
		for (int i = 0; i <= lastIndex - i; i++){
			char temp = charArray[i];
			charArray[i] = charArray[lastIndex - i];
			charArray[lastIndex - i] = temp;
		}
		int xReversed = Integer.parseInt(new String(charArray));
		//int xReversed = charArray.reverse();
		//yes, I realize I could have used .reverse instead
		
		return !isPalindrome(x) && isPrime(x) && isPrime(xReversed);
	}
}
