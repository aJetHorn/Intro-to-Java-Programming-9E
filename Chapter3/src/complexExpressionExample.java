
public class complexExpressionExample{
	public static void main(String args[]){
		boolean x = true;
		boolean y = false;
		if (((x && y) ^ ((y ^ x) || !y)) && (y ^ !y) && (x ^ !x || !y || !(x^x))){
			System.out.println("Yes, this is a valid expression (it's true!)");
		}
	}
}
