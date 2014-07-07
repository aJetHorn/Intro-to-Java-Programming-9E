/*
 * Eliminate all duplicates in an array
 */
public class Exercise6_15 {
	public static void main(String args[]){
		int[] intArray = {1,3,1,2,2,3,3,2};
		int[] dupsRemoved = eliminateDuplicates(intArray);

		for (int i: dupsRemoved){
			System.out.println(i);
		}
	}
	public static int[] eliminateDuplicates(int[] list){
		String tempList = ";";
		for (int i = 0; i < list.length; i++){
			if (isDuplicated(i, list) && !tempList.contains(";" + list[i] + ";")){
				tempList += list[i] + ";";
			}
		}
		
		String[] numbers = tempList.split(";");
		int[] intArray = new int[numbers.length];
		for (int i = 0; i < intArray.length; i++) {
		       intArray[i] = Integer.parseInt(numbers[i]);
		}
		return intArray;
	}
	public static boolean isDuplicated(int index, int[] list){
		for (int i = index + 1; i < list.length; i++){
				if (list[i] == list[index]){
					return true;
			}
		}
		return true;
	}
}
