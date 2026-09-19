package lecture_32;

public class queen_permutation {
    public static void main(String[] args) {
        int n=4;
        int q=2;
        boolean []board=new boolean[n];
        print(board,q,0,"");
    }
    public static void print(boolean[]board,int q,int cq,String ans){
        if(q==cq){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<board.length;i++){
            if(board[i]==false){
                board[i]=true;
                print(board,q,cq+1,ans+"b"+i+"q"+cq);
                board[i]=false;
            }
        }

    }
}
