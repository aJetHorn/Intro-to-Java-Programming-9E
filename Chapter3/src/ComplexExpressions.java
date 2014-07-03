/*
 * Try to evaluate these complex logic expressions
 * don't worry about the code
 * run the program and focus on evaluating the expressions
 * These are pretty hard and unrealistic.
 */
import java.util.Scanner;
public class ComplexExpressions {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter \"true\" if true, \"false\" if false");
		String expr1 = "(!(true && false) && (!false ^ (false ^ !false))";
		boolean expressionOne = Boolean.parseBoolean(expr1);
		System.out.println(expr1);
		System.out.print("Answer: ");
		boolean answer = Boolean.parseBoolean(input.next());
		
		if (answer == expressionOne){
			System.out.println("Correct!\n");
			String expr2 = "true && !(true ^ false || true) && !false ^ false && (!(false == true)";
			boolean expressionTwo = Boolean.parseBoolean(expr2);
			System.out.println(expr2);
			System.out.print("Answer: ");
			answer = Boolean.parseBoolean(input.next());
			
			if (answer == expressionTwo){
				System.out.println("Correct!\n");
				String expr3 = "(true) ^ (!(false || false) && (!true ^ (false != (true ^ (!(false ^ true != (false && true) != true && false ))) && true)))";
				boolean expressionThree = Boolean.parseBoolean(expr3);
				System.out.println(expr3);
				System.out.print("Answer: ");
				answer = Boolean.parseBoolean(input.next());
				if (answer == expressionThree){
					System.out.println("You got everything correct!");
				}
				else{
					System.out.println("Wrong! So close!");
				}
			}
			else{
				System.out.println("You got the question wrong!");
			}
		}
		else{
			System.out.println("You got the question wrong!");
		}
		
		
	}
}
