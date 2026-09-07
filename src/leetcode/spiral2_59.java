package leetcode;

import java.util.Scanner;

public class spiral2_59 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][]ans=spiral(n);
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.println(ans[i][j]);
            }
        }
    }
    public static int[][] spiral(int n) {
        int[][] ans = new int[n][n];
        int minr = 0;
        int minc = 0;
        int maxr = ans.length - 1;
        int maxc = ans[0].length - 1;
        int num = 1;
        while (num <= n * n) {
            for (int j = minr; j <= maxc && num < n * n; j++) {
                ans[minr][j] = num++;
            }
            minr++;
            for (int j = minr; j <= maxr && num <n * n; j++) {
                ans[j][maxc] = num++;
            }
            maxc--;
            for (int j = maxc; j >= minc && num <n * n; j--) {
                ans[maxr][j] = num++;
            }
            maxr--;
            for(int i=maxr;i>=minr && num<n*n;i++){
                ans[i][minc]=num++;
            }
            minc++;
        }

        return ans;
    }
}
