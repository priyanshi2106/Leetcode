//first sort the array
Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
LinkedList<int[]> merged = new LinkedList<>();
for(int[] interval: intervals){
//check if already esistes or not
//Also if it exists then check if the first value of 2nd element is greater than the 2nd value of first element
if(merged.isEmpty() || merged.getLast()[1] < interval[0]){
merged.add(interval);
}
else{
//update the last value of 1st element with the first value of 2nd element
merged.getLast()[1] = Math.max(merged.getLast()[1], interval[1]);
}
}
return merged.toArray(new int[merged.size()][]);