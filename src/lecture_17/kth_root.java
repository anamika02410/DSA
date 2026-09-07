package lecture_17;

import java.util.Scanner;

public class kth_root {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int k=sc.nextInt();
        System.out.println( root(n,k));
    }
    public static int root(int n,int k){
        int lo=0;
        int hi=n;
        int ans=0;
        while(lo<=hi) {
            int mid = (lo + hi) / 2;
            if (Math.pow(mid, k) <= n) {
                ans = mid;
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return ans;
    }
}
