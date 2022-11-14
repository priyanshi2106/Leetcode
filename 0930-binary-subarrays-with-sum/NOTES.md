public int numSubarraysWithSum(int[] A, int S) {
return atmost(A, S)  - atmost(A, S-1);
}
public int atmost(int[] A, int S)
{
int l = 0 , r = 0 , count = 0, num = 0;
while(r < A.length)
{
count = count + A[r];
while(l <= r && count > S)
{
count = count - A[l];
l++;
}
num = num + (r-l);
r++;
}
return num;