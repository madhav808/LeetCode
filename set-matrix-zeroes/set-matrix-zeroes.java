class Solution {
    public void setZeroes(int[][] matrix) {
        boolean[] row = new boolean[matrix.length];
        boolean[] column = new boolean[matrix[0].length];
        for(int i=0; i < matrix.length; i++){
            for(int j=0; j < matrix[i].length; j++){
                if(matrix[i][j] == 0){
                    row[i] = true;
                    column[j] = true;
                }
            }
        }
        
        for(int i = 0; i < row.length; i++) {
            if(row[i]){
                
                for(int j=0; j < matrix[0].length; j++){
                    matrix[i][j] = 0;
                    if(i==3){
                   
                }
                }
            }
        }
        
         for(int i = 0; i < column.length; i++) {
            if(column[i]){
                for(int j=0; j < matrix.length; j++){
                    matrix[j][i] = 0;
                }
            }
        }
        
        
        
        
    }
}