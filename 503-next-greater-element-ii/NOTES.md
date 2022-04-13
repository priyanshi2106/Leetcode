The stack will store the index of numbers from nums
Basically we are checking if the number in the index which is in stack is less than the number which is at the index (i%n) then we will store the element at (i%n) in the ans at index st.pop().
n=5
if i = 0 and n*n=10
1%5 = 1
2%5 = 2
:
:
5%5 = 0
6%5 = 1