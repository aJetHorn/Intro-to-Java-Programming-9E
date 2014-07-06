//Same functionality as "ArrayCreation" used to show how values are passed.
public class ArrayModification {
	public static void main(String[] args){
		int[] newArray = new int[150];
		randomArray(newArray);
		for (int i = 0; i < newArray.length; i++){
			System.out.println(newArray[i]);
		}
	}
	public static void randomArray(int[] array){
		for (int i = 0; i < array.length; i++){
			array[i] = (int)(Math.random()*101);
	 	}
	}
}
