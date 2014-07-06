
public class ArrayCreation {
	public static void main(String[] args){
		int[] newArray = randomArray(150);
		for (int i = 0; i < newArray.length; i++){
			System.out.println(newArray[i]);
		}
	}
	public static int[] randomArray(int size){
		//how to populate?
		//initializing it literally doesn't make sense
		int[] randomNumArray = new int[size];
		for (int i = 0; i < size; i++){
			randomNumArray[i] = (int)(Math.random()*101);
	 	}
//		for (int i: randomNumArray){ This doesn't work
//			i = (int)(Math.random()*101);
//		}
	 	return randomNumArray;
	}
}
