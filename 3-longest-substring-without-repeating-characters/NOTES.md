**Explanation:**
​
I/P = "abcabcbb"
​
1st pass:
abca then we remoce a from the strating so ans string bcms bca
​
2nd pass:
bcab then we remove b from the start so ans string bcms cab
​
3rd pass:
cabc, we remove c from the starting and we get abc
​
4th pass:
abcb, now here since we already have b in the hashset we remove a from the starting bcs anyway we can only have subtring thay they need to be contiguous so we remove a, and then we get bcb
​
5th pass:
here again b is repeated so we remove the b from the start and we are left with cb.
​
and so on....
​