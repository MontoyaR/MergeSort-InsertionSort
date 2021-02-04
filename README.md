# Assignment-01

## Instructions
You are to implement two sorting algorithms:

-   _Insertion sort_
-   _Merge sort_

-   Your program must take the input from a file and write the output to a file. Use appropriate naming conventions.
-   You must not reuse the implementations of these algorithms from other sources. The implementation must be yours. You cannot use code written by others, including seeking free and/or paid services from others (e.g., Course Hero). It is an individual assignment, and no group work is expected or will be accepted.
-   There is no specific programming-language requirement for this assignment.
-   You must chart the (time) performance of each of these algorithms for 10, 100, 1000, 10,000, 100,000, and 1,000,000 randomly generated input keys. The generation of keys should be automatic (e.g., via a random number generator) and stored in the input files (e.g.,  _10.keys.txt_  and  _output.insertionSort.10.keys.txt_). Storing in binary files is also acceptable.
-   You need to plot three different charts for the following input configurations for at least 5 runs:
    -   The input keys are already sorted in ascending order
    -   The input keys are already sorted in descending order
    -   The input keys are in random order

It is recommended to chart on a log scale. You can do it programmatically or using tools such as MS Excel.

Save the input and output files for each configuration and each algorithm.

-   Compare the recorded performances (time measurements) with their theoretical growth rates, i.e., “Big-oh” complexities.
-   If you run out of resources for a specific configuration (e.g., out of memory for 1,000,000 keys), it should be noted and submitted.


## Algorithm Performance
| Run | Time (sec) | File                                         |
|-----|------------|----------------------------------------------|
| 1   | 8.4E-6     | 10.random.keys.MergeSort.txt                 |
| 2   | 5.1E-5     | 100.random.keys.MergeSort.txt                |
| 3   | 5.368E-4   | 1000.random.keys.MergeSort.txt               |
| 4   | 0.0015796  | 10000.random.keys.MergeSort.txt              |
| 5   | 0.0196397  | 100000.random.keys.MergeSort.txt             |
| 6   | 0.1052271  | 1000000.random.keys.MergeSort.txt            |

![](https://github.com/MontoyaR/MergeSort-InsertionSort/blob/master/src/Logarithmic%20Charts/Merge%20Sort%20for%20Random%20Keys.png)

| Run | Time (sec) | File                                         |
|-----|------------|----------------------------------------------|
| 1   | 1.14E-5    | 10.random.ascending.keys.MergeSort.txt       |
| 2   | 1.378E-4   | 100.random.ascending.keys.MergeSort.txt      |
| 3   | 7.393E-4   | 1000.random.ascending.keys.MergeSort.txt     |
| 4   | 0.0026526  | 10000.random.ascending.keys.MergeSort.txt    |
| 5   | 0.0171931  | 100000.random.ascending.keys.MergeSort.txt   |
| 6   | 0.0531297  | 1000000.random.ascending.keys.MergeSort.txt  |

![](https://github.com/MontoyaR/MergeSort-InsertionSort/blob/master/src/Logarithmic%20Charts/Merge%20Sort%20for%20Random%20Ascending%20Keys.png)

| Run | Time (sec) | File                                         |
|-----|------------|----------------------------------------------|
| 1   | 7.1E-6     | 10.random.descending.keys.MergeSort.txt      |
| 2   | 3.99E-5    | 100.random.descending.keys.MergeSort.txt     |
| 3   | 0.0013772  | 1000.random.descending.keys.MergeSort.txt    |
| 4   | 0.0019207  | 10000.random.descending.keys.MergeSort.txt   |
| 5   | 0.0124113  | 100000.random.descending.keys.MergeSort.txt  |
| 6   | 0.0774013  | 1000000.random.descending.keys.MergeSort.txt |

![](https://github.com/MontoyaR/MergeSort-InsertionSort/blob/master/src/Logarithmic%20Charts/Merge%20Sort%20for%20Random%20Descending%20Keys.png)

| Run | Time (sec) | File                                         |
|-----|------------|----------------------------------------------|
| 1   | 4.0E-6     | 10.random.keys.InsertionSort.txt             |
| 2   | 3.63E-5    | 100.random.keys.InsertionSort.txt            |
| 3   | 0.00396    | 1000.random.keys.InsertionSort.txt           |
| 4   | 0.0120928  | 10000.random.keys.InsertionSort.txt          |
| 5   | 0.7183386  | 100000.random.keys.InsertionSort.txt         |
| 6   | 69.9760599 | 1000000.random.keys.InsertionSort.txt        |

![](https://github.com/MontoyaR/MergeSort-InsertionSort/blob/master/src/Logarithmic%20Charts/Insertion%20Sort%20for%20Random%20Keys.png)

| Run | Time (sec) | File                                            |
|-----|------------|-------------------------------------------------|
| 1   | 2.2E-6     | 10.random.ascending.keys.InsertionSort.txt      |
| 2   | 3.7E-6     | 100.random.ascending.keys.InsertionSort.txt     |
| 3   | 3.3E-5     | 1000.random.ascending.keys.InsertionSort.txt    |
| 4   | 3.111E-4   | 10000.random.ascending.keys.InsertionSort.txt   |
| 5   | 0.0026989  | 100000.random.ascending.keys.InsertionSort.txt  |
| 6   | 0.0040164  | 1000000.random.ascending.keys.InsertionSort.txt |

![](https://github.com/MontoyaR/MergeSort-InsertionSort/blob/master/src/Logarithmic%20Charts/Insertion%20Sort%20for%20Random%20Ascending%20Keys.png)

| Run | Time (sec) | File                                             |
|-----|------------|--------------------------------------------------|
| 1   | 2.7E-6     | 10.random.descending.keys.InsertionSort.txt      |
| 2   | 7.08E-5    | 100.random.descending.keys.InsertionSort.txt     |
| 3   | 0.0060629  | 1000.random.descending.keys.InsertionSort.txt    |
| 4   | 0.0228513  | 10000.random.descending.keys.InsertionSort.txt   |
| 5   | 1.5202953  | 100000.random.descending.keys.InsertionSort.txt  |
| 6   | 138.803165 | 1000000.random.descending.keys.InsertionSort.txt |

![](https://github.com/MontoyaR/MergeSort-InsertionSort/blob/master/src/Logarithmic%20Charts/Insertion%20Sort%20for%20Random%20Descending%20Keys.png)

## Analysis

Based on the result shown on the first logarithmic chart and from the table, the Merge Sort
algorithm time complexity is equivalent to the expected time complexity of Θ(n log(n)). The time
complexity for the best, average, or worst-case scenario remain the same. The same is true whether the
keys are is ascending or descending order. 

From my understanding, the average time complexity for Insertion Sort algorithm is Θ(n^2) which
is most similar to the Insertion Sort for random ascending keys and less similar to the descending keys. The
best time complexity for the Insertion Sort algorithm is O(n) when it swaps elements if they are out of order
without triggering the inner loop. This is most similar to the Insertion Sort for random keys chart. 
