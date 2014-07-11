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
		System.out.println("Latin Square:" + isLatinSquare(square));
		System.out.println("Is Reduced: " + isInReducedForm(square));
		printLatinSquare(square);
		
		char[][] generatedSquare = generateFilledLatinSquare(3);
		System.out.println("Latin Square: " + isLatinSquare(generatedSquare));
		System.out.println("Is Reduced: " + isInReducedForm(generatedSquare));
		printLatinSquare(generatedSquare);
		
		char[][] generatedReducedSquare = generateReducedLatinSquare(3);
		System.out.println("Latin Square: " + isLatinSquare(generatedReducedSquare));
		System.out.println("Is Reduced: " + isInReducedForm(generatedReducedSquare));
		printLatinSquare(generatedReducedSquare);
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
	
	public static char[][] generateFilledLatinSquare(int size){
		//all numbers exist an equal amount of times
		//this is a brute force method
		char[][] square = new char[size][size];
		int[] charUsesLeft = populateCharUsesLeft(size);
		int tries = 0;
		while (!isFilled(square) && tries < Math.pow(2, size + 2)){
			//System.out.println("Square isn't filled");
			char letter = genChar(size);
			//System.out.println("Character Generated is: " + letter);

			while (!charHasUsesLeft(letter, charUsesLeft)){
				letter = genChar(size);
				//System.out.println("Character Generated is: " + letter);
			}
			
			int x = genRandomCoordinate(size);
			int y = genRandomCoordinate(size);
			//System.out.println("X: " + x + " and Y: " + y);
			if (!isLetter(square[x][y])
					&& !conflictExists(x, y, letter, square)){
				//System.out.println("#Character: " + letter + " Placed in " + x + ", " + y);
				square[x][y] = letter;
				charUsesLeft[(int)(letter - 65)]--;
			}
			
			if (tries++ == Math.pow(2,  size + 1)){
				//System.out.println("Resetting Board");
				square = new char[size][size];
				charUsesLeft = populateCharUsesLeft(size);
				tries = 0;
			}
			
		}
		return square;
	}
	public static char[][] generateReducedLatinSquare(int size){
		//all numbers exist an equal amount of times
		//this is a brute force method
		char[][] square = new char[size][size];
		int[] charUsesLeft = populateCharUsesLeft(size);
		int tries = 0;
		while (!isInReducedForm(square)){
		while (!isFilled(square) && tries < Math.pow(2, size + 2)){
			//System.out.println("Square isn't filled");
			char letter = genChar(size);
			//System.out.println("Character Generated is: " + letter);

			while (!charHasUsesLeft(letter, charUsesLeft)){
				letter = genChar(size);
				//System.out.println("Character Generated is: " + letter);
			}
			
			int x = genRandomCoordinate(size);
			int y = genRandomCoordinate(size);
			//System.out.println("X: " + x + " and Y: " + y);
			if (!isLetter(square[x][y])
					&& !conflictExists(x, y, letter, square)){
				//System.out.println("#Character: " + letter + " Placed in " + x + ", " + y);
				square[x][y] = letter;
				charUsesLeft[(int)(letter - 65)]--;
			}
			
			if (tries++ == Math.pow(2,  size + 1)){
				//System.out.println("Resetting Board");
				square = new char[size][size];
				charUsesLeft = populateCharUsesLeft(size);
				tries = 0;
			}
			
		}
			if (!isInReducedForm(square)){
				System.out.println("Square created, though not reduced");
			}
		}
		return square;
	}
	
	public static boolean conflictExists(int x, int y, char ch, char[][] square){
				//test row, x fixed
				for (int i = 0; i < square.length; i++){
					if (i != y && square[x][i] == ch)
						return true;
				}
				//test column, y fixed
				for (int j = 0; j < square.length; j++){
					if (j != x && square[j][y] == ch)
						return true;
		}
		return false;
	}
	public static boolean isFilled(char[][] array){
		for (int i = 0; i < array.length; i++){
			for (int j = 0; j < array[i].length; j++){
				if (!isLetter(array[i][j])){
					return false;
				}
			}
		}
		return true;
	}
	
	public static boolean isLetter(char ch){
		return Character.isLetter(ch);
	}
	
	public static char genChar(int size){
		return (char)(65 + (int)(Math.random()*(size)));
	}
	
	public static int genRandomCoordinate(int size){
		return (char)(int)(Math.random() * (size));
	}
	
	public static boolean charHasUsesLeft(char ch, int usesLeft[]){
		return usesLeft[(int)(ch - 65)] > 0;
	}
	
	public static int[] populateCharUsesLeft(int size){
		int[] charUsesLeft = new int[size];
		for (int i = 0; i < size; i++){
			charUsesLeft[i] = size;
		}
		return charUsesLeft;
	}
	
	public static void printLatinSquare(char[][] square){
		for (int i = 0; i < square.length; i++){
			for (int j = 0; j < square[i].length; j++){
				System.out.print(square[i][j] + " ");
			}
			System.out.println();
		}
	}

}

