/*Latin Square
 * Basically sudoku with letters
 * http://en.wikipedia.org/wiki/Latin_square
 * 
 * Also inclues isReducedForm and reduceLatinSquare
 */
public class Exercise7_36 {
	public static void main(String args[]){
		char[][] square = {{'A', 'B', 'C'},
							{'B', 'C', 'A'},
							{'C', 'A', 'B'}};
		System.out.println(isLatinSquare(square));
		System.out.println(isInReducedForm(square));
	}
	public static boolean isLatinSquare(char[][] square){
		if (square.length != square[0].length){
			return false;
		}
		for (int i = 0; i < square.length; i++){
			for (int j = 0; j < square[i].length; j++){
				
				for (int k = 0; k < square[i].length; k++){
					if (j != k && square[i][k] == square [i][j])
						return false;
				}
				for (int l = 0; l < square[i].length; l++){
					if (i != l && square[l][j] == square [i][j])
						return false;
				}
				
			}
		}
		return true;
	}
	public static boolean isInReducedForm(char[][] square){
		//A latin square is in reduced form if the first row and column are in natural order (ABC, for example)
		if (!isLatinSquare(square)){
			return false;
		}
		for (int i = 1; i < square.length; i++){
			if (square[i-1][0] > square[i][0]){
				return false;
			}
		}
		for (int j = 1; j < square[0].length; j++){
			if (square[0][j-1] > square[0][j]){
				return false;
			}
		}
		return true;
	}
	public static char[][] reduceLatinSquare(char[][] square){
		//Think about how to do this by breaking the problem into pieces
		//Assume that the square input is already a latin square
		//returning to this later
		if (isInReducedForm(square)){
			return square;
		}
		
		return square;
		
	}
}

