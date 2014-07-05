#Methods

Methods make code reusable

Let's say that you have a program that counts from 1 - 100 four ways: normally, by 2's, by 7's and by .655.

Your code could look like this:

```
public class MethodExample {
	public static void main(String[] args){
		for (int i = 0; i <= 100; i++){
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
		System.out.println();

	}
}
```

That works. And up until this point, that's how you would write a program with that functionality. Notice the similarities in the for loops. They're all doing pretty much the same thing. We can simplify this using a method. Just like loops and if statements, methods will take some practicing before you get comfortable with them. Unlike loops and if statements, you can get by without using methods. Barely, but you can get by. We've done alright so far, haven't we?

Perhaps this is a poor example, but this is an example of what the above code could look like if you used methods. This example touches on a few key concepts of methods.

```
public class MethodExample {
	public static void main(String[] args){
		
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

```

I like the way the book introduces methods. I recommend a thorough read through of this chapter, I will do an abundant number of practice problems and further explain some concepts there.

##Note on Usage
While the book's author uses the correct term 'method', I occassionally use the word 'function'. The way I see it, Java only has methods, which are tied to objects. Though, functions (think of a mathematical function) are very similar, methods and functions aren't the same thing. I am admitting that my use of the word function is incorrect. 

I also use 'parameter' and 'argument' interchangeably. This usage is incorect as well. A parameter is a variable declared when defining a method, such as `public void myMethod(int thisIsAParameter)`. An argument is what gets passed in when you call the function: `myMethod(thisIsAnArgument)`. Now you know.