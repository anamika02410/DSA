package leetcode;

import java.util.Scanner;

public class shuffle_array1470 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=3;
        int[]nums={2,5,1,3,4,7};
        int[]ans=shuffle(nums,n);
        for(int i=0;i<ans.length;i++){
            System.out.println(ans[i]);
        }
    }
    public static int[] shuffle(int[]nums,int n){
        int[]ans=new int[2*n];
        int j=0;
        for(int i=0;i< ans.length;i++) {
            if (i % 2 == 0) {
                ans[i] = nums[j];
            } else {
                ans[i] = nums[j+ n];
                j++;
            }
        }

            return ans;
    }
}
