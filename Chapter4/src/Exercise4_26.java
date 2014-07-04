/*
 * Approximate e
 * e = 1 + 1/1! + 1/2! + 1/i!
 * This can be done more efficiently if the book's hint is followed
 */
public class Exercise4_26 {
	public static void main(String args[]){
		int numTo = 100000;
		final double E = Math.E;
		double eApproximate = 1;
		
		for (int i = 1; i < numTo; i++){
			double factorial = 1;
			for (int j = i; j >= 1; j--){ //this is for calculating the factorial
				factorial *= j;
			}
			eApproximate += 1 / factorial;
		}
		System.out.println("The value of E is: " + E);
		System.out.println("e was approximated as: " + eApproximate);
		double difference = E - eApproximate;
		System.out.println("The difference is: " + difference);
		//that's small!
	}
}
