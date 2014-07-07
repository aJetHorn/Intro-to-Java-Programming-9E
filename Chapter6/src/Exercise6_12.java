/*
 * Reverse an array
 */
public class Exercise6_12 {
	public static void main(String args[]){
		int[] intArray = {1,2,3,4,5,6,6};
		reverseArray(intArray);
		for (int i: intArray){
			System.out.println(i);
		}
	}
	public static void reverseArray(int[] array){
		for (int i = 0, end = array.length -1; i < array.length / 2; i++, end--){
			if (i >= end){
				break;
			}
			int temp = array[i];
			array[i] = array[end];
			array[end] = temp;
		}
	}
}
