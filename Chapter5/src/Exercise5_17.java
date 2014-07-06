/*
 * (Display a matrix of 0s and 1s)
 * Write a method that displays an n-by-n matrix using the following header:
 * public static void printMatrix(int n)
 * Each element is 1 or 0, generated randomly
 * n is how many rows and columns
 * 
 */
import java.util.Scanner;
public class Exercise5_17 {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number n: ");
		int inputNumber = input.nextInt();
		printMatrix(inputNumber);
	}
	public static void printMatrix(int n){
		for (int i = 0; i < n; i++){
			for (int j = 0; j < n; j++){
				int randomNum =  (int)(Math.random()*2);
				System.out.print(randomNum + " ");
			}
			System.out.println();
		}
		//That was simple, wasn't it?
	}
}
