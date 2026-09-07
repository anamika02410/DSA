package lecture_13;

import java.util.Scanner;

public class rotate_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] nums={3,6,8,9,7};
        System.out.println("enter the number of steps");
        int k= sc.nextInt();
        rotate(nums,k);
        for(int i=0;i<nums.length;i++) {
            System.out.print(nums[i] + " ");
        }
    }
    public static void rotate(int[]nums,int k){
            int n=nums.length;
            //k=k%n;
            for(int j=1;j<=k;j++) {
                int last_ele = nums[n - 1];
                for (int i = nums.length - 2; i >= 0; i--) {
                    nums[i + 1] = nums[i];
                }
                nums[0] = last_ele;
            }

        }
    }

