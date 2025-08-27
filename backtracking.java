public class backtracking {
    //find subsets
    public static void subsets(String str, int i, String ans){
        //base case
        if(i==str.length()){
            System.out.println(ans);
            return;
        }
        char ch= str.charAt(i);
        //yes
        subsets(str,i+1,ans+ch);
        //no
        subsets(str,i+1,ans);
    }
    // find permutations
    
    public static void permutations(String str, String ans){
        //base case
        if(str.length()==0){
            System.out.println(ans);
            return;
        }

        for(int i=0;i<str.length();i++){
            char curr= str.charAt(i);
            String newStr=str.substring(0, i)+str.substring(i+1);
            permutations(newStr, ans+curr);
        }
    }
    // N Queens
    static int count=0;
    public static void printBoard(char board[][]){
        System.out.println("------Chess Board------");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void nQueens(char board[][],int row){
        if(row==board.length){
            printBoard(board);
            count++;
            return;
        }
        for(int j=0;j<board.length;j++){
            if(isSafe(board,row,j)){
                board[row][j]='Q';
                nQueens(board, row+1);
                board[row][j]='X';  // backtracking step
            }
            
        }
    }
    public static boolean isSafe(char board[][],int row,int col){
        //vertical up
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        // diag left up
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        //diag right up
        for(int i=row-1,j=col+1;i>=0&&j<board.length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
    // Grid ways
    public static int gridWays(int i,int j,int n,int m){
        if(i==n-1 && j==m-1){
            return 1;
        }
        else if(i==n || j==m){
            return 0;
        }
        int w1= gridWays(i+1, j, n, m);
        int w2=gridWays(i, j+1, n, m);
        return w1+w2;
    }
    
    
    public static void main(String args[]){
        // String str= "abc";
        // subsets(str, 0, "");
        // permutations(str, "");
        // int n=4;
        // char board[][]=new char[n][n];
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n;j++){
        //         board[i][j]='X';
        //     }
        // }
        // nQueens(board, 0);
        // System.out.println("total ways to place"+" " +n +" "+"Queens are:"+ count);
        // int n=3,m=3;
        // System.out.println(gridWays(0, 0, n, m));
    //     int sudoku[][]={{5,3,0,0,7,0,0,0,0},
    //                     {6,0,0,1,9,5,0,0,0},
    //                     {0,9,8,0,0,0,0,6,0},
    //                     {8,0,0,0,6,0,0,0,3},
    //                     {4,0,0,8,0,3,0,0,1},
    //                     {7,0,0,0,2,0,0,0,6},
    //                     {0,6,0,0,0,0,2,8,0},
    //                     {0,0,0,4,1,9,0,0,5},
    //                     {0,0,0,0,8,0,0,7,9}}; 
      
    }

}
