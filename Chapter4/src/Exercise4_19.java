/* This is NOT Pascal's triangle
 * Display numbers in a pyramid pattern
 * Write a nested for loop that prints the following output...
 * Page 169
 * 
 * This problem requires careful planning before you approach it
 * Go row by row, number by number, look for the obvious patterns
 * I'm going to use arrays, my solution is far from perfect but works
 * 
 * If you aren't comfortable enough yet using printf statements,
 * just use print statements and try to get spacing as close as possible
 * The code to get it to look perfect using print statements gets outrageous
 * 
 * This took me much longer than I'd like to admit
 */
public class Exercise4_19 {
	public static void main(String args[]){
		for (int i = 0; i < 9; i++){
			for (int l = 8 - i; l > 0; l--){
				System.out.print("    "); //roughly 3 per line besides the last line.
			}
			for (int j = 0; j < i; j++){
				System.out.printf("%3d ", (int)Math.pow(2,j));
			}
			for (int k = i; k > 1; k--){
				System.out.printf("%3d ", (int)Math.pow(2,k-2));
			}
			System.out.println();
		}
	}
}
