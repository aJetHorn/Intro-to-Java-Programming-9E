//Selection Sort from the book
public class SelectionSort {
	public static void main(String[] args){
		double[] doubleArray = {1.2, 0.5, 5.1, 1.3};
		selectionSort(doubleArray);
		for (double i: doubleArray){
			System.out.println(i);
		}
	}
	public static void selectionSort(double[] list){
		for (int i = 0; i < list.length - 1; i++){
			double currentMin = list[i];
			int currentMinIndex = i;
			
			for (int j = i + 1; j < list.length; j++){
				if (currentMin > list[j]){
					currentMin = list[j];
					currentMinIndex = j;
				}
			}
			
			if (currentMinIndex != i){
				list[currentMinIndex] = list[i];
				list[i] = currentMin;
			}
		}
	}
}
