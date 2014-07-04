/*(Compute pi)
 * 
 * Approximate pi (again, now using a loop!)
 * Write a program that displays the pi value for i - 10000 20000 and 100000
 * Remember the formula?
 * 
 * pi = 4(1 +(-1)^(i+1)/(2i-1))
 * We're going to switch it up a little.
 */
public class Exercise4_25 {
	public static void main(String[] args){
		final double PI = Math.PI;
		int numTo = 10000000; //ten million
		double piApproximate = 1;
		
		for (int i = 2; i < numTo; i++){
			piApproximate += Math.pow(-1, i + 1) / ( 2* i - 1);
		}
		piApproximate *= 4;
		
		System.out.println("Pi's value is: " + PI);
		System.out.println("You approximated to be: " + piApproximate);
		double difference = PI - piApproximate;
		System.out.println("The difference is: " + difference);
		//That's small!
	}
}
