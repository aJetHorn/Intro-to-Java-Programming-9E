
public class InsertionSort {
	public static void main(String[] args){
		double[] doubleArray = {1.2, 0.5, 5.1, 1.3};
		insertionSort(doubleArray);
		for (double i: doubleArray){
			System.out.println(i);
		}
	}
	public static void insertionSort(double[] list){
		for (int i = 1; i < list.length; i++){
			double currentElement = list[i];
			int k;
			for (k = i - 1; k >= 0 && list[k] > currentElement; k--){
				list[k + 1] = list[k];
			}
		}
	}
}
