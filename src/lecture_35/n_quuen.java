package lecture_35;

public class n_quuen {
    public static void main(String[] args) {
        int n=4;
        boolean[][]board=new boolean[n][n];
        queen(board,0,n);
    }


public static void queen(boolean[][]board,int row,int tq) {
    if (tq == 0) {
        display(board);
        return;
    }
    for (int col = 0; col < board.length; col++) {
        if (isitSafe(board, row, col)) {
            board[row][col] = true;
            queen(board, row + 1, tq - 1);
            board[row][col] = false;
        }
    }
}
        public static void display(boolean[][]board){
           for(int i=0;i< board.length;i++){
               for(int j=0;j<board[0].length;j++){
                   System.out.print(board[i][j]+" ");
               }
               System.out.println();
           }
            System.out.println();
    }
    public static boolean isitSafe(boolean[][]board,int row,int col){
       int r=row;
       while(r>=0){
           if (board[r][col] == true) {
               return false;
           }
           r--;
       }
       r=row;
       int c=col;
       while(r>=0 && c>=0){
           if(board[r][c]==true){
               return false;
           }
           r--;
           c--;
       }
       r=row;
       c=col;
       while(r>=0 && c< board.length){
           if(board[r][c]==true){
               return false;
           }
           r--;
           c++;
       }
       return true;
    }
}


