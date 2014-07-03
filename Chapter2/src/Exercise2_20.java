/*
 * Financial application: calculate interest of next monthly payment
 * interest = balance * (annualRate / 1200)
 */
import java.util.Scanner;
public class Exercise2_20 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Balance and interest rate: ");
		double balance = input.nextDouble();
		double interestRate = input.nextDouble();
		
		double interest = balance * (interestRate / 1200);
		
		System.out.println("The interest is: " + interest);
	}
}
