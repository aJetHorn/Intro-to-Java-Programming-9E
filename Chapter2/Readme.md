Chapters 2 through 4 are extremely important to form a basic understanding of the language. The book does a good job of explaining these concepts. My notes for these chapters should be treated as a supplement.

For many programming assignments you will receive, reading input from the console is very important. You may be thinking that none of the programs you use on a daily basis take input in this manner. As programs become more advanced, they take input input in a variety of different and more effective ways. This includes command line args, reading from files, communicating with other programs, or much more aesthetically pleasing GUI textboxes and buttons, which can be seen all over your web browser.

Let's look at the supplied program that computes an average:

```
import java.util.Scanner;
public class ComputeAVerage {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter three numbers: ");
		double number1 = input.nextDouble();
		double number2 = input.nextDouble();
		double number3 = input.nextDouble();

		double average = (number1 + number2 + number3) / 3;

		System.out.println("Average is: " + average);
	}
}
```

There's your first program. You still have work to do. Depending on the input format, this program could be written in even fewer lines with even more powerful and more easily modified tools. 

##Identifiers
My first quiz in my Intro to Java class was entirely on identifiers. We had to determine which were valid or not. It was kind of cruel, but I only got one question wrong.

-identifiers can only start with letters, underscores, or dollar signs. The dollar sign is what I got wrong.
-identifiers can't be reserved words (like int, double, class, static) or true/false/null
-identifiers can only consist of letters, numbers, underscores, and dollar signs. Every other character is used by Java.

##Naming Conventions
camelcase is standard and is a key part of formatting. Spaces screw up the parsing of most language, so programmers tend to use underscores (for limited applications) or, most commonly, no space at all. The way that you can best represent breaks between words is by using diferent cases. Looking at the phrase thebigbluehouse is confusing, so programmers would write it as TheBigBlueHouse or theBigBlueHouse. Capitalizing the first letter of the first word is used for class names, while keeping the first word all lowercase is used for pretty much everything else. You name a constant like THE_BIG_BLUE_HOUSE. These standards persist, in some way, throughout all programming languages. You will pick up naming conventions rather quickly as you read and write more code.

##Operators
**+ - * / %**
% is the modulus. It returns a remainder z when x is divided by y. So, while 20 / 7 = 2 (as a truncated integer), 20 % 7 = 6.
If you are a university student you will have plenty of assignments involving this. Believe it or not, it is really useful and has a wide range of applications.
Note that the caret symbol is not present. It isn't the power operator. Finding the power or square root isn't as simple as using a symbolic operator, the Math package provides all of that and more.

You can also use operators to augment assignment to variables, changing i = i + 2 to i += 2 yields the same result, and is common practice.

##Operator Precedence
PEMDAS still applies, with two caveats: 
1. There is no exponent operator symbol (so it loses its high precedence)
2. Expressions are evaluated from left to right for symbols of the same precedence

##Increments and Decrements
i++ increments i after i is evaluated
++i increments i before i is evaluated
i-- and --i are used the same way

###Software Development Lifecycle
This is an interesting topic to include in Chapter 2 of an Intro book. The fact of the matter is that you aren't going into the industry tomorrow, and though you'll have to learn eventually, now, regardless of what stage of learning you're in, you want to develop programs in a way that is most conducive to your learning and immediate success. 

##Escape Characters
How do you quote something already in quotes?
```
System.out.println(""Mayonnaise colored Benz, I push Miracle Whips" -Kanye West");
```
*Doesn't work*

Using single quotes or some other contrived solution is not the answer. Just use an escape character, which is any character preceded by a backslash \.

Let's try this again.
```
System.out.println("\"And what you plannin' for this summer, I did it prior\" -Drake");
```
That works. Let's try it with the most popular escape character in existence- the newline character: \n

```
System.out.println("\"I'm in your house, got the key to your home\n"+
	"I am Jeopardy asked, Wikipedia known\n"+
	"I am A.A. driven and Expedia flown\n"+
	"So stop jackin\' my style\n"+
	"You\'re in need of ya own, man\"\n"+
	"-Drake");
```

##Strings
Strings are a fascinating part of Java. The book explains them sufficiently, but it is worthwhile to understand many of the built-in string manipulaiton methods. CodingBat (a website linked in the readme) has great challenges that will help you increase your knowledge.
