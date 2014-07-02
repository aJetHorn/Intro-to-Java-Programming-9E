You may be wondering why I'm putting this much effort into reviewing a textbook in which most of the coding problems have solutions provided. 

That is a good question.

#####Do I think I am more knowledgeable or more talented than the author? Speaking stricly about Java programming, the answer is no. However, I do believe I can be a more effective teacher. I am approaching this book as a self-proclaimed intermediate to accomplish several goals:

1. Gain additional experience with Java
2. Gain experience with Git
3. Provide a resource for students (especially students I tutor)
4. Create a library of effective and resuable code

This is my first attempt at what I hope will turn out to be a long series of educational repositories that also encourage collaboration. 

If you don't own the book- You should be able to follow along to a degree if this is your first time. If you are somewhat proficient with Java, all of the code provided will also provide the question and assorted notes.

There are a few things I don't like about this book. None are incredibly obvious to the absolute beginner. One of the things that I like the least is that the author wants you to use the command line. I'm not sure why a beginner would start with that rather than an Integrated Development Environment.

I suggested IntelliJ in the main readme, though Eclipse is also very popular. They are both free and are both powerful. You can program in the terminal environment using vim, emacs, or nano, but that isn't a great way to start learning. 

As time goes on, you will find that compiling and executing your programs from the terminal has a distinct set of benefits. Enough of that, let me give a quick summary of Chapter 1.

Before you even open the book, you'll want to have Java installed on your computer and your IDE ready to go. 

##Chapter 1 is an introductory chapter, and most college intro courses will skip it completely. Read through. Here's all you need to worry about until later in your programming journey:

1. Bits, bytes, storage, and memory optimization used to be important to programmers. The situation isn't nearly as life-or-death as it once was, though we strive for efficiency and to maximize readability.

2. What the hell are those 1's and 0's? Binary digits: on/off, yes/no, true/false; binary numbers are the foundation of modern (and, ultimately, all) computing, but they don't always come into play in an intro class.

3. Programming languages: machine language is binary code, assembly language consists of somewhat understandable basic commands that then are translated to binary, and high-level languages are closest to human language but then is intrepreted and compiled into machine code.

4. Java is a high-level language. It is easy to read and easy to write, especially as you 
spend more time working with it. Other popular languages used in colleges are C++ and Python for classes of similar scope, Javascript and PHP for classes focusing on web development, and C for classes based around low-level applications such as hardware interaction.

5. Should I learn as many programming languages as possible in order to get a job? No. Lucky for you, Java is extremely popular. It makes a great first language. The ideal first language, in my opinion, is C, but it is significantly more frustrating for a beginner to learn. Most colleges will start off with C++ or Java, or in rare cases, Python. Most employers are just looking for a talented programmer who fits the job description. You aren't wasting your time learning Java.

6. The API defines the library of Java classes and interfaces. I know the layout of the library doesn't make things fun, but it gets easier once you use it more. You will be using it quite a bit.

7. Let's get coding.

```
public class Chapter1 {
	public static void main(String[] args) {
		System.out.println("Hello, World!");
		System.out.println("This is my first Java Program");
   }  
}
```

	//http://upload.wikimedia.org/wikipedia/en/d/d3/Tiobe_index.png

