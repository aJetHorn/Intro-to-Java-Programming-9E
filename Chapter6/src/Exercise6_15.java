/*
 * Eliminate all duplicates in an array
 * WITHOUT using lists
 * There are many ways to do this
 */
public class Exercise6_15 {
	public static void main(String args[]){
		int[] intArray = {1,3,1,2,2,3,3,2};
		int[] dupsRemoved = eliminateDuplicates(intArray);

		System.out.println();
		for (int i: dupsRemoved){
			System.out.println(i);
		}
	}
	public static int[] eliminateDuplicates(int[] list){
		int[] tempList = new int[list.length];
		int newListSize = 0;
		for (int i = 0; i < list.length; i++){
			if (hasNextDuplicate(i, list) && !arrayContainsNumber(tempList, list[i])){
				tempList[newListSize] = list[i];
				newListSize++;
			}
		}

		int[] returnList = new int[newListSize++];
		System.arraycopy(tempList, 0, returnList, 0, returnList.length);
		return returnList;
	}
	public static boolean hasNextDuplicate(int index, int[] list){ //returns true if there is a duplicate to the right
		for (int i = index + 1; i < list.length; i++){
				if (list[i] == list[index]){
					return true;
				}
		}
		return false;
	}
	public static boolean arrayContainsNumber(int[] list, int number){ //we're going to implement a slightly modified linear search
		for (int i = 0; i < list.length; i++){
			if (list[i] == number){
				return true;
			}		
		}
		return false;
	}
}
