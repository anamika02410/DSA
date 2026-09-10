package lecture_30;

public class path_print {
    public static void main(String[] args) {
        int[][]matrix=new int[2][2];
        path(matrix,0,0,"");
    }
    public static void path(int[][]matrix,int v,int h,String ans){
        if(v==matrix.length && h==matrix[0].length){
            System.out.println(ans);
            return;
        }
        if(v< matrix.length){
            path(matrix,v+1,h,ans+"v");
        }
        if(h<matrix[0].length){
            path(matrix,v,h+1,ans+"h");
        }
    }
}
