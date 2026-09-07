package leetcode;

import java.util.Scanner;

public class question_74 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [][]arr={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        System.out.println("enter the element you want to search");
        int target= sc.nextInt();
        System.out.println(search(arr,target));
    }
    public static boolean search(int[][]arr,int target){
        int r=0;
        int col=arr[0].length-1;
        while(r<arr.length && col>=0){
            if(arr[r][col]==target){
                return true;
            }
            else if(arr[r][col]<target){
                r++;
            }
            else{
                col--;
            }
        }
        return false;
    }
}
