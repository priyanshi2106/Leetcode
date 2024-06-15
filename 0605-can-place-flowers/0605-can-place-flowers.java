class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        for(int i = 0; i < flowerbed.length; i++) {
            if(flowerbed[i] == 0){
                boolean emptyLeftSpace = (i==0) || (flowerbed[i-1] ==0);
                boolean emptyRightSpace = (i == flowerbed.length-1) || (flowerbed[i+1] == 0);
                if(emptyRightSpace && emptyLeftSpace) {
                    count++;
                    flowerbed[i] = 1;
                    if(count >=n ){
                        return true;
                    }
                }
            }
        }
        return count >=n;
    }
}