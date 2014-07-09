#Multidimensional Arrays

Arrays get deeper- Two dimensions, three dimensions, x dimensions. It can get crazy. Luckily, with a solid understanding of one dimensional arrays, nothing here is too difficult. It's worth mentioning that you won't be able to get out of an intro course without being assigned a program that deals with 2d arrays. Emulating various games seems to be a popular choice.

This is a 2d array `int[][] matrix = new int[5][5];`. Picture it as a 5x5 grid- that's what it is. If a data set can be represented as a grid/graph, a 2d array can (probably) do it.

##Visualization
1d arrays aren't complex enough to warrant visualization. How do you picture a 1d array in your mind? It's a line. There's nothing to picture. A 2d is a grid, x and y or row and column are commonly used. For beginners, working with a 2d array can get confusing just due to the added complexity. I recommend visualizing the graph, and visualizing it consistently. Though how you imagine something doesn't have any effect on the function of the program, it will greatly benefit your understanding of the concepts, especially as they are still new to you.

A popular method is to picture the 0th row, or origin row, at the top, and then picture each column descending from each location on the 0th row [0][i]. Here, the first location represents the row, and the second represents the column.

Another way is to picture it like the first quadrant of a graph. the origin is in the bottom left, rather than the top left. There aren't any negative index locations, so this stays just as simple as the first method. Some people just find it easier work with this mental model.

##Working with 2d arrays
You're probably finding this simple- great. I don't have too much to say. Nested for loops are how you're going to traverse these arrays.
```
for (int i = 0; i < matrix.length; i++){
	for (int j = 0; j < matrix[i].length; j++){
		System.out.println();
	}
}
```
###Multidimensional
Anything greater than a 2d array is considered multidimensional. A 3d array can be pictured as a cube, a 2d grid with depth. 4d, well, I think of a cube with each cell having a diagonal offshoot that isn't parallel to any plane, but that doesn't scale properly when imagining the entire shape. 

###Literal Initialization
```
int[][] grid = {{1,2,3}
{4,5,6}
{7,8,9}}
```

Believe it or not, that's about it. Let's try some practice problems.