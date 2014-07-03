/*
 * Financial application: Calculate future investment value
 * This is a good demonstration of the pow function
 * FV = PV * (1 + i)^t
 * Note that i is monthly rate, so you must divide by 12
 */
import java.util.Scanner;
public class Exercise2_21 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in); 
		//notice that you don't need a new scanner object each time you prompt for input
		System.out.print("Enter investment amount: ");
		double investmentAmount = input.nextDouble();
		System.out.print("Enter annual interest rate as a percentage: ");
		double interestRate = input.nextDouble()/100;
		System.out.print("Enter number of years: ");
		int years = input.nextInt();
		
		double accumulatedValue = investmentAmount * Math.pow((1.0 + interestRate/12), (years*12));
		
		System.out.println("Accumulated value is: " + accumulatedValue);
	}
}
