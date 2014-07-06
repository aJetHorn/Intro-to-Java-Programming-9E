
public class BinarySearch {
	public static void main(String args[]){
		int[] exampleArray = {1,2,3,4,5,6};
		System.out.println(binarySearch(exampleArray,6));
	}
	public static int binarySearch(int[] list, int key){
		int low = 0, high = list.length - 1;
		while (high >= low){
			int mid = (low + high) / 2;
			if (key < list[mid]){
				high = mid - 1;
			}
			else if (key == list[mid]){
				return mid;
			}
			else{
				low = mid + 1;
			}
		}
		return -1;
	}
}
