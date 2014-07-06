/*
 * Example of LinearSearch similar to what is found in the book
 */
public class LinearSearch {
	public static void main(String args[]){
		int[] exampleArray = {1,2,3};
		System.out.println(linearSearch(exampleArray,2));
	}
	public static int linearSearch(int[] list, int key){
		for (int i = 0; i < list.length; i++){
			if (key == list[i]){
				return i;
			}
		}
		return -1;
	}
}
