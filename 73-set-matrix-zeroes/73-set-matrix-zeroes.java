class Solution {
    public void setZeroes(int[][] matrix) {
        //T: O(mn)
        //S: O(m+n)
//         int r = matrix.length;
//         int c = matrix[0].length;
//         Set<Integer> rows = new HashSet<>();
//         Set<Integer> col = new HashSet<>();
        
//         for(int i = 0; i < r; i++){
//             for(int j = 0; j < c; j++){
//                 if(matrix[i][j] == 0){
//                     rows.add(i);
//                     col.add(j);
//                 }
//             }
           
//         }
//          for(int i = 0; i < r; i++){
//                 for(int j = 0; j < c; j++){
//                     if(rows.contains(i) || col.contains(j)){
//                         matrix[i][j] = 0;
//                     }
//                 }
                
//             }
            
        //Space efficient solution?
        //T: O(mn)
        //S: O(1)
        Boolean col0 = false;
        int row = matrix.length;
        int col = matrix[0].length;
        
        for(int i = 0; i < row; i++){
            //first check if any of the first element of each row is 0?
            if(matrix[i][0] == 0){
                col0 = true; //that means 0 is present at the a[0][0] pos
            }
            for(int j = 1; j < col; j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] = matrix[0][j] = 0;
                }
            }
        }
        
        // change the values
        for(int i = 1; i < row; i++){
            for(int j = 1; j < col; j++){
                if(matrix[i][0] == 0 || matrix[0][j] == 0){
                    matrix[i][j] = 0;
                }
            }
            
        }
         //check if first row needs to be set to 0?
        if(matrix[0][0] == 0){
            for(int j = 0; j < col; j++){
                matrix[0][j] = 0;
            }
        }
        //Check if the first row needs to be set to 0 as well
        if(col0 == true){
            for(int i = 0; i < row; i++){
            matrix[i][0] = 0;
        } 
        }
       
        
       
        
    }
}