class Solution {
    public boolean reachingPoints(int sx, int sy, int tx, int ty) {
        //Recursion
        //TLE
        // if(sx > tx || sy > ty){
        //     return false;
        // }
        // if(sx == tx && sy == ty){
        //     return true;
        // }
        // return reachingPoints(sx+sy, sy,tx, ty)|| reachingPoints(sx, sy+sx, tx, ty);
        
        //Optimized Solution
        //Using Modulous operation
        //We go from the result to the top in order to save time and instead of subtracting ty. = ty-tx we will use ty = ty%tx.
        //with just one condition i.e (tx - x) % y == 0 we can check if tx would reduce down to x or not.
      
      
        while(tx >= sx && ty >= sy){
            if(tx > ty) {
                if(sy == ty) return (tx - sx) % ty == 0;
                tx %= ty;
            }
            else {
                if(sx == tx) return (ty - sy) % tx == 0;
                ty %= tx;
            }
        }
        return false;
    }
}
