/*
 * Write a program that checks if two arrays have the same contents
 * no restrictions
 * given header: public static boolean equals(int[] list1, int[] list2)
 * 
 * I'm going to show you the easy way first
 * Then, try it without sorting at all, manually or using a built in method
 * Then, if you haven't already, try it without creating another array
 * 
 * These are just for practice and aren't necessarily the most efficient
 */
import java.util.Scanner;
public class Exercise6_27 {
	public static void main(String args[]){
		int[] list1 = {1,2,3,4,5};
		int[] list2 = {3,4,1,5,2};
		boolean testEasy = equalsEasy(list1, list2);
		System.out.println(testEasy);
		
		//the arrays got changed, remember?
		//you can't reset an initialized array using literal notation
		int[] list3 = {1,2,3,4,5};
		int[] list4 = {3,4,1,5,2};
		boolean testHard = equalsHard(list3, list4);
		System.out.println(testHard);
	}
	public static boolean equalsEasy(int[] list1, int[] list2){
		java.util.Arrays.sort(list1);
		java.util.Arrays.sort(list2);
		
		if (list1.length != list2.length){
			return false;
		}
		
	for (int i = 0; i < list1.length; i++){
			if (list1[i] != list2[i]){
				return false;
			}
		}
	
		//can you implement a for each loop instead of the above?
		//do you understand why this doesn't work?
		 /*for (int i: list1){
			for (int j: list2){
				if (i != j){
					return false;
				}
			}
		 }
		 //*/
		return true;
	}
	//now lets try again
	public static boolean equalsHard(int[] list1, int[] list2){
		if (list1.length != list2.length){
			return false;
		}
		boolean[] indexMatch = new boolean[list1.length];
		for (int i = 0; i < list1.length; i++){
			for (int j = 0; j < list2.length; j++){
				if (list1[i] == list2[j] && !indexMatch[i] && !indexMatch[j]){
					indexMatch[i] = true;
					indexMatch[j] = true;
				}
			}
		}
		for (boolean x: indexMatch){
			if (!x){
				return false;
			}
		}
		return true;
	}
}
