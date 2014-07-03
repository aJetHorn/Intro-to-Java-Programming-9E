/*
 * Random character: write a program that displays a random uppercase character
 * Capital letters start at 65. Let's explore a few ways to approach this
 */
public class Exercise3_16 {
	public static void main(String[] args){
		char randomCapital = (char)(65 + Math.random()*26);
		System.out.println(randomCapital);
	}
}
	
