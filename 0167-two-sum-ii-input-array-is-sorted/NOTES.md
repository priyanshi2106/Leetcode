int i = 0;
int j = numbers.length-1;
int ans[] = new int[2];
if(numbers.length == 0){
return ans;
}
while(i < j){
int sum = numbers[i] + numbers[j];
if( sum == target){
return new int[]{i+1, j+1};
}
else if(sum < target){
i++;
}
else{
j--;
}
}
return new int[]{-1,-1};