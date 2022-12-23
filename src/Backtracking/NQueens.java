package Backtracking;

public class NQueens {

    static boolean isSafe(char board[][] , int row , int col){
//        column loop
        for (int i = row-1; i>=0 ; i--) {
            if (board[i][col] == 'Q'){
                return false;
            }
        }
//        Diagonally left up
        for (int i = row -1 ,j=col-1; i>=0 && j>=0 ; i-- ,j--) {
            if (board[i][j] == 'Q'){
                return false;
            }
        }
//            Diagonally right up
        for (int i = row -1 ,j=col+1; i>=0 && j< board.length ; i-- ,j++) {
            if (board[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }


    public static void nQueens(char board[][] , int row){

        if(row == board.length){
            print(board);
            return;
        }
        // column loop
        for (int j = 0; j < board.length; j++) {
            if(isSafe(board , row ,j)) {
                board[row][j] = 'Q';
                nQueens(board, row + 1);// function call
                board[row][j] = 'X';//back tracking
            }
        }
    }


       static void print(char board[][]){
           System.out.println("----------------");
            for (int i = 0; i < board.length ; i++) {
                for (int j = 0; j < board.length; j++) {
                    System.out.print(board[i][j]);
                }
                System.out.println();
            }

        }

    public static void main(String[] args) {
        int n =4;
        char board[][] = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'X';
            }
        }
        nQueens(board , 0);

    }
}
