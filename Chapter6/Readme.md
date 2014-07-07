#Single Dimensional Arrays

You may have seen me use arrays in my solutions to problems from the last few chapters. Sorry to confuse you! Arrays are data types that can hold other variables and objects. You can have an array of ints, an array of strings, an array of objects, even an array of arrays. Arrays and data structures that can be represented by arrays are used to store massive amounts of data, and are easy to work with. 

Arrays are declared with a fixed size, for example `double[] numbers = new double[100];`. Guess how many empty cells there will be in the array? You can also declare an array literally like `double[] numbers = {3, 4.5, 6.1};`. I have also seen arrays declared in this format: `double[] numbers = new double[]{3, 4.5, 6.1}` but I have yet to be convinced of the merits of this method. Stick to the first two.

There are many useful methods that allow you to manipulate data into and within arrays. I've already used a few popular ones, though more will surface throughout this chapter.

Let's create an array of x randomely generated ints. Note that from here on out, I will greatly favor sharing methods rather than full classes when providing examples.
```
public static int[] randomArray(int size){
	//how to populate?
	//initializing it literally doesn't make sense
	int[] randomNumArray = new int[size];
	for (int i = 0; i < size; i++){
		randomNumArray[i] = (int)(Math.random()*101);
 	}
 	return randomNumArray;
}
```

###For-each

Don't think that you can get through an intro class without being asked to write some for-each loops. The syntax was something I struggled with and I don't frequently use the loop now. The for-each loop allows you to traverse a loop sequentially without using an index.

So, this:
```
for (int i = 0 i < intArray.length; i++){
	System.out.println(array[i]);
}
```
becomes this:
```
for (int i: intArray){
	System.out.prontln(i);
}
```

Are there restrictions? Sure. The syntax doesn't allow for much customization, including traversing the array in a different order. You also can't use a for-each loop to modify the contents of an array.

What I'm saying is that if you try to use a for each loop to populate an array, it won't work:
```
	public static int[] randomArray(int size){
		//how to populate?
		//initializing it literally doesn't make sense
		int[] randomNumArray = new int[size];
/*		for (int i = 0; i < size; i++){
			randomNumArray[i] = (int)(Math.random()*101);
	 	}*/
		for (int i: randomNumArray){ //this doesn't work
			i = (int)(Math.random()*101);
		}
	 	return randomNumArray;
	}
```

###Passing Arrays as arguments
When you pass an array as an argument, any changes made within the method persist outside of it. Let's revisit the random number array generator with this knowledge.
```
//Same functionality as "ArrayCreation" used to show how values are passed.
public class ArrayModification {
	public static void main(String[] args){
		int[] newArray = new int[150];
		randomArray(newArray);
		for (int i = 0; i < newArray.length; i++){
			System.out.println(newArray[i]);
		}
	}
	public static void randomArray(int[] array){
		for (int i = 0; i < array.length; i++){
			array[i] = (int)(Math.random()*101);
	 	}
	}
}
```
It works the exact same way. Note what's different and what hasn't changed.

#Searching and Sorting
Every intro class will have an assignment that revolves around searching (and sorting). This is where computer science starts to get technical. Efficiency is suddenly a major concern. You may be thinking, "if we're working with a list of ten elements, who cares how fast we search and sort it"? 

Understanding these algorithms (and I know you've been dying to hear that word) provides a glimpse into what can be accomplished by a good programmer. You'll be asked to reproduce and analyze algorithms in job interviews and, with further study, will see just how pervasive these mathematical processes are in all areas of study.

The term Brute-force is often used incorrectly. In the realm of Computer Science, it just means that you approach a problem exhaustively, meaning that you try everything. A brute-force password crack program would try every possible combination of numbers, letters, and symbols until a match was found. Imagine how long that takes.

How do we use "brute-force" to describe an approach to writing algorithms? Here's what I think: you want to search through an array but implement the most basic, fundamental, sequential search. It's inefficient, but it (probably) works, and, most importantly for someone who is just learning, *you* understand what's going on. I approached learning algorithms in a way such that I made sure I understood what needed to be done fundamentally before I tried to implement the most elegant solution. Furthermore, if you're considering using a more 'advanced' algorithm, it's important to understand *why* it is preferrable to use it.

As you are learning, try to approach algorithmic problems in a way that you understand and have internalized. Once it works, then try more efficient solutions. Let's begin, and, no, I'm not going to tell you how much time I spent on pages 245 - 252.

####Linear Search
This is inefficient, but it works, and it's very, very easy to understand:
```
public static int linearSearch(int[] list, int key){
	for (int i = 0; i < list.length; i++){
		if (key == list[i]){
			return i;
		}
	}
	return -1;
	}
```
The average case for finding the index will scan roughly half the index locations. That's fine for small applications, but scanning hundreds of thousands or millions of data elements? Things get sticky, and performance suffers.

####Binary Search
Binary search is incredibly more efficient. While the improvement isn't apparent in small lists, it is exponentially more efficient as lists grow in size.

The only caveat being that the numeric list must first be sorted in ascending order. That's easy, you may think, and you're right. The point, however, is that this search takes advantage of increased specificity of the problem. 

Think about the password cracker that tries every possible password combination. If we knew that the password used only lower case letters and one numeric digit, the algorithm could be adjusted accordingly. It is brute force's effectiveness when dealing with the complete unknown that makes it so impressive. Imagine that we additionally know the password is 7 characters ending with a single number. A human still could never figure it out, but the algorithm could be further optimized. Then, if we learned that the characters spelled out an english word or phrase, the time it would take to deduce the password would decay exponentially.

Visit https://howsecureismypassword.net/ for a more interactive look at what I'm trying to explain

What I'm saying is that Binary search is powerful, but its power is derived from a condition that isn't always (in fact, is almost never) inherently true. If you populate an array like we did above it wouldn't be sorted properly. Keep this in mind.

Here's binary search:
```
public static int binarySearch(int[] list, int key){
	int low = 0, high = list.length - 1;
	while (high >= low){
		int mid = (low + high) / 2;
		if (key < list[mid]){
			high = mid - 1;
		}
		else if (key == list[mid]){
			return mid;
		}
		else{
			low = mid + 1;
		}
	}
}
```

When possible, you should implement binary sort. I firmly believe that it's important to approach problems in a manner that you are comfortable with. As you get more experienced, implementing the algorithm will become second nature. Moreover, searching and sorting algorithms also exist as built-in methods that you can call. When you're tasking with implementing one, though, calling the built-in method typically won't fly.

####Selection Sort
```
public static void selectionSort(double[] list){
	for (int i = 0; i < list.length - 1; i++){
		double currentMin = list[i];
		int currentMinIndex = i;
			
		for (int j = i + 1; j < list.length; j++){
			if (currentMin > list[j]){
				currentMin = list[j];
				currentMinIndex = j;
			}
		}
			
		if (currentMinIndex != i){
			list[currentMinIndex] = list[i];
			list[i] = currentMin;
		}
	}
}
```

####Insertion Sort
```
public static void insertionSort(double[] list){
	for (int i = 1; i < list.length; i++){
		double currentElement = list[i];
		int k;
		for (k = i - 1; k >= 0 && list[k] > currentElement; k--){
			list[k + 1] = list[k];
		}
	}
}
```
