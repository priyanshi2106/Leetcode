int[] startArr = new int[intervals.length];
int[] endArr = new int[intervals.length];
for(int i = 0;i<intervals.length;i++){
startArr[i] = intervals[i][0];
endArr[i] = intervals[i][1];
}
Arrays.sort(startArr);
Arrays.sort(endArr);
int i = 0;
int j = 0;
// stand for current room number
int room = 0;
while(i< intervals.length && j < intervals.length){
if(startArr[i] < endArr[j]){
room++;
i++;
}else{
// no need to increase room
i++;
j++;
}
}
return room;