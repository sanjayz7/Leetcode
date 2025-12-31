class Solution {
    public List<List<String>> solveNQueens(int n) {
List<List<String>> ans =new ArrayList<>();
        char [][] chessboard = new char[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(chessboard[i],'.');
        }
        nQueen(chessboard,0,ans);
        //ans.add(printChess(chessboard));
        return ans;
    }
    public static void nQueen(char[][] board,int row, List<List<String>> ans){
        if(row == board.length){
            ans.add(printChess(board));
        return;
        }
        for(int col=0;col<board.length;col++){
            if(isSafe(board,row,col)){
                board[row][col]='Q';
                nQueen(board,row+1,ans);
                board[row][col]='.';
            }
        }
    }
   
    public static List<String> printChess(char[][] board) {
    List<String> list = new ArrayList<>();
    
    for (char[] row : board) {
       
     
        list.add(new String(row));
    }

    return list; // ✅ Return the final list
}

    public static boolean isSafe(char[][]board,int row,int col){
        for(int i=0;i<row;i++){
            if(board[i][col]=='Q') return false;
        }
        //upper-left diagonal
         for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--){
            if(board[i][j]=='Q') return false;
        }
        for(int i=row-1,j=col+1;i>=0&&j<board.length;i--,j++){
              if(board[i][j]=='Q') return false;
        }
        return true;
    }


}