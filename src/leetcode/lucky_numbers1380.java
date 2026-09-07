package leetcode;

import java.util.Scanner;

public class lucky_numbers1380 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][]matrix={{3,7,8},{9,11,13},{15,16,17}};
        int[]ans=lucky(matrix);
        for(int i=0;i< ans.length;i++){
            System.out.println(ans[i]);
        }
    }
    public static int[] lucky(int[][]matrix){
        int[]ans=new int[matrix.length];
        int minr=0;
        int minc=0;
        int maxr=matrix.length-1;
        int maxc=matrix[0].length-1;
        for(int i=0;i<=maxc;i++){
            int min=matrix[minr][minc];
            int max=matrix[minr][minc];
                if(matrix[minr][i]<min && matrix[i][minc]>max){
                    min=matrix[minr][i];
                    max=matrix[i][minc];
                    ans[i]=min;
                    minr++;
                    minc++;
            }
        }
        return ans;
    }
}
