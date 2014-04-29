EllersAlgorithm
===============

Implementation of Eller's maze generation algorithm
For more information see www.neocomputer.org/projects/eller.html

Using
===============
```java
int w = 10, h = 10;
EllersAlgorithm ea = new EllersAlgorithm(w, h);
Cell[][] cells = new Cell[h][w];
for(int i = 0; i < w; i++) {
  	cells[i] = ea.step(i);
}
```
Then you can use your cells array. For check cell use a Cell.getRight or Cell.getDown methods.

Result
===============
```java
 _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _
| | | |     | |_  |_    | | | | | |_    |
|   | | |_|_|     |_  |_  | | |   | | | |
| | | | | |_  |_|_| |   |   |   | |_  | |
|_| | |_   _ _| |_  |_| | |_| |_| |   | |
|  _   _    | | |_  | |_| |     |_| | | |
|   |_| | |    _    | | |_  | |  _| | | |
| |_|  _| | |_|_ _|_|_ _  | |_| | |_| |_|
|_      |_|_|_  | | |         |     |  _|
| | |_| |  _      | |_|_| |_| | | |  _  |
| | | |_   _| | |  _   _| |   | | |_|_  |
| |_|   | | | |_| |  _ _  | | | | | | |_|
|   | |_ _  |_| | |_|_   _| | |_| |     |
| |_|_|         | | |_  | | |  _|   | |_|
|   | |_|_| | | | |  _    |_|_| |_|_|   |
| |  _   _ _| |_| |  _| |     |      _| |
|_| |_ _| |   |   |_|_  | | |_| | | |  _|
| |_ _|    _| |_|  _  |_| |_|  _| | |_ _|
| | | | |_| |_  | | |   |   |_ _| |_   _|
|    _|    _| | | |   |_| |     |   | | |
|_|_ _ _|_ _|_ _|_|_|_|_ _|_|_|_|_|_|_ _|
```
