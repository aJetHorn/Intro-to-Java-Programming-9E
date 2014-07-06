
public class MethodExample {
	public static void main(String[] args){
		
/*		for (int i = 0; i <= 100; i++){
			System.out.println(i);
		}
		System.out.println();
		
		for (int i = 0; i <= 100; i+=2){
			System.out.println(i);
		}
		System.out.println();
		
		for (int i = 0; i <= 100; i+=7){
			System.out.println(i);
		}
		System.out.println();

		for (double i = 0; i <= 100; i+=.655){
			System.out.println(i);
		}
		System.out.println();*/
		
		printSequence(100);
		printSequence(2, 100);
		printSequence(7, 100);
		printSequence(.655, 100);

	}
	public static void printSequence(int max){
		for (int i = 0; i <= max; i++){
			System.out.println(i);
		}
		System.out.println();
	}
	public static void printSequence(int increment, int max){
		for (int i = 0; i <= max; i += increment){
			System.out.println(i);
		}
		System.out.println();
	}
	public static void printSequence(double increment, double max){
		for (double i = 0; i <= max; i += increment){
			System.out.println(i);
		}
		System.out.println();
	}
}
	
