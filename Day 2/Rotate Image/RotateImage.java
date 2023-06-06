class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int arr[][] = new int[n][m];
        for(int i =0; i<n;i++){
            for(int j=0; j<m; j++){
                arr[i][j] = matrix[n-j-1][i];
            }
        }

        for(int i =0; i<n;i++){
            for(int j=0; j<m; j++){
                matrix[i][j] = arr[i][j];
            }
        }
    }
}
