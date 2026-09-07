package lecture_17;

import java.util.Scanner;

public class bad_version {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the total number of version");
        int n=sc.nextInt();
        isbad(6);
    }
    public static int isbad(int n){
        int lo=0;
        int hi=n;
        int ans=0;
        while(lo<=hi) {
            int mid = (lo + hi) / 2;
            if (isbadversion(mid) == true) {
                ans = mid;
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return ans;
    }
    public static boolean isbadversion(int mid){
        return false;
    }
}
