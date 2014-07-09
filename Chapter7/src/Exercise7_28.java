/*Strictly Identical Arrays
 * check if two arrays are exactly identical
 */
public class Exercise7_28 {
	public static void main(String args[]){
		
		int[][] a = {{1,2,3},
				{4,5,6},
				{7,8,9}};

		int[][] b = {{1,2,3},
				{4,5,6},
				{7,8,9}};
		
		System.out.println(equals(a,b));
		
	}
	public static boolean equals(int[][] m1, int[][] m2){
		if (m1.length != m2.length){
			return false;
		}
		for (int i = 0; i < m1.length; i++){
			for (int j = 0; j < m1[i].length; j++){
				if (m1[i].length != m2[i].length){
					return false;
				}
				if (m1[i][j] != m2[i][j]){
					return false;
				}
			}
		}
	return true;
	}
}
