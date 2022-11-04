[3,6,9,12]
​
we will be making a HashMap of Arrays for all the elements of this array and it will store the diff of this currElemennt with the prev numbers in this array and the value pair would be the number of times you have seen this diff in the Hashmap of that prev element plus 1. And then we will be taking out the maxValue from this HashMap and updating it regularly.
​
[[:], [3 : 1],[6 : 1, 3 : 2],[9 : 1, 6 : 1, 3 : 3]]
​
we see that diff 3 occurs the most number of time so that plus 1 ( accounting for the case that we need 4 numbers to get a diff 3 times)