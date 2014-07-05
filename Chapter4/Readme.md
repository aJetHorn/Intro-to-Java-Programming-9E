You might have noticed that some of the programs in the last chapter got a bit long. For example, if you were to prompt a user for each ISBN digit separately, that would result in a lot of code that performs the same basic operation.

 Learning how loops work will open up the world of programming to you by simplifying redundant operations. You can harness all of the information from chapters 2 to 4 to write decently powerful programs. The code wouldn't be pretty, and would still be packed with redundance. What I'm trying to say is that loops are extremely important, and, unlike boolean expressions, are a bit more confusing. Spend a lot of time reviewing this chapter.

##While

 ```
 int count = 0;
 while (count < 10){
 	System.out.println("Count is: " + count);
 	count++;
}
 ```

If you don't understand what this does at first, that is fine. When you run the code, it will result in the following:
```
Count is: 0
Count is: 1
Count is: 2
Count is: 3
Count is: 4
Count is: 5
Count is: 6
Count is: 7
Count is: 8
Count is: 9
```
count < 10 is a boolean condition just like you learned in the last chapter. So, *while* the condition is true, the loop body will be executed. What stops a loop from running? Good question. Typically, a variable will be incremented until it causes the condition to no longer be true, at which point the loop will stop running.

It is common to initialize a loop variable with the number zero, as if you are working with arrays, the first index can be accessed with 0 (though I'm sure there are other applications).

####Listing 4.3 GuessNumber.Java
```
import java.util.Scanner;

public class GuessNumber {
	public static void main(String[] args) {
		int number = (int)(Math.random() * 100); //0 - 100
		Scanner input = new Scanner(System.in);
		System.out.println("Try to guess the number between 0 and 100");

		int guess = -1; //initializing with a number not in the range makes sense.
		while (guess != number){
			//the loop will iterate (that's geek speak for run once) until the number is guessed correctly
			System.out.println("\nEnter your guess: ");
			guess = input.nextInt();

			if (guess == number){
				System.out.println("Correct, the number is: " + number);
			}
			else if (guess > number){
				System.out.println("Your guess is too high");
			}
			else{
				System.out.println("Your guess is too low");

			}
		}

	}
}
```
Above is a great program for putting together what you've learned so far.

##Do-While

Do while is like a while except it will always run the loop body once. You may be surprised to learn that there are an awful lot of applications of this loop. Computer Science professors have a talent for finding examples where it makes sense to use the loop. It's certainly worth your time to learn how these loops work.

#For

For loops provide the most concise syntax for writing loops. They may be a bit intimidating, but are, by far, the most widely used loops in Java. I recommend practicing with While loops for some time before moving to for loops.

Here is a for loop header:
```
for (int i = 0; i < 10; i++){
	//Body
}
```
It is (functionally) equivalent to this while loop:
```
int i = 0;
while (i < 10){
	//body
	i++;
}

```
You will notice that I most often use the letter 'i' in my loops. As I nest my loops, which is exactly like it sounds, I will descend down the alphabet, going to 'j', 'k', 'l', 'm', and so on. I don' think I've ever gotten past 'm' in a practical example.

I'm going to jump right into some more advanced for loop examples. Here is my attempt at converting GuessNumber's while loop to a for loop. It works perfectly, though the loop header is ugly and isn't something you'd typically see in practice.
```
import java.util.Scanner;
public class GuessNumberFor {
		public static void main(String[] args) {
			int number = (int)(Math.random() * 100); //0 - 100
			Scanner input = new Scanner(System.in);
			System.out.println("Try to guess the number between 0 and 100");

			for (int guess = -1; guess != number; guess = input.nextInt()){	
				if (guess > number){
					System.out.println("Your guess is too high");
				}
				else if (guess >= 0){
					System.out.println("Your guess is too low");
				}
				System.out.println("\nEnter your guess: ");
			}
			System.out.println("Correct, the number is: " + number);

		}
	}
```
Remember binary numbers? They represent 2 to the *nth* power. Let's make a binary quiz game next.
```
import java.util.Scanner;
public class BinaryQuiz {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to the Binary Quiz");
		System.out.println("Try to make it to 2^31!");
		
		for (int i = 0; i < 32; i++){ //this will iterate 32 times
			System.out.println("What is 2^" + i + "?");
			int answer = input.nextInt();
			if (answer == Math.pow(2, i)){
				System.out.println(answer + " is correct!");
			}
			else{
				System.out.println("Incorrect!");
				i--; 
				/*
				 * See what happens here?
				 * On the next iteration, i will be the same as it was on this iteration.
				 * No skipping questions!
				 */
			}
			if (i >= 16){ //delete this if you want to play all the way
				System.out.println("Just kidding, we'll stop there.");
				i = 31; //this will terminate the loop
				//there is another way to terminate the loop, it's called break.
			}
		}
		System.out.println("You won!");

	}
}
```
It would have been cruel to go to 2147483648. Next time you're sitting in class, try to work your way up to 2^31. It keeps your mind sharp. Actually, maybe you should focus on the lecture. 

This next one is easy (though the code is complex), you can just enter a number n and watch it return all prime numbers up to and including that one. This is an extremely popular assignment early in intro classes. 
```
/* This is an advanced program that finds prime numbers up to the nth prime
 * There are many, many ways to approach this problem
 * Though this is not the most efficient implementation, it is far from worst case
 */
import java.util.Scanner;
public class PrintPrimes {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Which nth prime number would you like to print up to?");
		int numberPrime = input.nextInt(); //this is how many primes will be printed
		for (int i = 1, number = 1; i <= numberPrime; number++) {
			//this loop initializes two variables and increments one.
			//"i" is the number prime, "number" is the current number
			boolean isPrime = true; 
			//this can be done more efficiently with a method, we'll get there soon
			for (int j = 2; j * j <= number; j++){ 
				//factors are never greater than the sqrt of the number
				//this adds serious efficiency
				if (number % j == 0 && j != number){ //if a number is evenly divided by anything other than 
					isPrime = false; //the number isn't prime
				}
			}
			if (isPrime) {
				System.out.println("Prime number " + i + " is " + number);
				i++; //increments i now that a prime has been found
			}
		}
	}
}
```

Loop evaluation is something you will be frequently tested on, mainly because being able to create and evaluate loops efficiently is huge part of being a good programmer. It is also probably the most useful skill to possess going into the AP Computer Science exam.

Here's an interesting (and, by all means, ridiculous) for loop that I wrote
```
for (int i = 0; i++ < 1; System.out.println("This works, but is laughably contrived"));
```