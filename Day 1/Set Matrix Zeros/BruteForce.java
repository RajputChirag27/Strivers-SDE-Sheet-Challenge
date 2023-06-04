class Solution {
     static void markRow(int [][] matrix, int m, int n, int i){
    for(int j=0; j<m; j++){
        if(matrix[i][j]!= 0){
            matrix[i][j] = -1234567;
        }
    }
}

 static void markColumn(int [][] matrix, int m, int n, int j){
    for(int i=0; i<n; i++){
       if(matrix[i][j]!= 0){
            matrix[i][j] = -1234567;
        } 
    }
}
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        for(int i=0; i<n; i++){        
            for(int j=0; j<m; j++){
                if(matrix[i][j] == 0){
                   markRow(matrix, m , n, i);
                   markColumn(matrix, m , n, j);
                }
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                    if(matrix[i][j] == -1234567){
                        matrix[i][j] = 0;
                    }
            }
        }
    }
    }
