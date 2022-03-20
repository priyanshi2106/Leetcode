class Solution {
    public boolean judgeCircle(String moves) {
       
      int x = 0, y = 0;
        char m[] = moves.toCharArray();
        for(int i = 0; i< m.length; i++){
            if(m[i] == 'U'){
                y++;
            }
            else if(m[i] == 'D'){
                y--;
            }
            else if(m[i] == 'L'){
                x--;
            }
            else if(m[i] == 'R'){
                x++;
            }
        }
        return x==0 && y==0;
        
    }
}