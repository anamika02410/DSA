package lecture_28;

public class no_2h {
    public static void main(String[] args) {
        int n=3;
  toss(n,"");
    }
    public static void toss(int n,String ans) {
        if (n == 0) {
            System.out.print(ans + " ");
            return;
        }
        if ( ans.length()==0 || ans.charAt(ans.length()-1) != 'H') {
            toss(n - 1, ans + "H");
        }
            toss(n - 1, ans + "T");

    }
}
