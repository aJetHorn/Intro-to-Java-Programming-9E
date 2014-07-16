#Objects and Classes

After you finish this chapter, you'll have enough knowledge to be considered proficient in Java. Don't get me wrong, there's still plenty of value in this book, but, with an understanding of objects and classes, you'll be ready to develop real programs.

The above statement is a bit of a stretch, but the point is to get you to devour this chapter and to realize that you can do practically anything with Java. You can program anything, it's just a matter of breaking problems down and then writing code. You might be thinking, "Well, how am I going to make <insert ambitious project here> if all I'm doing is writing loops that print out patterns and solve trivial math problems?"

What you've learned so far is only the tip of the iceberg, and it only gets better from here. While most would agree that it's not a good idea to stop reading after chapter 8, you're well on your way, and it only gets more fun from here on out.

A Class is a template for creating objects. Like in the book, you can create a class called Circle which will provide a type of blueprint (including constructors) for creating Circle objects.

```
class Circle{
	double radius = 1;

	Circle(double newRadius){
		radius = newRadius;
	}
	double getArea(){
		return radius * radius * Math.PI;
	}
	double setRadius(double newRadius){
		radius = newRadius;
	}
}
```
Creating an object of a certain type is comparable to initializing an array, which is an object. `String[] stringArray = new String[5];` could be used as a reference for when you instantiate an object- `Circle myCircle = new Circle(5);`

Let's combine the two examples in the most contrived manner possible. Assuming that myCircle has been created: `String[] stringArray = new String[(int)myCircle.getArea()];` That works. Onward.

A file can only have one public class, the name of which must match the file name. 

###Constructors
A constructor has the same name as the class it is constructing objects of, has no return type, and are invoked using the new operator (as seen above).

The dot operator is used heavily when dealing with objects. It is used to reference variables `object.dataField` and invoke methods `object.doSomething()`. Instance methods and variables are invoked and exist within the object they are created. For example, obj1.setRadius(5) would only change the radius for obj1, not obj2.

##Using Classes from the Java Library

The Java API is huge, expansive, and extremely intimidating. The good news is that you probably won't be quizzed on the functions of a particular class at any time. While some classes (Date, Random, Math) are used extensively in intro classes, you don't have to commit every detail to memory. The great news is that the API is what makes Java such a great language- there is just so much at your fingertips ready to be imported, and even more available online.

##Static Keyword

This is one of the most important parts of understanding objects. Just like instance variables are unique to an instance, static variables aren't- they're shared by all objects of the class. Likewise, static methods affect static variables, and can't touch instance variables. It took me much longer than I'd like to admit to fully understand this concept.

With the help of the compiler and through a good amount of practice, you should be fine. After long enough, it just starts to make sense, and the errors will be caught, often just needing a keyword appended or deleted.

It's worth mentioning that instance methods can access and invoke instance and static variables and methods. Teachers love to quiz on that.


