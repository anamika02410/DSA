package lecture_28;

public class coin_tossing {
    public static void main(String[] args) {
      int n=3;
      toss(n,"");
    }
    public static void toss(int n,String ans){
        if(n==0){
            System.out.print(ans+" ");
            return;
        }
        toss(n-1,ans+"H");
        toss(n-1,ans+"t");
    }
}
