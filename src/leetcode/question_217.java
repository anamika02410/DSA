package leetcode;

import java.util.Scanner;

public class question_217 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[]arr={1,2,3,1};
        int[]nums={1,3,2,4};
        System.out.println(duplicate(nums));
        System.out.println(duplicate(arr));
    }
    public static boolean duplicate(int[]arr){
        for(int i=0;i<arr.length;i++){
            int val=arr[i];
            for(int j=1;j<arr.length;j++){
                if(arr[j]==val){
                    return true;
                }
                else{
                    i++;
                }
            }
        }
        return false;
    }
}
