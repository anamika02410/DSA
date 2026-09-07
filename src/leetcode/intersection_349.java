package leetcode;

import java.util.Scanner;

public class intersection_349 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[]nums1={1,2,2,1};
        int[]nums2={2,2};
        int[]ans=intersection(nums1,nums2);
            for(int i=0;i<ans.length;i++){
                System.out.println(ans[i]);
        }
    }
    public static int[] intersection(int[]nums1,int[]nums2){
        int n1= nums1.length;
        int n2= nums2.length;
        int n3=Math.min(n1,n2);
        int[]ans=new int[n3];
        for(int i=0;i< ans.length;i++){
            for(int j=0;j<nums1.length;j++) {
                for (int k = 0; k < nums2.length; k++) {
                    if (nums1[j] == nums2[k]) {
                        ans[i] = nums1[j];
                    }
                }
            }
        }
        return ans;
    }
}
