class NumMatrix {
    int prefix [][];

    public NumMatrix(int[][] matrix) {
       prefix  = new int[matrix.length][matrix[0].length];
        for(int i=0;i<matrix.length;i++){
          for(int j=0;j<matrix[0].length;j++)  {
                 
        if (i == 0 && j == 0) {
            // Top-left corner, just keep original value
            prefix[i][j] = matrix[i][j];
        } else if (i == 0) {
            // First row, only add from left
            prefix[i][j] = matrix[i][j] + prefix[i][j-1];
        } else if (j == 0) {
            // First column, only add from above
            prefix[i][j] = matrix[i][j] + prefix[i-1][j];
        } else {
            // Regular case, use full formula
            prefix[i][j] = matrix[i][j] + prefix[i-1][j] + prefix[i][j-1] - prefix[i-1][j-1];
}
            }
        }
       
        
    }
    
   
    public int sumRegion(int row1, int col1, int row2, int col2) {
     int sum = prefix[row2][col2];
if (row1 > 0) sum -= prefix[row1-1][col2];
if (col1 > 0) sum -= prefix[row2][col1-1];
if (row1 > 0 && col1 > 0) sum += prefix[row1-1][col1-1];
return sum;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */