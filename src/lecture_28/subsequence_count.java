package lecture_28;

public class subsequence_count {
    public static void main(String[] args) {
        String ques="abc";
        String ans="";
        sequence(ques,ans);
        System.out.println(count);
    }
    static int count=0;
    public static void sequence(String ques,String ans){
        if(ques.length()==0){
            System.out.print(ans+" ");
            count++;
            return;
            //System.out.println(count++);
        }
        char ch=ques.charAt(0);
        sequence(ques.substring(1),ans);
        sequence(ques.substring(1),ans+ch);
    }
}
