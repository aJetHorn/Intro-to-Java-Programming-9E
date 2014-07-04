/* Decimal to binary
 * Convert a given decimal number (base 10) to a binary number
 * 
 * This is a great exercise to test your understanding 
 * There are many, many, ways to approach this problem, 
 * just don't use Integer.toBinaryString(int). That's cheating!!!
 */
import java.util.Scanner;
public class Exercise4_37 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer to be converted to binary:");
		int numberToConvert = input.nextInt();
		String binaryNumber = "";
		
		while (numberToConvert >= 1){
			if (numberToConvert % 2 == 1){ //this is a conversion shortcut
				//
				binaryNumber = "1" + binaryNumber;
			}
			else {
				binaryNumber = "0" + binaryNumber;
			}
			numberToConvert /= 2;
		}

		System.out.println("Binary number is: " + binaryNumber);
	
		
	}
}
