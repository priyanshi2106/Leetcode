HashMap<Integer,Integer> hm = new HashMap<>();
for(int i = 0; i< nums.length; i++){
int curr = nums[i];
int x = target - curr;
if(hm.containsKey(x)){
return new int[]{hm.get(x),i};
}
hm.put(curr,i);
}
return null;