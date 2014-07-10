/*Markov Matrix
 * n * n matric is a markov matrix if each element is positive and the sum of elements in each column is 1
 * Won't work with some decimals
 */
public class Exercise7_25 {
	public static void main(String args[]){
		double[][] a = {{0,.75,1},
						{.5,.25,0},
						{.5,0,0}};
		System.out.println(isMarkovMatrix(a));
	}
	public static boolean isMarkovMatrix(double[][] m){	
		if (m.length != m[0].length){
			return false;
		}
		for (int i = 0; i < m.length; i++){
			double sum = 0;
			for (int j = 0; j < m[i].length; j++){
				sum += m[j][i];
			}
			if (sum != 1){
				return false;
			}
		}
		return true;
	}
}
