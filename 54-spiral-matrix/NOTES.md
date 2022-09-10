List<Integer> ans = new LinkedList<>();
int left = 0;
int right = matrix[0].length-1;
int up = 0;
int down = matrix.length-1;
int m = matrix.length, n = matrix[0].length;
int size = m*n;
if(matrix.length == 0 || matrix[0].length == 0 || matrix == null){
return ans;
}
while(ans.size() < size){
//left to right
for(int i = left; i <= right && ans.size() < size; i++){
ans.add(matrix[up][i]);
}
up++;
//top to bottom
for(int i = up; i <= down && ans.size() < size; i++){
ans.add(matrix[i][right]);
}
right--;
//right to left
for(int i = right; i >= left && ans.size() < size ;i-- ){
ans.add(matrix[down][i]);
}
down--;
//down to up
for(int i = down; i >= up && ans.size() < size; i--){
ans.add(matrix[i][left]);
}
left++;
}
return ans;