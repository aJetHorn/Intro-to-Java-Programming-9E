#Selections

```
if (false){
	System.out.println("This chapter isn't important");
}
else{
	System.out.println("This chapter is important");
}
```
Choose which statement you think gets evaluated.

##Booleans are big
Remember those binary numbers we talked about in Chapter 1? It's a bit fuzzy to me, too. All you have to remember that 1 is true and 0 is false. It's one of the central pillars of computer science. In Java, there is a data type called Boolean that evaluates to either true or false, nothing else. 

Here is how you declare a boolean:
```
boolean thisIsTrue = true;
boolean thisIsFalse = false
```
That might not seem too useful, but that is only the most basic declaration. As the chapter goes on, things will get more complicated and the power of logic will become clear to you.

##If, Else
```
//... code excerpt ... 
double totalAmountRemaining = input.nextDouble();
if (totalAmount < 0){
	System.out.println("Amount cannot be less than 0!");
}
else{
	System.out.println("The total amount remaining is: " + totalAmountRemaining);
	if (true){
		System.out.println("This is called nesting");
	}
}
```
This barely scratches the surface of the usefulness of if-else statements. I will do many of the practice problems.

##Random Number Generation
```
int randomNumber = (int)(Math.random() * 10); 
//generates a number between 0 and 9
```

##Logical operators
```
! not
&& and
|| or
^ exclusive or
```
Now things start to heat up. Suddenly, truth tables are abound. This book isn't anywhere near as thorough with truth tables as some are. They are a great tool for evaluating complex logical expressions. If you ever take a discrete math class, you'll be shocked at how prevalent they are.

```
boolean x = true;
boolean y = false;
if (((x && y) ^ ((y ^ x) || !y)) && (y ^ !y) && (x ^ !x || !y || !(x^x))){
	System.out.println("Yes, this is a valid expression (it's true!)");
}
```

###Printf
A slightly less intuitive yet significantly more powerful statement to print (formatted) output
