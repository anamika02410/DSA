package lecture_28;

public class board_path {
    public static void main(String[] args) {
        int n=4;
        path(n,0,"");
    }
    public static void path(int n,int current,String ans){
        if(current==n){
            System.out.print(ans+" ");
            return;
        }
        if(current>n){
           return;
        }
        path(n,current+1,ans+1);
        path(n,current+2,ans+2);
        path(n,current+3,ans+3);
    }
}
