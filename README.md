EllersAlgorithm
===============

Implementation of Eller's maze generation algorithm
For more information see www.neocomputer.org/projects/eller.html

Using
===============
```java
int w = 10, h = 10;
Cell[] result = new Cell[w * h];
EllersAlgorithm algo = new EllersAlgorithm(w, h);
for(int index = 0; index < h; index++) {
        Cell[] row = algo.step(index);
        for(int i = 0; i < w; i++) result[index * w + i] = row[i];
}
EllersAlgorithm.print(result, w, h);
```
Then you can use your cells array. For check cell use the Cell.getRight or Cell.getDown methods.

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
