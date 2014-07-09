/*Write a method to add two matrices
 * 
 */
public class Exercise7_5 {
	public static void main(String args[]){
		double[][] a = {{1,2,3},
						{4,5,6},
						{7,8,9}};
		
		double[][] b = {{1,2,3},
						{4,5,6},
						{7,8,9}};
		
		double[][] c = addMatrix(a, b);
		
		for (int i = 0; i < a.length; i++){
			for (int j = 0; j < a[i].length; j++){
				System.out.printf("%6.2f ", c[i][j]);
			}
			System.out.println();
		}
	}
	public static double[][] addMatrix(double[][] a, double[][] b){
		//assume same dimensions
		double[][] sumMatrix = new double[a.length][a[1].length];
		for (int i = 0; i < a.length; i++){
			for (int j = 0; j < a[i].length; j++){
				sumMatrix[i][j] = a[i][j] + b[i][j];
			}
		}
		return sumMatrix;
	}
}
